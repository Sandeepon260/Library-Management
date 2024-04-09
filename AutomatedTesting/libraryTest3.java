package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class libraryTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem20 = library0.findItemById(10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (short) 10);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
        library0.enableRental(0);
        library0.returnItem((-1));
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (short) 10);
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) '#');
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        library0.returnItem(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) -1);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem18 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.enableRental(100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.enableRental((int) (short) 0);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        library0.returnItem((int) (short) 10);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
            java.lang.Class<?> wildcardClass15 = libraryItem14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.returnItem((int) ' ');
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((-1));
        library0.enableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) 'a');
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        library0.enableRental(0);
        library0.enableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        library0.returnItem(1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental(0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        library0.disableRental(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem16 = library0.findItemById((-1));
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) 'a');
        library0.returnItem((int) 'a');
        library0.returnItem((-1));
        library0.enableRental((int) (short) 0);
        library0.disableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (short) 100);
        library0.returnItem(0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem16 = library0.findItemById((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.disableRental(100);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        library0.returnItem((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((-1));
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (short) 1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        library0.returnItem(100);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem(1);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        library0.returnItem((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.returnItem((int) (byte) 0);
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
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 0);
        library0.enableRental(100);
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        library0.returnItem((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental(0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(10);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (short) -1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.returnItem((int) '4');
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
            java.lang.Class<?> wildcardClass19 = libraryItem18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental((-1));
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        library0.returnItem(100);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem4 = library0.findItemById(1);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (short) 10);
        library0.returnItem((int) (byte) 0);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.enableRental(100);
        library0.returnItem(0);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem16 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        library0.disableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        items.LibraryItem libraryItem24 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = libraryItem24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        library0.disableRental((int) (short) 100);
        library0.enableRental(0);
        items.LibraryItem libraryItem10 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.enableRental((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        library0.enableRental(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((-1));
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem18 = library0.findItemById((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        library0.enableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        library0.returnItem(10);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
        library0.enableRental(0);
        library0.returnItem(0);
        library0.enableRental((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem(1);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((-1));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.enableRental(100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        library0.returnItem((int) '4');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        library0.disableRental((int) (byte) -1);
        library0.disableRental((-1));
        items.LibraryItem libraryItem20 = library0.findItemById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem18 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = libraryItem2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        library0.enableRental((-1));
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        library0.returnItem((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((-1));
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) -1);
        library0.enableRental(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (short) 100);
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        library0.disableRental((-1));
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 100);
        library0.disableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) 0);
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        items.LibraryItem libraryItem6 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 0);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) 'a');
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental(0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        library0.returnItem((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
            library0.disableRental(10);
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
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem18 = library0.findItemById((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) ' ');
        library0.disableRental(0);
        library0.enableRental((int) (short) 100);
        items.LibraryItem libraryItem26 = library0.findItemById((int) (byte) 100);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem26);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = libraryItem12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        library0.returnItem(1);
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) -1);
        library0.enableRental(100);
        library0.returnItem((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((-1));
        library0.returnItem((int) '#');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        library0.returnItem(100);
        library0.returnItem((int) ' ');
        library0.returnItem(0);
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.disableRental(100);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        items.LibraryItem libraryItem18 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        library0.disableRental((int) (short) -1);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.enableRental(0);
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.enableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((int) '#');
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        library0.disableRental((int) (short) 100);
        library0.enableRental(0);
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        library0.returnItem(100);
        library0.returnItem((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) ' ');
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) -1);
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
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '4');
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        library0.disableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(1);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.disableRental(0);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.enableRental(100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.disableRental(0);
        library0.returnItem((int) (short) 0);
        library0.enableRental(0);
        library0.returnItem(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        library0.enableRental((int) (short) 0);
        library0.enableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) '4');
        library0.disableRental((int) (byte) 0);
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) 'a');
        library0.enableRental((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((-1));
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (byte) 1);
        library0.disableRental((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        library0.disableRental((int) 'a');
        library0.returnItem(0);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        library0.enableRental(0);
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
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) -1);
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(10);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        library0.enableRental(100);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.enableRental((int) (short) 0);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental(0);
        library0.returnItem((int) (byte) 100);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
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
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.disableRental((-1));
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 10);
        library0.disableRental((int) 'a');
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem20 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) 0);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (short) 10);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = libraryItem10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((-1));
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((int) '#');
        library0.enableRental(0);
        library0.returnItem(100);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
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
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((-1));
        library0.enableRental(0);
        library0.enableRental(0);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        library0.enableRental((int) (byte) -1);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.returnItem((int) '#');
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.enableRental((int) (short) 0);
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 100);
        library0.disableRental((int) (short) 100);
        library0.disableRental((-1));
        library0.returnItem((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        library0.returnItem((int) (byte) -1);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 100);
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) '#');
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        items.LibraryItem libraryItem24 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        library0.returnItem(100);
        items.LibraryItem libraryItem24 = library0.findItemById((int) '#');
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.enableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        library0.enableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        library0.returnItem((int) (byte) -1);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) -1);
        library0.returnItem((int) '4');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (byte) -1);
        library0.returnItem(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
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
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        library0.disableRental((int) (byte) -1);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((-1));
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.enableRental((-1));
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '#');
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.returnItem((int) ' ');
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        library0.returnItem(100);
        library0.returnItem((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.disableRental((-1));
        library0.returnItem((int) '#');
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        library0.disableRental(0);
        library0.returnItem((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental(0);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        library0.disableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((-1));
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem((-1));
        library0.returnItem((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 0);
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.returnItem(1);
        library0.returnItem(0);
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
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
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = libraryItem18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((-1));
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
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
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental(0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.returnItem(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (byte) -1);
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.disableRental(100);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem(0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) 'a');
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (short) 100);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.enableRental(100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        library0.disableRental(0);
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        library0.enableRental((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem(10);
        library0.returnItem((int) (byte) 1);
        library0.enableRental((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem22 = library0.findItemById((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem((-1));
        library0.returnItem((int) (short) -1);
        library0.enableRental(0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        items.LibraryItem libraryItem20 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (short) 100);
        library0.returnItem(0);
        items.LibraryItem libraryItem18 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.disableRental(0);
        library0.returnItem((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) -1);
        library0.returnItem((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 100);
        library0.enableRental((int) 'a');
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) ' ');
        library0.enableRental((int) (short) 100);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem20 = library0.findItemById(0);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        library0.enableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) '#');
        library0.returnItem((int) (byte) -1);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem(100);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental(0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem(1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        library0.returnItem((int) (byte) 1);
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) -1);
        library0.enableRental((-1));
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) '#');
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 10);
        library0.returnItem(100);
        library0.returnItem((int) '#');
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        library0.returnItem((int) (short) 0);
        library0.disableRental(100);
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
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
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
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental(100);
        library0.returnItem((int) (short) 100);
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.enableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        library0.returnItem((int) 'a');
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem(1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem20 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((-1));
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(10);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 0);
        library0.returnItem(0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
        library0.returnItem(100);
        library0.enableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (byte) 1);
        library0.disableRental((int) (byte) 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.disableRental(0);
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((-1));
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) '4');
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (short) 100);
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (byte) 1);
        library0.enableRental((int) (short) 100);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        library0.returnItem((-1));
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        library0.disableRental((-1));
        library0.returnItem((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(10);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.enableRental((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem18 = library0.findItemById(10);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) '4');
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) (short) 0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        library0.returnItem((int) (short) 10);
        library0.disableRental(0);
        items.LibraryItem libraryItem26 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem26);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        items.LibraryItem libraryItem16 = library0.findItemById(10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental(100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(1);
        library0.enableRental((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 100);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        library0.enableRental(100);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        library0.disableRental(0);
        library0.enableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(10);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        library0.returnItem((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = libraryItem16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        library0.returnItem((int) (byte) 1);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem18 = library0.findItemById((int) '#');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (short) 10);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        library0.disableRental((int) 'a');
        library0.returnItem(0);
        library0.returnItem((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 100);
        library0.enableRental((int) 'a');
        library0.returnItem(0);
        library0.returnItem((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (byte) -1);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem6 = library0.findItemById((int) ' ');
        library0.enableRental(100);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem18 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById((int) ' ');
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (byte) -1);
        library0.enableRental(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        library0.returnItem((int) ' ');
        library0.enableRental(0);
        items.LibraryItem libraryItem20 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        java.lang.Class<?> wildcardClass23 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 1);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) ' ');
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        library0.returnItem((int) (byte) -1);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental(100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) '#');
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) 0);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) (short) -1);
        library0.enableRental((int) (byte) -1);
        library0.returnItem(10);
        library0.enableRental((int) (byte) -1);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        library0.returnItem(100);
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.disableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) ' ');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 0);
        library0.enableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.returnItem((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        library0.returnItem((int) 'a');
        library0.returnItem(100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = libraryItem16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem20 = library0.findItemById(1);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 10);
        library0.disableRental((int) 'a');
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem20 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        items.LibraryItem libraryItem26 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem24);
        org.junit.Assert.assertNull(libraryItem26);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.disableRental((-1));
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        library0.returnItem(100);
        items.LibraryItem libraryItem24 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
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
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 10);
        library0.returnItem(100);
        library0.returnItem((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        library0.returnItem((int) 'a');
        java.lang.Class<?> wildcardClass23 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        library0.enableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        library0.returnItem(1);
        library0.enableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) 'a');
        library0.returnItem((int) 'a');
        library0.disableRental(0);
        library0.disableRental(0);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((-1));
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 100);
        library0.disableRental((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.returnItem(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        library0.enableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) 'a');
        library0.disableRental((-1));
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) -1);
        library0.enableRental(100);
        library0.returnItem((int) (byte) 100);
        library0.disableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        library0.returnItem((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = libraryItem18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental((-1));
        library0.enableRental((int) 'a');
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }
}
