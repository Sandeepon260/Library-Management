package BookRequestQueueAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass2 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        request.BookRequest bookRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass3 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass4 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        java.lang.Class<?> wildcardClass1 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass5 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass6 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass7 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass8 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass10 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass9 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass11 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass13 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass12 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass15 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass14 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass17 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass16 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass18 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass19 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass20 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass21 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest23 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass24 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass22 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest24 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass23 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest25 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass25 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass26 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest26 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest27 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass28 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest28 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest30 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest29 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass29 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass30 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass32 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest32 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass31 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass27 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass33 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass34 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest33 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest34 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest35 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest31 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass35 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass36 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest37 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass37 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest36 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest38 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass39 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest39 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass38 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass40 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest40 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass41 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass42 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest41 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest42 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest44 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest43 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass43 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest46 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest47 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass45 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest45 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass44 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass46 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass48 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass47 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest49 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest50 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass49 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest48 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass50 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest51 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass51 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest53 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass55 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass54 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest52 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass52 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest55 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest54 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass53 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass57 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest57 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest58 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest56 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass58 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest60 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass60 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass56 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass59 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest59 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest61 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass61 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest64 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest62 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest63 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass62 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest65 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass65 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass63 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest66 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass66 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass64 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest67 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest68 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest69 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass69 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass67 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass71 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass72 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest70 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest72 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass70 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest71 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest73 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest74 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass73 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest77 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass77 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass74 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest75 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest76 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass68 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest78 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass76 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest79 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass79 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass75 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass80 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass81 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest80 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest81 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass83 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest82 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass82 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest84 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest83 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass78 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass84 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass85 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass87 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass86 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest85 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass88 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest86 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest87 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest89 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest88 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass89 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest90 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass92 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest91 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass91 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest92 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass90 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass94 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest94 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass93 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest93 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest95 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass95 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass96 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass97 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest97 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest96 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass98 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        request.BookRequest bookRequest98 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookRequestQueue0.addBookRequest(bookRequest98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        java.lang.Class<?> wildcardClass99 = bookRequestQueue0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        request.BookRequestQueue bookRequestQueue0 = new request.BookRequestQueue();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
        bookRequestQueue0.processRequests();
    }
}

