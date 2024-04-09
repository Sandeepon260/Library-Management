package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class libraryTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        library0.returnItem((-1));
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) -1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem(0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        library0.returnItem((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.disableRental(100);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) -1);
        library0.returnItem((int) (short) 0);
        library0.returnItem(100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 0);
        library0.disableRental((int) 'a');
        library0.returnItem((int) '#');
        library0.disableRental(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) '#');
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.returnItem((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem(100);
        library0.disableRental((int) 'a');
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) -1);
        library0.enableRental((int) 'a');
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) '4');
        library0.returnItem((int) '#');
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        library0.returnItem(10);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((-1));
        library0.returnItem((int) (short) -1);
        library0.returnItem((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(100);
        library0.disableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) 'a');
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        library0.returnItem((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        library0.returnItem((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById(1);
        library0.enableRental((int) (short) -1);
        library0.enableRental(0);
        library0.enableRental((int) 'a');
        library0.enableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem16 = library0.findItemById(1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 100);
        library0.enableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.enableRental((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 0);
        library0.disableRental((int) 'a');
        library0.returnItem((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem24 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        library0.enableRental(100);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.disableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) 'a');
        library0.enableRental((-1));
        library0.disableRental((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        library0.enableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem22 = library0.findItemById(10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.enableRental(0);
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 1);
        library0.enableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (short) 0);
        library0.disableRental((int) (short) -1);
        library0.enableRental(0);
        items.LibraryItem libraryItem22 = library0.findItemById((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (short) 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        library0.returnItem(0);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (byte) 1);
        library0.returnItem(10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        library0.enableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) 'a');
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 1);
        library0.disableRental((-1));
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) -1);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) 'a');
        library0.returnItem((int) '#');
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (byte) -1);
        library0.returnItem((-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (short) 10);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        library0.enableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) '#');
        library0.returnItem((int) '#');
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.disableRental((int) 'a');
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem(10);
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental((-1));
        items.LibraryItem libraryItem18 = library0.findItemById(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(10);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) ' ');
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        library0.disableRental(0);
        items.LibraryItem libraryItem14 = library0.findItemById((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = libraryItem12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        library0.returnItem(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) -1);
        library0.returnItem(1);
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 1);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem20 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.enableRental((-1));
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem22 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem((-1));
        library0.returnItem((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem16 = library0.findItemById(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = libraryItem16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) '4');
        library0.returnItem(0);
        items.LibraryItem libraryItem20 = library0.findItemById(10);
        library0.enableRental(100);
        library0.enableRental((int) (short) -1);
        library0.returnItem((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        library0.returnItem((-1));
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) '#');
        library0.returnItem((int) (short) 1);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        library0.enableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (short) 100);
        library0.enableRental((-1));
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.enableRental((-1));
        library0.enableRental((int) (short) -1);
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) '4');
        library0.returnItem(0);
        library0.returnItem(10);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.enableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(10);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.returnItem((int) (short) -1);
        library0.enableRental(0);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem(100);
        library0.returnItem(0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.disableRental(0);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (short) -1);
        library0.returnItem(0);
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) -1);
        library0.enableRental(100);
        library0.enableRental(100);
        items.LibraryItem libraryItem18 = library0.findItemById(10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem18 = library0.findItemById(0);
        library0.returnItem(10);
        items.LibraryItem libraryItem22 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        items.LibraryItem libraryItem16 = library0.findItemById((-1));
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.enableRental(100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem18 = library0.findItemById(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 1);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental((int) 'a');
        library0.returnItem((int) (byte) 1);
        library0.disableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        items.LibraryItem libraryItem20 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        library0.returnItem(100);
        library0.returnItem((int) (short) 10);
        library0.enableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        library0.enableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        library0.returnItem((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        library0.returnItem((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (byte) -1);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem20 = library0.findItemById((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        library0.enableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (short) -1);
        library0.enableRental(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.enableRental((int) (short) 0);
        library0.enableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(0);
        library0.enableRental((int) 'a');
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem24 = library0.findItemById((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) -1);
        library0.enableRental(100);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        library0.returnItem((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.returnItem((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        library0.disableRental((int) (short) 100);
        library0.enableRental(0);
        items.LibraryItem libraryItem10 = library0.findItemById(1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        library0.returnItem(100);
        library0.disableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
        library0.disableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(100);
        library0.enableRental(100);
        library0.enableRental((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
        library0.disableRental(100);
        library0.returnItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        library0.returnItem((int) 'a');
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.disableRental((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.disableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        library0.returnItem(100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem(100);
        library0.enableRental(0);
        items.LibraryItem libraryItem24 = library0.findItemById((int) '4');
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 10);
        library0.returnItem((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(1);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.returnItem((int) (short) 10);
        library0.returnItem((int) '4');
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
        library0.disableRental(100);
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) -1);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) 'a');
        library0.returnItem((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        library0.returnItem(0);
        library0.returnItem((int) (short) 10);
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 10);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) -1);
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) '4');
        library0.returnItem(0);
        library0.returnItem(10);
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.enableRental((int) (byte) -1);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        library0.disableRental((-1));
        library0.returnItem((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 100);
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem18 = library0.findItemById(0);
        library0.returnItem(10);
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        library0.returnItem((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        library0.disableRental((-1));
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 1);
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.returnItem((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem(100);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) -1);
        library0.disableRental(0);
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        items.LibraryItem libraryItem6 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 10);
        library0.returnItem(10);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (byte) -1);
        library0.enableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.enableRental(0);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem16 = library0.findItemById((-1));
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        library0.returnItem((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) '4');
        library0.returnItem(0);
        items.LibraryItem libraryItem20 = library0.findItemById(10);
        library0.enableRental(100);
        library0.enableRental((int) (short) -1);
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (short) 0);
        library0.returnItem(0);
        library0.enableRental(100);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 0);
        items.LibraryItem libraryItem20 = library0.findItemById((int) '#');
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.disableRental((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.enableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem20 = library0.findItemById(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((-1));
        items.LibraryItem libraryItem26 = library0.findItemById((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem26);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById(1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental((-1));
        items.LibraryItem libraryItem18 = library0.findItemById(10);
        library0.returnItem((int) '#');
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        library0.disableRental((-1));
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem(1);
        library0.returnItem((int) ' ');
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem(10);
        library0.returnItem((int) '#');
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.returnItem((int) '#');
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((-1));
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        library0.enableRental(100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem20 = library0.findItemById((int) (short) -1);
        items.LibraryItem libraryItem22 = library0.findItemById(0);
        library0.returnItem(0);
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(100);
        library0.enableRental(100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem20 = library0.findItemById(0);
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem24 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        library0.enableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental(0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.returnItem(10);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem20 = library0.findItemById((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.disableRental((-1));
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem(10);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (short) -1);
        library0.disableRental(100);
        library0.returnItem(100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.disableRental(100);
        library0.enableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(10);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (short) 100);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(10);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) 'a');
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental((-1));
        items.LibraryItem libraryItem18 = library0.findItemById(10);
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) 100);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        library0.returnItem(100);
        library0.disableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.returnItem((int) '#');
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        library0.returnItem(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
        library0.disableRental(0);
        library0.enableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.returnItem((-1));
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem20 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem18 = library0.findItemById(0);
        library0.returnItem((int) '4');
        library0.returnItem((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.enableRental(0);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = libraryItem6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem20 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        library0.returnItem((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (short) 10);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.returnItem((int) (byte) 1);
        library0.enableRental((-1));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) ' ');
        library0.enableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.returnItem(0);
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        library0.returnItem(100);
        library0.disableRental((-1));
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.disableRental(0);
        library0.returnItem((int) (short) 0);
        library0.enableRental(0);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.enableRental((int) (short) 0);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem20 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem22 = library0.findItemById(1);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.returnItem((int) ' ');
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        library0.disableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(100);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) 'a');
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) '4');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.disableRental(0);
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.returnItem((-1));
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem20 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = libraryItem12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        library0.disableRental((int) (short) 100);
        library0.enableRental(0);
        items.LibraryItem libraryItem10 = library0.findItemById(1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) ' ');
        library0.enableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        library0.enableRental((int) (short) 0);
        library0.returnItem(100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) -1);
        library0.disableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem18 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.disableRental(0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem18 = library0.findItemById((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(1);
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem20 = library0.findItemById((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 0);
        items.LibraryItem libraryItem20 = library0.findItemById((int) '#');
        library0.returnItem((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.disableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem20 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) -1);
        library0.disableRental((int) (short) 0);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        library0.disableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.disableRental(100);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem16 = library0.findItemById(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.returnItem((int) '#');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.enableRental(0);
        library0.returnItem((int) (short) 0);
        library0.enableRental((int) (byte) 100);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem(100);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.returnItem((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.returnItem((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 0);
        library0.disableRental((int) 'a');
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (short) 0);
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) 'a');
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(100);
        library0.enableRental(100);
        library0.enableRental(0);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((-1));
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem(100);
        library0.returnItem(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        library0.returnItem((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem(10);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem20 = library0.findItemById(0);
        library0.returnItem(10);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
    }
}
