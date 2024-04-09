package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class libraryTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 100);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) ' ');
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 10);
        library0.returnItem((int) (short) 1);
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.returnItem((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) 'a');
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) -1);
        library0.returnItem((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) -1);
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        library0.returnItem(100);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 10);
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
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental((-1));
        library0.returnItem(100);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 10);
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (byte) -1);
        library0.returnItem(100);
        library0.disableRental((int) 'a');
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        library0.returnItem((-1));
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 100);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
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
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        library0.returnItem((int) (short) 10);
        items.LibraryItem libraryItem22 = library0.findItemById((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = libraryItem8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById(0);
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
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        library0.enableRental((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 0);
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental(0);
        library0.returnItem((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        library0.returnItem((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        library0.returnItem(100);
        library0.disableRental((-1));
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        library0.enableRental((-1));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.enableRental((-1));
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
            java.lang.Class<?> wildcardClass17 = libraryItem16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem4 = library0.findItemById(1);
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (short) 0);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.enableRental((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (short) -1);
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
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((-1));
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) '#');
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) ' ');
        library0.returnItem(1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.returnItem((-1));
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) 0);
        library0.enableRental(0);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.returnItem((int) (short) -1);
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.lang.Class<?> wildcardClass23 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (short) -1);
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        library0.returnItem(0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.disableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem4 = library0.findItemById(1);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) '#');
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) (short) 10);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) 'a');
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
            library0.enableRental(10);
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        library0.enableRental((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((-1));
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) '4');
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
        library0.returnItem((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) '4');
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.returnItem((-1));
        library0.returnItem((int) '4');
        library0.disableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.disableRental(100);
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        library0.returnItem(0);
        library0.enableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) -1);
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        items.LibraryItem libraryItem22 = library0.findItemById((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.returnItem((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        library0.disableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.enableRental(0);
        library0.returnItem((int) ' ');
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) ' ');
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
        library0.enableRental(0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        library0.returnItem(10);
        library0.disableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) -1);
        library0.disableRental((int) (short) 0);
        library0.disableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem16 = library0.findItemById((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) 0);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.enableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) (short) 10);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        library0.disableRental((-1));
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
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (short) 100);
        library0.enableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem18 = library0.findItemById(1);
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        library0.returnItem(1);
        library0.returnItem((int) 'a');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (short) 0);
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.returnItem((int) '#');
        library0.returnItem((int) (short) 1);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (short) 10);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (byte) -1);
        library0.enableRental(100);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((-1));
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) -1);
        library0.disableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = libraryItem16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(100);
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.returnItem((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) '#');
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.returnItem((int) (short) -1);
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) -1);
        library0.enableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 10);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) -1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        items.LibraryItem libraryItem24 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem24);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        library0.returnItem((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem(10);
        library0.returnItem((int) (byte) 1);
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        library0.returnItem((int) '4');
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem16 = library0.findItemById((int) '4');
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(0);
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = libraryItem12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) '#');
        library0.disableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) 1);
        library0.disableRental(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        library0.returnItem((int) 'a');
        library0.enableRental((-1));
        library0.enableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((-1));
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = libraryItem6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        library0.returnItem((int) 'a');
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        library0.returnItem(0);
        library0.disableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = libraryItem22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.enableRental((-1));
        library0.returnItem((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById(1);
        items.LibraryItem libraryItem18 = library0.findItemById(1);
        library0.disableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.enableRental(100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.enableRental(0);
        items.LibraryItem libraryItem16 = library0.findItemById(0);
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        library0.returnItem(0);
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.enableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem16 = library0.findItemById((-1));
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 0);
        library0.disableRental((int) (short) 0);
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
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.returnItem((-1));
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem16 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 10);
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.returnItem(1);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (short) 100);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(10);
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) 'a');
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (short) -1);
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(0);
        items.LibraryItem libraryItem18 = library0.findItemById((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
            library0.enableRental((int) (byte) 10);
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.disableRental((int) (short) -1);
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) 'a');
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        items.LibraryItem libraryItem14 = library0.findItemById((-1));
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
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        library0.disableRental((int) (short) 100);
        library0.returnItem((int) 'a');
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        library0.enableRental((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.disableRental(0);
        library0.returnItem(100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        library0.returnItem((int) (byte) 1);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) 'a');
        library0.returnItem(100);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
            library0.addItem("hi!", "", "hi!");
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) '4');
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.returnItem((int) '#');
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        library0.enableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) '4');
        library0.returnItem((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.returnItem((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById(10);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 0);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        library0.returnItem((int) (short) 10);
        items.LibraryItem libraryItem22 = library0.findItemById((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = libraryItem22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (short) 0);
        library0.enableRental((-1));
        library0.disableRental(0);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        library0.disableRental(0);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.enableRental((int) 'a');
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
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
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
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) 'a');
        library0.enableRental(0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental(0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        library0.disableRental(100);
        library0.disableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        library0.returnItem(100);
        library0.returnItem((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 100);
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (short) -1);
        library0.returnItem(0);
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 100);
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(0);
        library0.returnItem((int) '4');
        library0.returnItem((int) (short) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem18 = library0.findItemById(1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) -1);
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
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((-1));
        library0.disableRental((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        library0.returnItem(1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem18 = library0.findItemById((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem((int) '#');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = libraryItem14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.returnItem((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        library0.enableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem10 = library0.findItemById((int) ' ');
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((-1));
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        library0.disableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 100);
        library0.enableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
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
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 100);
        library0.disableRental(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem2);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental(0);
        library0.enableRental(0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.returnItem((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.disableRental(100);
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((-1));
        library0.enableRental(0);
        library0.returnItem((int) (byte) 1);
        library0.enableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '4');
        library0.returnItem((int) (short) -1);
        library0.returnItem(100);
        library0.returnItem((int) ' ');
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '#');
        library0.disableRental(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental(0);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        library0.disableRental(100);
        library0.enableRental(0);
        library0.disableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) (short) 10);
        library0.returnItem((int) (short) -1);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.returnItem(1);
        items.LibraryItem libraryItem12 = library0.findItemById(100);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 10);
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        library0.enableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(100);
        library0.enableRental((int) (short) 0);
        library0.returnItem((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) 'a');
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
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        library0.enableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((-1));
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        java.lang.Class<?> wildcardClass25 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (byte) 10);
        library0.enableRental((-1));
        library0.enableRental(0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) -1);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem(10);
        library0.returnItem(0);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) 0);
        library0.enableRental((-1));
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
            library0.enableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.disableRental(100);
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
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (short) 0);
        library0.returnItem((int) (byte) -1);
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
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 0);
        library0.returnItem((int) (byte) 100);
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) -1);
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
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) ' ');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        library0.disableRental((int) 'a');
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (short) 0);
        library0.returnItem((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) 'a');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem14 = library0.findItemById(1);
        library0.enableRental((-1));
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem4 = library0.findItemById(1);
        library0.returnItem(0);
        java.lang.Class<?> wildcardClass7 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        library0.returnItem(100);
        library0.enableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem(10);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        items.LibraryItem libraryItem14 = library0.findItemById((-1));
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
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
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((-1));
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) 'a');
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) -1);
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
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
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
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        library0.returnItem((int) '4');
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) '4');
        library0.enableRental(100);
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
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem(10);
        library0.returnItem((int) (byte) 1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        library0.returnItem((int) (short) 10);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
            library0.enableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.returnItem(10);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) ' ');
        library0.enableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) '#');
        library0.returnItem((int) (byte) 1);
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        library0.enableRental((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.Class<?> wildcardClass21 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.returnItem((int) (short) -1);
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
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        library0.returnItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.enableRental((int) (byte) 0);
        library0.disableRental(0);
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 10);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem14 = library0.findItemById(0);
        library0.enableRental(100);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (short) 100);
        library0.enableRental((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 10);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        items.LibraryItem libraryItem20 = library0.findItemById((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = libraryItem20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem20);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        library0.returnItem((int) '4');
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        library0.enableRental((int) (byte) 100);
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        library0.returnItem((int) 'a');
        library0.enableRental((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.returnItem((int) (short) -1);
        library0.returnItem(0);
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        library0.enableRental((int) 'a');
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.returnItem((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        items.LibraryItem libraryItem16 = library0.findItemById(10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
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
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        library0.returnItem(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) -1);
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
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.returnItem((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        libraryManagement.Library library0 = new libraryManagement.Library();
        items.LibraryItem libraryItem2 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem4 = library0.findItemById(1);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem2);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
            library0.enableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (short) 0);
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
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem6);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        library0.enableRental(0);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem((int) (short) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        library0.disableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (short) -1);
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
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (short) 1);
        library0.returnItem(10);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
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
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (short) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.enableRental(0);
        library0.returnItem((int) ' ');
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
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) (byte) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        library0.returnItem((int) 'a');
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental(0);
        library0.returnItem(100);
        library0.returnItem(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) -1);
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
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
            library0.enableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.returnItem((int) (short) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById((int) '#');
        library0.returnItem((-1));
        items.LibraryItem libraryItem18 = library0.findItemById(10);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) (byte) 0);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem(1);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) ' ');
        library0.enableRental((int) (short) 100);
        library0.enableRental(100);
        java.lang.Class<?> wildcardClass17 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.enableRental((int) 'a');
        library0.returnItem((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 1);
        library0.disableRental((int) (byte) 100);
        library0.enableRental((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        library0.enableRental((int) 'a');
        library0.returnItem((-1));
        library0.disableRental((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        library0.returnItem((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (byte) 100);
        library0.disableRental(0);
        library0.disableRental((int) (byte) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.returnItem(10);
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) (short) 100);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
            library0.disableRental((int) '4');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) ' ');
        library0.returnItem((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        library0.enableRental((-1));
        library0.returnItem((int) ' ');
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = libraryItem14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        items.LibraryItem libraryItem6 = library0.findItemById((-1));
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) 0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
        library0.disableRental(0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 100);
        items.LibraryItem libraryItem10 = library0.findItemById(100);
        library0.returnItem(10);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem((int) (byte) 0);
        library0.returnItem((int) '4');
        library0.enableRental(100);
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (byte) 1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) 'a');
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) (short) 1);
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        library0.disableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 1);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem6 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) '#');
        items.LibraryItem libraryItem10 = library0.findItemById((int) (short) 0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem6);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.disableRental(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(10);
        library0.returnItem((int) (short) 0);
        library0.disableRental((int) (short) -1);
        library0.enableRental((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = library0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 10);
        items.LibraryItem libraryItem8 = library0.findItemById(100);
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) -1);
        library0.returnItem((int) (byte) 100);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (short) 10);
        library0.enableRental((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.enableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.returnItem(0);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        library0.enableRental((int) (byte) 0);
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById(10);
        library0.disableRental((int) 'a');
        library0.returnItem((int) (short) 1);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem(100);
        library0.enableRental(100);
        library0.disableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.enableRental((-1));
        items.LibraryItem libraryItem12 = library0.findItemById((int) (short) 1);
        items.LibraryItem libraryItem14 = library0.findItemById((int) (short) 0);
        items.LibraryItem libraryItem16 = library0.findItemById((-1));
        library0.returnItem((int) (byte) -1);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) -1);
        library0.returnItem(10);
        library0.disableRental((int) (byte) -1);
        library0.disableRental(0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.disableRental((int) (byte) 100);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) 'a');
        library0.returnItem((int) (short) 1);
        library0.returnItem((int) '#');
        library0.disableRental((int) 'a');
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(1);
        library0.returnItem(100);
        library0.returnItem((int) 'a');
        library0.returnItem((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem(0);
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) '#');
        library0.returnItem((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.disableRental((int) (short) 0);
        library0.enableRental((int) (short) -1);
        library0.enableRental((-1));
        library0.disableRental((-1));
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 100);
        library0.returnItem(0);
        items.LibraryItem libraryItem16 = library0.findItemById((int) (byte) 0);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem16);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem((int) (short) 100);
        library0.returnItem((int) ' ');
        library0.returnItem((int) (byte) 100);
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (short) 100);
        library0.returnItem((int) '#');
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        items.LibraryItem libraryItem22 = library0.findItemById(1);
        library0.disableRental((int) (byte) -1);
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
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNull(libraryItem22);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.returnItem((int) (byte) -1);
        library0.disableRental((int) (short) -1);
        library0.returnItem(10);
        org.junit.Assert.assertNull(libraryItem4);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        library0.enableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 10);
        library0.enableRental(0);
        library0.disableRental((int) (short) -1);
        library0.returnItem((int) '#');
        java.lang.Class<?> wildcardClass11 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.disableRental((int) (short) 0);
        items.LibraryItem libraryItem8 = library0.findItemById(0);
        library0.enableRental((int) (byte) -1);
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
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        items.LibraryItem libraryItem8 = library0.findItemById((int) ' ');
        library0.enableRental((int) 'a');
        library0.returnItem((int) '#');
        library0.returnItem((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem4 = library0.findItemById((int) (byte) 100);
        library0.disableRental((int) (byte) 0);
        library0.enableRental((int) (byte) 0);
        library0.returnItem(10);
        items.LibraryItem libraryItem12 = library0.findItemById((int) '4');
        items.LibraryItem libraryItem14 = library0.findItemById(1);
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        items.LibraryItem libraryItem4 = library0.findItemById(0);
        library0.disableRental((int) (short) 100);
        library0.disableRental((int) 'a');
        library0.disableRental((int) (byte) -1);
        items.LibraryItem libraryItem12 = library0.findItemById(0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (short) 100);
        library0.returnItem(1);
        library0.returnItem(100);
        items.LibraryItem libraryItem10 = library0.findItemById(0);
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        java.lang.Class<?> wildcardClass25 = library0.getClass();
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        library0.disableRental((int) (short) 100);
        org.junit.Assert.assertNull(libraryItem4);
        org.junit.Assert.assertNull(libraryItem12);
        org.junit.Assert.assertNull(libraryItem14);
        org.junit.Assert.assertNull(libraryItem18);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.disableRental((int) (byte) 0);
        library0.enableRental(0);
        items.LibraryItem libraryItem8 = library0.findItemById((-1));
        items.LibraryItem libraryItem10 = library0.findItemById((int) (byte) 10);
        items.LibraryItem libraryItem12 = library0.findItemById(1);
        library0.returnItem((int) (short) 1);
        library0.disableRental((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            library0.addItem("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid item type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(libraryItem8);
        org.junit.Assert.assertNull(libraryItem10);
        org.junit.Assert.assertNull(libraryItem12);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        libraryManagement.Library library0 = new libraryManagement.Library();
        library0.returnItem((-1));
        library0.returnItem((int) (byte) 100);
        library0.enableRental((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            library0.disableRental((int) ' ');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }
}
