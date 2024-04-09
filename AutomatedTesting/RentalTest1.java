package AutomatedTesting;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentalTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "hi!", localDate2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "", localDate2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "hi!", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "hi!", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "hi!", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "hi!", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) -1, "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) -1, "hi!", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '4', "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "hi!", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(0, "hi!", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(100, "", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "hi!", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "hi!", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "hi!", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "hi!", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(100, "", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "hi!", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "hi!", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "hi!", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "", localDate2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(100, "", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '4', "", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "hi!", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(0, "", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "hi!", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "hi!", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "hi!", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "hi!", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "hi!", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(0, "", localDate2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '4', "hi!", localDate2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(100, "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "hi!", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "hi!", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "hi!", localDate2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "hi!", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "hi!", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '4', "", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "hi!", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) -1, "", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "hi!", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '4', "", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "hi!", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "hi!", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "hi!", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "hi!", localDate2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "hi!", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(0, "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "hi!", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "hi!", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "hi!", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "", localDate2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "hi!", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) -1, "hi!", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(100, "hi!", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "", localDate2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "hi!", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "hi!", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "hi!", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '4', "hi!", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "hi!", localDate2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "hi!", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "hi!", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) -1, "", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "", localDate2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "", localDate2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(100, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "hi!", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '4', "", localDate2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "", localDate2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "hi!", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "hi!", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "hi!", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "hi!", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "", localDate2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) -1, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 10, "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) -1, "", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '4', "hi!", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "", localDate2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(100, "", localDate2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) -1, "hi!", localDate2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) ' ', "", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "", localDate2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 0, "hi!", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "hi!", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "", localDate2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "hi!", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 100, "", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) -1, "", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "hi!", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) 'a', "", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "hi!", localDate2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "hi!", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "hi!", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 1, "hi!", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((-1), "hi!", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(100, "", localDate2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(1, "hi!", localDate2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 0, "", localDate2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "hi!", localDate2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 10, "", localDate2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental(10, "hi!", localDate2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "", localDate2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (short) 1, "hi!", localDate2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) (byte) 100, "hi!", localDate2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.time.LocalDate localDate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            libraryManagement.Rental rental4 = new libraryManagement.Rental((int) '#', "hi!", localDate2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"rentalDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

