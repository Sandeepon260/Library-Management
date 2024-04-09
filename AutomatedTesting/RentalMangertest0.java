package AutomatedTesting;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RentalMangertest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.time.LocalDate localDate0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = libraryManagement.RentalManager.isDueSoonOrOverdue(localDate0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.isAfter(java.time.chrono.ChronoLocalDate)\" because \"dueDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        libraryManagement.RentalManager rentalManager0 = new libraryManagement.RentalManager();
        java.lang.Class<?> wildcardClass1 = rentalManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.util.List<libraryManagement.Rental> rentalList1 = libraryManagement.RentalManager.getUserRentals("hi!");
        java.lang.Class<?> wildcardClass2 = rentalList1.getClass();
        org.junit.Assert.assertNotNull(rentalList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.util.List<libraryManagement.Rental> rentalList1 = libraryManagement.RentalManager.getUserRentals("");
        java.lang.Class<?> wildcardClass2 = rentalList1.getClass();
        org.junit.Assert.assertNotNull(rentalList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

