package AutomatedTesting;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Book3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        java.lang.String str10 = book6.getDetails();
        java.lang.String str11 = book6.getAuthor();
        java.lang.String str12 = book6.getDetails();
        java.lang.String str13 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str10, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str12, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        double double47 = book6.calculateOverduePenalty();
        double double48 = book6.calculateOverduePenalty();
        double double49 = book6.calculateOverduePenalty();
        int int50 = book6.getItemId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10314 + "'", int50 == 10314);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        book6.setIsPurchasable(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        boolean boolean9 = book6.isRented();
        java.lang.String str10 = book6.getLocation();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray54 = new items.LibraryItem[] { book25, book34, book43, book53 };
        java.util.ArrayList<items.LibraryItem> libraryItemList55 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList55, libraryItemArray54);
        boolean boolean57 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean58 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        java.lang.String str59 = book6.getAuthor();
        book6.returnItem();
        java.lang.Class<?> wildcardClass61 = book6.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        java.lang.String str49 = book6.getAuthor();
        java.lang.String str50 = book6.getLocation();
        java.lang.String str51 = book6.getTitle();
        java.lang.Class<?> wildcardClass52 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.getTitle();
        java.lang.String str49 = book6.getTitle();
        int int50 = book6.getItemId();
        java.lang.String str51 = book6.getDetails();
        java.lang.String str52 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10331 + "'", int50 == 10331);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str52, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        book6.returnItem();
        java.lang.String str9 = book6.getAuthor();
        items.Book book16 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str17 = book16.getDetails();
        book16.returnItem();
        java.lang.String str19 = book16.getAuthor();
        java.lang.String str20 = book16.getItemType();
        book16.setIsPurchasable(false);
        items.Book book29 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean30 = book29.isRented();
        book29.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean33 = book29.isRented();
        items.Book book40 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str41 = book40.getDetails();
        book40.returnItem();
        boolean boolean43 = book40.isPurchasable();
        double double44 = book40.calculateOverduePenalty();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        book51.returnItem();
        items.Book book59 = new items.Book("", "", true, true, "", "hi!");
        book59.returnItem();
        java.lang.String str61 = book59.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        book68.returnItem();
        java.lang.String str70 = book68.getAuthor();
        items.Book book77 = new items.Book("", "", true, true, "", "hi!");
        book77.returnItem();
        java.lang.String str79 = book77.getAuthor();
        java.lang.String str80 = book77.getAuthor();
        items.Book book87 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray88 = new items.LibraryItem[] { book59, book68, book77, book87 };
        java.util.ArrayList<items.LibraryItem> libraryItemList89 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList89, libraryItemArray88);
        boolean boolean91 = book51.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean92 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean93 = book29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean94 = book16.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean95 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        java.lang.String str96 = book6.getBorrowerEmail();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str17, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Book" + "'", str20, "Book");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str41, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getDetails();
        boolean boolean9 = book6.isOverdue();
        book6.returnItem();
        boolean boolean11 = book6.isRented();
        book6.setIsPurchasable(false);
        book6.setLocation("Book:  by hi!. Location: Book: hi! by . Location: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        items.Book book6 = new items.Book("LibraryItem [itemId=5559, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1099, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2563, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2296, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book13 = new items.Book("", "", true, true, "", "hi!");
        book13.returnItem();
        boolean boolean15 = book13.isOverdue();
        boolean boolean16 = book13.isOverdue();
        double double17 = book13.calculateOverduePenalty();
        java.lang.String str18 = book13.toString();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        book25.setIsPurchasable(true);
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        java.lang.String str38 = book36.getAuthor();
        java.lang.String str39 = book36.getAuthor();
        double double40 = book36.calculateOverduePenalty();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        book47.returnItem();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        book64.returnItem();
        java.lang.String str66 = book64.getAuthor();
        items.Book book73 = new items.Book("", "", true, true, "", "hi!");
        book73.returnItem();
        java.lang.String str75 = book73.getAuthor();
        java.lang.String str76 = book73.getAuthor();
        items.Book book83 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray84 = new items.LibraryItem[] { book55, book64, book73, book83 };
        java.util.ArrayList<items.LibraryItem> libraryItemList85 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList85, libraryItemArray84);
        boolean boolean87 = book47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean88 = book36.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean89 = book25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean90 = book13.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean91 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        java.lang.String str92 = book6.getItemType();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LibraryItem [itemId=10347, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str18, "LibraryItem [itemId=10347, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Book" + "'", str92, "Book");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        items.Book book6 = new items.Book("LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "", "Book:  by hi!. Location: . Purchasable: true");
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str9 = book6.getBorrowerEmail();
        java.lang.String str10 = book6.getItemType();
        java.lang.String str11 = book6.getItemType();
        boolean boolean12 = book6.isOverdue();
        book6.setLocation("LibraryItem [itemId=8863, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book" + "'", str10, "Book");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        java.lang.String str9 = book6.getAuthor();
        java.lang.Class<?> wildcardClass10 = book6.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        items.Book book6 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isRented();
        book6.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean10 = book6.isRented();
        book6.setIsPurchasable(false);
        book6.setBorrowerEmail("LibraryItem [itemId=1286, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setLocation("LibraryItem [itemId=1314, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = book6.getDetails();
        items.Book book24 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str25 = book24.getDetails();
        book24.returnItem();
        java.lang.String str27 = book24.toString();
        book24.returnItem();
        java.lang.String str29 = book24.getBorrowerEmail();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        boolean boolean38 = book36.isPurchasable();
        boolean boolean39 = book36.isRented();
        java.lang.String str40 = book36.getLocation();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        book47.returnItem();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        book64.returnItem();
        java.lang.String str66 = book64.getAuthor();
        items.Book book73 = new items.Book("", "", true, true, "", "hi!");
        book73.returnItem();
        java.lang.String str75 = book73.getAuthor();
        java.lang.String str76 = book73.getAuthor();
        items.Book book83 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray84 = new items.LibraryItem[] { book55, book64, book73, book83 };
        java.util.ArrayList<items.LibraryItem> libraryItemList85 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList85, libraryItemArray84);
        boolean boolean87 = book47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean88 = book36.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean89 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean90 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Book:  by LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=1314, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str17, "Book:  by LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=1314, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str25, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LibraryItem [itemId=10366, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str27, "LibraryItem [itemId=10366, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getPrice();
        boolean boolean9 = book6.isOverdue();
        java.lang.String str10 = book6.getItemType();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10373, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10373, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book" + "'", str10, "Book");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        double double9 = book6.calculateOverduePenalty();
        book6.setBorrowerEmail("LibraryItem [itemId=941, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str12 = book6.getAuthor();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getTitle();
        java.lang.String str9 = book6.getBorrowerEmail();
        java.lang.String str10 = book6.getItemType();
        java.lang.String str11 = book6.getPrice();
        boolean boolean12 = book6.isOverdue();
        java.lang.String str13 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book" + "'", str10, "Book");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        double double49 = book6.calculateOverduePenalty();
        book6.returnItem();
        java.lang.String str51 = book6.getAuthor();
        boolean boolean52 = book6.isOverdue();
        java.lang.Class<?> wildcardClass53 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        book6.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        java.lang.String str11 = book6.getLocation();
        items.Book book18 = new items.Book("", "", true, true, "", "hi!");
        book18.returnItem();
        java.lang.String str20 = book18.getAuthor();
        java.lang.String str21 = book18.getAuthor();
        double double22 = book18.calculateOverduePenalty();
        items.Book book29 = new items.Book("", "", true, true, "", "hi!");
        book29.returnItem();
        items.Book book37 = new items.Book("", "", true, true, "", "hi!");
        book37.returnItem();
        java.lang.String str39 = book37.getAuthor();
        items.Book book46 = new items.Book("", "", true, true, "", "hi!");
        book46.returnItem();
        java.lang.String str48 = book46.getAuthor();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        java.lang.String str58 = book55.getAuthor();
        items.Book book65 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray66 = new items.LibraryItem[] { book37, book46, book55, book65 };
        java.util.ArrayList<items.LibraryItem> libraryItemList67 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList67, libraryItemArray66);
        boolean boolean69 = book29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList67);
        boolean boolean70 = book18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList67);
        boolean boolean71 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList67);
        book6.setIsPurchasable(true);
        int int74 = book6.getItemId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 10381 + "'", int74 == 10381);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        items.Book book6 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.toString();
        items.Book book14 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean15 = book14.isOverdue();
        items.Book book22 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean23 = book22.isOverdue();
        items.Book book30 = new items.Book("", "", true, true, "", "hi!");
        book30.returnItem();
        items.Book book38 = new items.Book("", "", true, true, "", "hi!");
        book38.returnItem();
        java.lang.String str40 = book38.getAuthor();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        book47.returnItem();
        java.lang.String str49 = book47.getAuthor();
        items.Book book56 = new items.Book("", "", true, true, "", "hi!");
        book56.returnItem();
        java.lang.String str58 = book56.getAuthor();
        java.lang.String str59 = book56.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray67 = new items.LibraryItem[] { book38, book47, book56, book66 };
        java.util.ArrayList<items.LibraryItem> libraryItemList68 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList68, libraryItemArray67);
        boolean boolean70 = book30.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList68);
        items.LibraryItem[] libraryItemArray71 = new items.LibraryItem[] { book22, book30 };
        java.util.ArrayList<items.LibraryItem> libraryItemList72 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList72, libraryItemArray71);
        boolean boolean74 = book14.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList72);
        boolean boolean75 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList72);
        double double76 = book6.calculateOverduePenalty();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10388, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10388, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(libraryItemArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        items.Book book6 = new items.Book("LibraryItem [itemId=2151, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1382, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2812, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book13 = new items.Book("", "", true, true, "", "hi!");
        book13.returnItem();
        java.lang.String str15 = book13.getAuthor();
        java.lang.String str16 = book13.getAuthor();
        boolean boolean17 = book13.isPurchasable();
        int int18 = book13.getItemId();
        java.lang.String str19 = book13.getTitle();
        double double20 = book13.calculateOverduePenalty();
        boolean boolean21 = book13.isOverdue();
        java.lang.String str22 = book13.getItemType();
        items.Book book29 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str30 = book29.getDetails();
        book29.returnItem();
        items.Book book38 = new items.Book("", "", true, true, "", "hi!");
        book38.returnItem();
        boolean boolean40 = book38.isPurchasable();
        boolean boolean41 = book38.isRented();
        java.lang.String str42 = book38.getLocation();
        items.Book book49 = new items.Book("", "", true, true, "", "hi!");
        book49.returnItem();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        items.Book book75 = new items.Book("", "", true, true, "", "hi!");
        book75.returnItem();
        java.lang.String str77 = book75.getAuthor();
        java.lang.String str78 = book75.getAuthor();
        items.Book book85 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray86 = new items.LibraryItem[] { book57, book66, book75, book85 };
        java.util.ArrayList<items.LibraryItem> libraryItemList87 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList87, libraryItemArray86);
        boolean boolean89 = book49.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean90 = book38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean91 = book29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean92 = book13.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean93 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10397 + "'", int18 == 10397);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Book" + "'", str22, "Book");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str30, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        items.Book book6 = new items.Book("LibraryItem [itemId=881, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2405, itemType=Book, location=LibraryItem [itemId=737, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1908, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int7 = book6.getItemId();
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10405 + "'", int7 == 10405);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        book6.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        java.lang.String str11 = book6.getTitle();
        java.lang.String str12 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=871, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(true);
        int int17 = book6.getItemId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=10407, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=10407, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10407 + "'", int17 == 10407);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        items.Book book6 = new items.Book("Book:  by hi!. Location: . Purchasable: true", "LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isRented();
        java.lang.String str8 = book6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str8, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getTitle();
        book6.setLocation("LibraryItem [itemId=737, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str11 = book6.toString();
        int int12 = book6.getItemId();
        boolean boolean13 = book6.isOverdue();
        boolean boolean14 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10417, itemType=Book, location=LibraryItem [itemId=737, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10417, itemType=Book, location=LibraryItem [itemId=737, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10417 + "'", int12 == 10417);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        java.lang.String str49 = book6.toString();
        boolean boolean50 = book6.isOverdue();
        boolean boolean51 = book6.isPurchasable();
        boolean boolean52 = book6.isOverdue();
        book6.setLocation("LibraryItem [itemId=2516, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LibraryItem [itemId=10418, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str49, "LibraryItem [itemId=10418, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        items.Book book6 = new items.Book("LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=281, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1113, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(true);
        boolean boolean9 = book6.isPurchasable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        items.Book book6 = new items.Book("LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "", "Book:  by hi!. Location: . Purchasable: true");
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str9 = book6.getItemType();
        java.lang.String str10 = book6.getAuthor();
        book6.setIsPurchasable(true);
        java.lang.String str13 = book6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book" + "'", str9, "Book");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str10, "Book:  by hi!. Location: . Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=10424, itemType=Book, location=LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=10424, itemType=Book, location=LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        boolean boolean9 = book6.isRented();
        int int10 = book6.getItemId();
        book6.returnItem();
        java.lang.String str12 = book6.getAuthor();
        book6.returnItem();
        java.lang.String str14 = book6.getLocation();
        book6.setLocation("LibraryItem [itemId=7802, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = book6.getPrice();
        java.lang.String str18 = book6.getPrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10425 + "'", int10 == 10425);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isPurchasable();
        java.lang.String str10 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        items.Book book6 = new items.Book("LibraryItem [itemId=1094, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, false, "LibraryItem [itemId=9013, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4942, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        double double7 = book6.calculateOverduePenalty();
        boolean boolean8 = book6.isPurchasable();
        java.lang.String str9 = book6.getItemType();
        java.lang.String str10 = book6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book" + "'", str9, "Book");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        items.Book book6 = new items.Book("", "LibraryItem [itemId=9840, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=5045, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7232, itemType=Book, location=LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=Book: hi! by . Location: hi!. Purchasable: false, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        double double47 = book6.calculateOverduePenalty();
        boolean boolean48 = book6.isPurchasable();
        java.lang.String str49 = book6.getItemType();
        book6.setLocation("LibraryItem [itemId=7693, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Book" + "'", str49, "Book");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isPurchasable();
        int int10 = book6.getItemId();
        java.lang.String str11 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10435 + "'", int10 == 10435);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str11, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        items.Book book6 = new items.Book("LibraryItem [itemId=549, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2071, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "", "LibraryItem [itemId=1021, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = book6.calculateOverduePenalty();
        boolean boolean8 = book6.isPurchasable();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        items.Book book6 = new items.Book("LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=131, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isRented();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isPurchasable();
        int int10 = book6.getItemId();
        java.lang.String str11 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10438 + "'", int10 == 10438);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        boolean boolean10 = book6.isPurchasable();
        boolean boolean11 = book6.isPurchasable();
        items.Book book18 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str19 = book18.getDetails();
        java.lang.String str20 = book18.getDetails();
        boolean boolean21 = book18.isOverdue();
        items.Book book28 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean29 = book28.isOverdue();
        items.Book book36 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean37 = book36.isOverdue();
        items.Book book44 = new items.Book("", "", true, true, "", "hi!");
        book44.returnItem();
        items.Book book52 = new items.Book("", "", true, true, "", "hi!");
        book52.returnItem();
        java.lang.String str54 = book52.getAuthor();
        items.Book book61 = new items.Book("", "", true, true, "", "hi!");
        book61.returnItem();
        java.lang.String str63 = book61.getAuthor();
        items.Book book70 = new items.Book("", "", true, true, "", "hi!");
        book70.returnItem();
        java.lang.String str72 = book70.getAuthor();
        java.lang.String str73 = book70.getAuthor();
        items.Book book80 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book52, book61, book70, book80 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        items.LibraryItem[] libraryItemArray85 = new items.LibraryItem[] { book36, book44 };
        java.util.ArrayList<items.LibraryItem> libraryItemList86 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList86, libraryItemArray85);
        boolean boolean88 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean89 = book18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean90 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean91 = book6.isOverdue();
        java.lang.String str92 = book6.getLocation();
        java.lang.String str93 = book6.getBorrowerEmail();
        book6.setIsPurchasable(true);
        book6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str19, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str20, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(libraryItemArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        book6.returnItem();
        java.lang.String str50 = book6.getPrice();
        java.lang.String str51 = book6.getAuthor();
        book6.returnItem();
        book6.setLocation("LibraryItem [itemId=4314, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getDetails();
        boolean boolean9 = book6.isOverdue();
        items.Book book16 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean17 = book16.isOverdue();
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        java.lang.String str42 = book40.getAuthor();
        items.Book book49 = new items.Book("", "", true, true, "", "hi!");
        book49.returnItem();
        java.lang.String str51 = book49.getAuthor();
        items.Book book58 = new items.Book("", "", true, true, "", "hi!");
        book58.returnItem();
        java.lang.String str60 = book58.getAuthor();
        java.lang.String str61 = book58.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray69 = new items.LibraryItem[] { book40, book49, book58, book68 };
        java.util.ArrayList<items.LibraryItem> libraryItemList70 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList70, libraryItemArray69);
        boolean boolean72 = book32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList70);
        items.LibraryItem[] libraryItemArray73 = new items.LibraryItem[] { book24, book32 };
        java.util.ArrayList<items.LibraryItem> libraryItemList74 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList74, libraryItemArray73);
        boolean boolean76 = book16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList74);
        boolean boolean77 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList74);
        int int78 = book6.getItemId();
        java.lang.String str79 = book6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(libraryItemArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10453 + "'", int78 == 10453);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Book" + "'", str79, "Book");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        boolean boolean9 = book6.isRented();
        int int10 = book6.getItemId();
        book6.returnItem();
        java.lang.String str12 = book6.getAuthor();
        book6.returnItem();
        boolean boolean14 = book6.isRented();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10461 + "'", int10 == 10461);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        items.Book book17 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str18 = book17.getDetails();
        java.lang.String str19 = book17.getDetails();
        boolean boolean20 = book17.isOverdue();
        items.Book book27 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean28 = book27.isOverdue();
        items.Book book35 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean36 = book35.isOverdue();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        book51.returnItem();
        java.lang.String str53 = book51.getAuthor();
        items.Book book60 = new items.Book("", "", true, true, "", "hi!");
        book60.returnItem();
        java.lang.String str62 = book60.getAuthor();
        items.Book book69 = new items.Book("", "", true, true, "", "hi!");
        book69.returnItem();
        java.lang.String str71 = book69.getAuthor();
        java.lang.String str72 = book69.getAuthor();
        items.Book book79 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray80 = new items.LibraryItem[] { book51, book60, book69, book79 };
        java.util.ArrayList<items.LibraryItem> libraryItemList81 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList81, libraryItemArray80);
        boolean boolean83 = book43.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        items.LibraryItem[] libraryItemArray84 = new items.LibraryItem[] { book35, book43 };
        java.util.ArrayList<items.LibraryItem> libraryItemList85 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList85, libraryItemArray84);
        boolean boolean87 = book27.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean88 = book17.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean89 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        book6.setIsPurchasable(true);
        double double92 = book6.calculateOverduePenalty();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10462, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10462, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str18, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str19, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(libraryItemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        items.Book book6 = new items.Book("LibraryItem [itemId=3466, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book:  by hi!. Location: LibraryItem [itemId=1022, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true", false, false, "LibraryItem [itemId=2920, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1804, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = book6.calculateOverduePenalty();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        items.Book book6 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int7 = book6.getItemId();
        int int8 = book6.getItemId();
        java.lang.String str9 = book6.getDetails();
        java.lang.String str10 = book6.getAuthor();
        java.lang.String str11 = book6.getAuthor();
        items.Book book18 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book18.setIsPurchasable(false);
        java.lang.String str21 = book18.toString();
        boolean boolean22 = book18.isOverdue();
        items.Book book29 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean30 = book29.isRented();
        book29.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean33 = book29.isRented();
        items.Book book40 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str41 = book40.getDetails();
        book40.returnItem();
        boolean boolean43 = book40.isPurchasable();
        double double44 = book40.calculateOverduePenalty();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        book51.returnItem();
        items.Book book59 = new items.Book("", "", true, true, "", "hi!");
        book59.returnItem();
        java.lang.String str61 = book59.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        book68.returnItem();
        java.lang.String str70 = book68.getAuthor();
        items.Book book77 = new items.Book("", "", true, true, "", "hi!");
        book77.returnItem();
        java.lang.String str79 = book77.getAuthor();
        java.lang.String str80 = book77.getAuthor();
        items.Book book87 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray88 = new items.LibraryItem[] { book59, book68, book77, book87 };
        java.util.ArrayList<items.LibraryItem> libraryItemList89 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList89, libraryItemArray88);
        boolean boolean91 = book51.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean92 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean93 = book29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean94 = book18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean95 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10472 + "'", int7 == 10472);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10472 + "'", int8 == 10472);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str9, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LibraryItem [itemId=10473, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str21, "LibraryItem [itemId=10473, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str41, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getDetails();
        java.lang.String str9 = book6.getBorrowerEmail();
        java.lang.String str10 = book6.getPrice();
        boolean boolean11 = book6.isPurchasable();
        java.lang.String str12 = book6.getItemType();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10481, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10481, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book" + "'", str12, "Book");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        book6.returnItem();
        int int9 = book6.getItemId();
        book6.setLocation("");
        java.lang.String str12 = book6.getTitle();
        java.lang.String str13 = book6.toString();
        items.Book book20 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str21 = book20.getDetails();
        java.lang.String str22 = book20.toString();
        book20.setIsPurchasable(false);
        items.Book book31 = new items.Book("", "", true, true, "", "hi!");
        book31.returnItem();
        boolean boolean33 = book31.isPurchasable();
        boolean boolean34 = book31.isRented();
        java.lang.String str35 = book31.getLocation();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        book42.returnItem();
        items.Book book50 = new items.Book("", "", true, true, "", "hi!");
        book50.returnItem();
        java.lang.String str52 = book50.getAuthor();
        items.Book book59 = new items.Book("", "", true, true, "", "hi!");
        book59.returnItem();
        java.lang.String str61 = book59.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        book68.returnItem();
        java.lang.String str70 = book68.getAuthor();
        java.lang.String str71 = book68.getAuthor();
        items.Book book78 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray79 = new items.LibraryItem[] { book50, book59, book68, book78 };
        java.util.ArrayList<items.LibraryItem> libraryItemList80 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList80, libraryItemArray79);
        boolean boolean82 = book42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean83 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean84 = book20.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean85 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        java.lang.String str86 = book6.getPrice();
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10482 + "'", int9 == 10482);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=10482, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=10482, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str21, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "LibraryItem [itemId=10483, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str22, "LibraryItem [itemId=10483, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getDetails();
        java.lang.String str52 = book6.getDetails();
        int int53 = book6.getItemId();
        boolean boolean54 = book6.isOverdue();
        java.lang.String str55 = book6.getDetails();
        java.lang.String str56 = book6.getDetails();
        book6.setLocation("LibraryItem [itemId=2660, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10490, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10490, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str52, "Book:  by hi!. Location: . Purchasable: true");
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10490 + "'", int53 == 10490);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str55, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str56, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        items.Book book6 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getDetails();
        book6.setLocation("LibraryItem [itemId=1721, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book17 = new items.Book("hi!", "", true, false, "hi!", "");
        book17.setIsPurchasable(true);
        book17.returnItem();
        java.lang.String str21 = book17.getAuthor();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        java.lang.String str30 = book28.getAuthor();
        java.lang.String str31 = book28.getAuthor();
        double double32 = book28.calculateOverduePenalty();
        items.Book book39 = new items.Book("", "", true, true, "", "hi!");
        book39.returnItem();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        book47.returnItem();
        java.lang.String str49 = book47.getAuthor();
        items.Book book56 = new items.Book("", "", true, true, "", "hi!");
        book56.returnItem();
        java.lang.String str58 = book56.getAuthor();
        items.Book book65 = new items.Book("", "", true, true, "", "hi!");
        book65.returnItem();
        java.lang.String str67 = book65.getAuthor();
        java.lang.String str68 = book65.getAuthor();
        items.Book book75 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray76 = new items.LibraryItem[] { book47, book56, book65, book75 };
        java.util.ArrayList<items.LibraryItem> libraryItemList77 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList77, libraryItemArray76);
        boolean boolean79 = book39.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean80 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean81 = book17.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean82 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList77);
        java.lang.String str83 = book6.getBorrowerEmail();
        java.lang.String str84 = book6.getLocation();
        int int85 = book6.getItemId();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str8, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "LibraryItem [itemId=1721, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str84, "LibraryItem [itemId=1721, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int85 + "' != '" + 10495 + "'", int85 == 10495);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        java.lang.String str11 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=941, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book6.getAuthor();
        java.lang.String str15 = book6.getDetails();
        java.lang.String str16 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10503, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10503, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str15, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LibraryItem [itemId=941, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str16, "LibraryItem [itemId=941, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        book15.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean33 = book32.isOverdue();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        java.lang.String str69 = book66.getAuthor();
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book48, book57, book66, book76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book32, book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean85 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean86 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        book6.setBorrowerEmail("Book:  by hi!. Location: . Purchasable: true");
        int int89 = book6.getItemId();
        java.lang.String str90 = book6.getBorrowerEmail();
        book6.setBorrowerEmail("LibraryItem [itemId=933, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean93 = book6.isPurchasable();
        book6.returnItem();
        int int95 = book6.getItemId();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int89 + "' != '" + 10504 + "'", int89 == 10504);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str90, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int95 + "' != '" + 10504 + "'", int95 == 10504);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getDetails();
        java.lang.String str11 = book6.toString();
        java.lang.String str12 = book6.getDetails();
        book6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10513, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10513, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str10, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10513, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10513, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str12, "Book: hi! by . Location: hi!. Purchasable: true");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        items.Book book6 = new items.Book("LibraryItem [itemId=951, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", true, false, "LibraryItem [itemId=5436, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book:  by Book:  by hi!. Location: . Purchasable: false. Location: LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        items.Book book6 = new items.Book("LibraryItem [itemId=2509, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6322, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=1237, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7628, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = book6.calculateOverduePenalty();
        java.lang.Class<?> wildcardClass8 = book6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        double double10 = book6.calculateOverduePenalty();
        java.lang.String str11 = book6.getPrice();
        java.lang.String str12 = book6.getPrice();
        java.lang.String str13 = book6.getTitle();
        boolean boolean14 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        items.Book book6 = new items.Book("LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "Book:  by hi!. Location: . Purchasable: false");
        book6.returnItem();
        book6.returnItem();
        java.lang.String str9 = book6.getPrice();
        boolean boolean10 = book6.isRented();
        boolean boolean11 = book6.isPurchasable();
        book6.setBorrowerEmail("LibraryItem [itemId=1275, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str9, "Book:  by hi!. Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        boolean boolean49 = book6.isPurchasable();
        book6.setLocation("LibraryItem [itemId=240, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        java.lang.String str54 = book6.getAuthor();
        double double55 = book6.calculateOverduePenalty();
        java.lang.String str56 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getDetails();
        boolean boolean9 = book6.isOverdue();
        book6.setIsPurchasable(false);
        boolean boolean12 = book6.isOverdue();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10523, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10523, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        book6.setLocation("LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.returnItem();
        boolean boolean12 = book6.isRented();
        boolean boolean13 = book6.isOverdue();
        java.lang.String str14 = book6.getDetails();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Book: hi! by . Location: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true" + "'", str14, "Book: hi! by . Location: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        boolean boolean10 = book6.isOverdue();
        java.lang.String str11 = book6.toString();
        java.lang.String str12 = book6.getAuthor();
        book6.setLocation("LibraryItem [itemId=7319, itemType=Book, location=LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10525, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10525, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10525, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10525, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        java.lang.String str49 = book6.toString();
        boolean boolean50 = book6.isOverdue();
        java.lang.String str51 = book6.getDetails();
        java.lang.String str52 = book6.getTitle();
        java.lang.String str53 = book6.getTitle();
        java.lang.String str54 = book6.getItemType();
        book6.setIsPurchasable(true);
        book6.setBorrowerEmail("LibraryItem [itemId=6828, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LibraryItem [itemId=10526, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str49, "LibraryItem [itemId=10526, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Book" + "'", str54, "Book");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getDetails();
        boolean boolean11 = book6.isPurchasable();
        boolean boolean12 = book6.isPurchasable();
        java.lang.String str13 = book6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10531, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10531, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str10, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book" + "'", str13, "Book");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getDetails();
        boolean boolean9 = book6.isOverdue();
        book6.returnItem();
        book6.setBorrowerEmail("LibraryItem [itemId=1148, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setBorrowerEmail("LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setLocation("LibraryItem [itemId=1413, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setLocation("LibraryItem [itemId=322, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean19 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        book6.returnItem();
        java.lang.String str9 = book6.getAuthor();
        items.Book book16 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str17 = book16.getDetails();
        book16.returnItem();
        java.lang.String str19 = book16.getAuthor();
        java.lang.String str20 = book16.getItemType();
        book16.setIsPurchasable(false);
        items.Book book29 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean30 = book29.isRented();
        book29.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean33 = book29.isRented();
        items.Book book40 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str41 = book40.getDetails();
        book40.returnItem();
        boolean boolean43 = book40.isPurchasable();
        double double44 = book40.calculateOverduePenalty();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        book51.returnItem();
        items.Book book59 = new items.Book("", "", true, true, "", "hi!");
        book59.returnItem();
        java.lang.String str61 = book59.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        book68.returnItem();
        java.lang.String str70 = book68.getAuthor();
        items.Book book77 = new items.Book("", "", true, true, "", "hi!");
        book77.returnItem();
        java.lang.String str79 = book77.getAuthor();
        java.lang.String str80 = book77.getAuthor();
        items.Book book87 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray88 = new items.LibraryItem[] { book59, book68, book77, book87 };
        java.util.ArrayList<items.LibraryItem> libraryItemList89 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList89, libraryItemArray88);
        boolean boolean91 = book51.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean92 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean93 = book29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean94 = book16.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean95 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean96 = book6.isRented();
        double double97 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str17, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Book" + "'", str20, "Book");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str41, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        boolean boolean9 = book6.isPurchasable();
        double double10 = book6.calculateOverduePenalty();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray54 = new items.LibraryItem[] { book25, book34, book43, book53 };
        java.util.ArrayList<items.LibraryItem> libraryItemList55 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList55, libraryItemArray54);
        boolean boolean57 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean58 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean59 = book6.isOverdue();
        java.lang.String str60 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        items.Book book6 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.toString();
        book6.returnItem();
        boolean boolean9 = book6.isPurchasable();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10548, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10548, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        items.Book book6 = new items.Book("LibraryItem [itemId=2387, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, false, "LibraryItem [itemId=1842, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1576, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.toString();
        book6.setLocation("LibraryItem [itemId=5165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str10 = book6.getDetails();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10549, itemType=Book, location=LibraryItem [itemId=2387, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1842, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10549, itemType=Book, location=LibraryItem [itemId=2387, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1842, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book: LibraryItem [itemId=1842, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=1576, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=5165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str10, "Book: LibraryItem [itemId=1842, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=1576, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=5165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        items.Book book6 = new items.Book("LibraryItem [itemId=3971, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1878, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=5287, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3002, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setBorrowerEmail("LibraryItem [itemId=8978, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        items.Book book6 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isRented();
        book6.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean10 = book6.isPurchasable();
        boolean boolean11 = book6.isPurchasable();
        java.lang.String str12 = book6.toString();
        double double13 = book6.calculateOverduePenalty();
        book6.setIsPurchasable(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=10551, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=10551, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        items.Book book6 = new items.Book("LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book:  by hi!. Location: . Purchasable: true", true, false, "LibraryItem [itemId=291, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=677, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book" + "'", str7, "Book");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        java.lang.String str19 = book17.getAuthor();
        java.lang.String str20 = book17.getAuthor();
        double double21 = book17.calculateOverduePenalty();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.returnItem();
        java.lang.String str47 = book45.getAuthor();
        items.Book book54 = new items.Book("", "", true, true, "", "hi!");
        book54.returnItem();
        java.lang.String str56 = book54.getAuthor();
        java.lang.String str57 = book54.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { book36, book45, book54, book64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        book6.setLocation("Book: hi! by . Location: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
        book6.setLocation("LibraryItem [itemId=2249, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(true);
        java.lang.Class<?> wildcardClass77 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        book6.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        boolean boolean9 = book6.isRented();
        boolean boolean10 = book6.isRented();
        double double11 = book6.calculateOverduePenalty();
        java.lang.String str12 = book6.getItemType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book" + "'", str12, "Book");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        items.Book book6 = new items.Book("LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1867, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2446, itemType=Book, location=LibraryItem [itemId=768, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=1121, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        items.Book book6 = new items.Book("LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", true, false, "LibraryItem [itemId=950, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=987, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getItemType();
        java.lang.String str8 = book6.getBorrowerEmail();
        java.lang.String str9 = book6.getBorrowerEmail();
        java.time.LocalDate localDate10 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate10, 2055, "LibraryItem [itemId=9513, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book" + "'", str7, "Book");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        double double47 = book6.calculateOverduePenalty();
        java.lang.String str48 = book6.getPrice();
        book6.setBorrowerEmail("LibraryItem [itemId=240, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getAuthor();
        java.lang.String str52 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        items.Book book6 = new items.Book("LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "Book:  by hi!. Location: . Purchasable: false");
        book6.returnItem();
        book6.returnItem();
        java.lang.String str9 = book6.getPrice();
        boolean boolean10 = book6.isRented();
        boolean boolean11 = book6.isPurchasable();
        java.lang.String str12 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str9, "Book:  by hi!. Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book:  by Book:  by hi!. Location: . Purchasable: false. Location: LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str12, "Book:  by Book:  by hi!. Location: . Purchasable: false. Location: LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        items.Book book6 = new items.Book("LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book:  by hi!. Location: . Purchasable: true", true, false, "Book: hi! by . Location: hi!. Purchasable: false", "LibraryItem [itemId=660, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.returnItem();
        java.time.LocalDate localDate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate8, 6959, "LibraryItem [itemId=8444, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        items.Book book6 = new items.Book("LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book:  by hi!. Location: . Purchasable: true", true, false, "Book: hi! by . Location: hi!. Purchasable: false", "LibraryItem [itemId=660, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setBorrowerEmail("LibraryItem [itemId=1391, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean9 = book6.isOverdue();
        items.Book book16 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str17 = book16.getDetails();
        java.lang.String str18 = book16.toString();
        book16.setIsPurchasable(false);
        items.Book book27 = new items.Book("", "", true, true, "", "hi!");
        book27.returnItem();
        boolean boolean29 = book27.isPurchasable();
        boolean boolean30 = book27.isRented();
        java.lang.String str31 = book27.getLocation();
        items.Book book38 = new items.Book("", "", true, true, "", "hi!");
        book38.returnItem();
        items.Book book46 = new items.Book("", "", true, true, "", "hi!");
        book46.returnItem();
        java.lang.String str48 = book46.getAuthor();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        book64.returnItem();
        java.lang.String str66 = book64.getAuthor();
        java.lang.String str67 = book64.getAuthor();
        items.Book book74 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray75 = new items.LibraryItem[] { book46, book55, book64, book74 };
        java.util.ArrayList<items.LibraryItem> libraryItemList76 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList76, libraryItemArray75);
        boolean boolean78 = book38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean79 = book27.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean80 = book16.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean81 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList76);
        java.time.LocalDate localDate82 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate82, 2222, "LibraryItem [itemId=1991, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str17, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LibraryItem [itemId=10576, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str18, "LibraryItem [itemId=10576, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        items.Book book6 = new items.Book("LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", true, false, "LibraryItem [itemId=950, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=987, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getItemType();
        book6.returnItem();
        items.Book book15 = new items.Book("", "", true, true, "", "hi!");
        book15.returnItem();
        java.lang.String str17 = book15.getAuthor();
        java.lang.String str18 = book15.getAuthor();
        double double19 = book15.calculateOverduePenalty();
        items.Book book26 = new items.Book("", "", true, true, "", "hi!");
        book26.returnItem();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        items.Book book52 = new items.Book("", "", true, true, "", "hi!");
        book52.returnItem();
        java.lang.String str54 = book52.getAuthor();
        java.lang.String str55 = book52.getAuthor();
        items.Book book62 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray63 = new items.LibraryItem[] { book34, book43, book52, book62 };
        java.util.ArrayList<items.LibraryItem> libraryItemList64 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList64, libraryItemArray63);
        boolean boolean66 = book26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList64);
        boolean boolean67 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList64);
        boolean boolean68 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList64);
        book6.setLocation("LibraryItem [itemId=6812, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book" + "'", str7, "Book");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        java.lang.String str49 = book6.toString();
        boolean boolean50 = book6.isOverdue();
        java.lang.String str51 = book6.getDetails();
        java.lang.String str52 = book6.getDetails();
        java.lang.String str53 = book6.toString();
        int int54 = book6.getItemId();
        java.lang.String str55 = book6.toString();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LibraryItem [itemId=10590, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str49, "LibraryItem [itemId=10590, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str52, "Book:  by hi!. Location: . Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LibraryItem [itemId=10590, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str53, "LibraryItem [itemId=10590, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10590 + "'", int54 == 10590);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "LibraryItem [itemId=10590, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str55, "LibraryItem [itemId=10590, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getDetails();
        boolean boolean52 = book6.isOverdue();
        java.lang.String str53 = book6.getDetails();
        book6.returnItem();
        java.lang.String str55 = book6.getBorrowerEmail();
        boolean boolean56 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10595, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10595, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str53, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str55, "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        items.Book book6 = new items.Book("LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=434, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=288, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getItemType();
        int int8 = book6.getItemId();
        java.lang.String str9 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book" + "'", str7, "Book");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10600 + "'", int8 == 10600);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        items.Book book6 = new items.Book("LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=281, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1113, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.toString();
        int int8 = book6.getItemId();
        java.lang.String str9 = book6.getPrice();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10601, itemType=Book, location=LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=281, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10601, itemType=Book, location=LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=281, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10601 + "'", int8 == 10601);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=1113, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=1113, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        items.Book book6 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isRented();
        book6.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean10 = book6.isPurchasable();
        java.lang.String str11 = book6.getPrice();
        boolean boolean12 = book6.isPurchasable();
        java.lang.String str13 = book6.getAuthor();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getDetails();
        java.lang.String str52 = book6.getDetails();
        book6.setLocation("LibraryItem [itemId=951, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setBorrowerEmail("LibraryItem [itemId=9707, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10603, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10603, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str52, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        items.Book book6 = new items.Book("LibraryItem [itemId=3033, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book:  by LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book. Purchasable: false", true, true, "LibraryItem [itemId=5580, itemType=Book, location=LibraryItem [itemId=2215, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1015, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7020, itemType=Book, location=LibraryItem [itemId=737, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=3033, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=3033, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        boolean boolean10 = book6.isPurchasable();
        int int11 = book6.getItemId();
        java.lang.String str12 = book6.getTitle();
        double double13 = book6.calculateOverduePenalty();
        java.lang.String str14 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=3355, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10610 + "'", int11 == 10610);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=10610, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=10610, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getDetails();
        boolean boolean52 = book6.isOverdue();
        java.lang.String str53 = book6.toString();
        boolean boolean54 = book6.isPurchasable();
        java.lang.String str55 = book6.getPrice();
        java.lang.String str56 = book6.getAuthor();
        boolean boolean57 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10611, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10611, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LibraryItem [itemId=10611, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str53, "LibraryItem [itemId=10611, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        items.Book book6 = new items.Book("LibraryItem [itemId=2298, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", "LibraryItem [itemId=2013, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isRented();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        java.lang.String str19 = book17.getAuthor();
        java.lang.String str20 = book17.getAuthor();
        double double21 = book17.calculateOverduePenalty();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.returnItem();
        java.lang.String str47 = book45.getAuthor();
        items.Book book54 = new items.Book("", "", true, true, "", "hi!");
        book54.returnItem();
        java.lang.String str56 = book54.getAuthor();
        java.lang.String str57 = book54.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { book36, book45, book54, book64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        java.lang.String str71 = book6.getPrice();
        book6.setLocation("LibraryItem [itemId=2946, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.Class<?> wildcardClass74 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        items.Book book6 = new items.Book("LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=251, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book13 = new items.Book("", "", true, true, "", "hi!");
        book13.returnItem();
        boolean boolean15 = book13.isPurchasable();
        items.Book book22 = new items.Book("hi!", "", true, false, "hi!", "");
        book22.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book31 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean32 = book31.isOverdue();
        items.Book book39 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean40 = book39.isOverdue();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        book47.returnItem();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        book64.returnItem();
        java.lang.String str66 = book64.getAuthor();
        items.Book book73 = new items.Book("", "", true, true, "", "hi!");
        book73.returnItem();
        java.lang.String str75 = book73.getAuthor();
        java.lang.String str76 = book73.getAuthor();
        items.Book book83 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray84 = new items.LibraryItem[] { book55, book64, book73, book83 };
        java.util.ArrayList<items.LibraryItem> libraryItemList85 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList85, libraryItemArray84);
        boolean boolean87 = book47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        items.LibraryItem[] libraryItemArray88 = new items.LibraryItem[] { book39, book47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList89 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList89, libraryItemArray88);
        boolean boolean91 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean92 = book22.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean93 = book13.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean94 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        java.lang.String str95 = book6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(libraryItemArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str95, "LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.setBorrowerEmail("");
        java.lang.String str13 = book6.getItemType();
        book6.returnItem();
        java.lang.String str15 = book6.getTitle();
        java.lang.String str16 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10634, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10634, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book" + "'", str13, "Book");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.toString();
        book6.setIsPurchasable(false);
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        boolean boolean19 = book17.isPurchasable();
        boolean boolean20 = book17.isRented();
        java.lang.String str21 = book17.getLocation();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.returnItem();
        java.lang.String str47 = book45.getAuthor();
        items.Book book54 = new items.Book("", "", true, true, "", "hi!");
        book54.returnItem();
        java.lang.String str56 = book54.getAuthor();
        java.lang.String str57 = book54.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { book36, book45, book54, book64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        java.lang.String str71 = book6.getItemType();
        java.lang.String str72 = book6.getBorrowerEmail();
        book6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=10635, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=10635, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Book" + "'", str71, "Book");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        book6.returnItem();
        book6.setLocation("LibraryItem [itemId=1524, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.setBorrowerEmail("");
        book6.setIsPurchasable(false);
        boolean boolean15 = book6.isOverdue();
        java.lang.String str16 = book6.getLocation();
        book6.setLocation("LibraryItem [itemId=5424, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.Class<?> wildcardClass19 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10647, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10647, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        items.Book book6 = new items.Book("LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "", "Book:  by hi!. Location: . Purchasable: true");
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str9 = book6.getItemType();
        java.lang.String str10 = book6.getAuthor();
        int int11 = book6.getItemId();
        java.lang.String str12 = book6.toString();
        boolean boolean13 = book6.isOverdue();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book" + "'", str9, "Book");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str10, "Book:  by hi!. Location: . Purchasable: true");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10649 + "'", int11 == 10649);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=10649, itemType=Book, location=LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=10649, itemType=Book, location=LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        items.Book book6 = new items.Book("LibraryItem [itemId=9303, itemType=Book, location=LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=281, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=9486, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=5494, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=10347, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        items.Book book6 = new items.Book("", "LibraryItem [itemId=2815, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1843, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=403, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.returnItem();
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        items.Book book6 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isRented();
        java.lang.String str8 = book6.getTitle();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str16 = book15.getDetails();
        book15.returnItem();
        java.lang.String str18 = book15.toString();
        book15.returnItem();
        java.lang.String str20 = book15.getBorrowerEmail();
        items.Book book27 = new items.Book("", "", true, true, "", "hi!");
        book27.returnItem();
        boolean boolean29 = book27.isPurchasable();
        boolean boolean30 = book27.isRented();
        java.lang.String str31 = book27.getLocation();
        items.Book book38 = new items.Book("", "", true, true, "", "hi!");
        book38.returnItem();
        items.Book book46 = new items.Book("", "", true, true, "", "hi!");
        book46.returnItem();
        java.lang.String str48 = book46.getAuthor();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        book64.returnItem();
        java.lang.String str66 = book64.getAuthor();
        java.lang.String str67 = book64.getAuthor();
        items.Book book74 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray75 = new items.LibraryItem[] { book46, book55, book64, book74 };
        java.util.ArrayList<items.LibraryItem> libraryItemList76 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList76, libraryItemArray75);
        boolean boolean78 = book38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean79 = book27.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean80 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean81 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str16, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LibraryItem [itemId=10653, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str18, "LibraryItem [itemId=10653, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.toString();
        java.lang.String str11 = book6.getLocation();
        int int12 = book6.getItemId();
        java.lang.String str13 = book6.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10660, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10660, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=10660, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=10660, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10660 + "'", int12 == 10660);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=10660, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=10660, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        java.lang.String str10 = book6.getDetails();
        java.lang.String str11 = book6.getAuthor();
        java.lang.String str12 = book6.getTitle();
        java.lang.String str13 = book6.toString();
        boolean boolean14 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str10, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=10661, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=10661, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        items.Book book6 = new items.Book("LibraryItem [itemId=2946, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "LibraryItem [itemId=10219, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2940, itemType=Book, location=LibraryItem [itemId=131, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=92, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.setBorrowerEmail("");
        book6.setIsPurchasable(false);
        boolean boolean15 = book6.isRented();
        java.lang.String str16 = book6.getItemType();
        boolean boolean17 = book6.isPurchasable();
        book6.returnItem();
        boolean boolean19 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10663, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10663, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Book" + "'", str16, "Book");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        items.Book book6 = new items.Book("Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book:  by hi!. Location: . Purchasable: true. Purchasable: true", "LibraryItem [itemId=9014, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=9174, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10664, itemType=Book, location=Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book:  by hi!. Location: . Purchasable: true. Purchasable: true, purchasable=false, title=LibraryItem [itemId=9174, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10664, itemType=Book, location=Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book:  by hi!. Location: . Purchasable: true. Purchasable: true, purchasable=false, title=LibraryItem [itemId=9174, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean7 = book6.isOverdue();
        java.lang.String str8 = book6.getBorrowerEmail();
        java.lang.String str9 = book6.toString();
        book6.returnItem();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10665, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10665, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        items.Book book6 = new items.Book("LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "Book:  by hi!. Location: . Purchasable: false");
        book6.returnItem();
        java.lang.String str8 = book6.getBorrowerEmail();
        boolean boolean9 = book6.isRented();
        book6.setLocation("LibraryItem [itemId=2317, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        java.lang.String str9 = book6.getAuthor();
        book6.setBorrowerEmail("LibraryItem [itemId=7392, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        items.Book book6 = new items.Book("LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "", "Book:  by hi!. Location: . Purchasable: true");
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        double double11 = book6.calculateOverduePenalty();
        boolean boolean12 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        items.Book book6 = new items.Book("LibraryItem [itemId=288, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=288, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getTitle();
        book6.setBorrowerEmail("LibraryItem [itemId=933, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int10 = book6.getItemId();
        boolean boolean11 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10669 + "'", int10 == 10669);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        java.lang.String str11 = book6.getAuthor();
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getLocation();
        int int14 = book6.getItemId();
        java.lang.String str15 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10670 + "'", int14 == 10670);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        items.Book book6 = new items.Book("LibraryItem [itemId=904, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=933, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "", "LibraryItem [itemId=434, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book13 = new items.Book("", "", true, true, "", "hi!");
        book13.returnItem();
        java.lang.String str15 = book13.getAuthor();
        java.lang.String str16 = book13.getAuthor();
        double double17 = book13.calculateOverduePenalty();
        items.Book book24 = new items.Book("", "", true, true, "", "hi!");
        book24.returnItem();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        items.Book book41 = new items.Book("", "", true, true, "", "hi!");
        book41.returnItem();
        java.lang.String str43 = book41.getAuthor();
        items.Book book50 = new items.Book("", "", true, true, "", "hi!");
        book50.returnItem();
        java.lang.String str52 = book50.getAuthor();
        java.lang.String str53 = book50.getAuthor();
        items.Book book60 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray61 = new items.LibraryItem[] { book32, book41, book50, book60 };
        java.util.ArrayList<items.LibraryItem> libraryItemList62 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList62, libraryItemArray61);
        boolean boolean64 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        boolean boolean65 = book13.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        boolean boolean66 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        double double67 = book6.calculateOverduePenalty();
        book6.setIsPurchasable(false);
        boolean boolean70 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        book6.returnItem();
        java.lang.String str11 = book6.getBorrowerEmail();
        items.Book book18 = new items.Book("", "", true, true, "", "hi!");
        book18.returnItem();
        boolean boolean20 = book18.isPurchasable();
        boolean boolean21 = book18.isRented();
        java.lang.String str22 = book18.getLocation();
        items.Book book29 = new items.Book("", "", true, true, "", "hi!");
        book29.returnItem();
        items.Book book37 = new items.Book("", "", true, true, "", "hi!");
        book37.returnItem();
        java.lang.String str39 = book37.getAuthor();
        items.Book book46 = new items.Book("", "", true, true, "", "hi!");
        book46.returnItem();
        java.lang.String str48 = book46.getAuthor();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        java.lang.String str58 = book55.getAuthor();
        items.Book book65 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray66 = new items.LibraryItem[] { book37, book46, book55, book65 };
        java.util.ArrayList<items.LibraryItem> libraryItemList67 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList67, libraryItemArray66);
        boolean boolean69 = book29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList67);
        boolean boolean70 = book18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList67);
        boolean boolean71 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList67);
        book6.setLocation("LibraryItem [itemId=1114, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        book6.setIsPurchasable(true);
        java.lang.String str78 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10678, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10678, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        book6.setIsPurchasable(true);
        java.lang.String str9 = book6.getBorrowerEmail();
        book6.returnItem();
        java.time.LocalDate localDate11 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate11, 4513, "LibraryItem [itemId=3523, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getDetails();
        boolean boolean52 = book6.isOverdue();
        java.lang.String str53 = book6.toString();
        boolean boolean54 = book6.isPurchasable();
        java.lang.String str55 = book6.getItemType();
        java.lang.String str56 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10686, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10686, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LibraryItem [itemId=10686, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str53, "LibraryItem [itemId=10686, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Book" + "'", str55, "Book");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        items.Book book6 = new items.Book("LibraryItem [itemId=8600, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=8478, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=10561, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7868, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        items.Book book6 = new items.Book("LibraryItem [itemId=2387, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, false, "LibraryItem [itemId=1842, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1576, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getAuthor();
        boolean boolean8 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=1576, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=1576, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getDetails();
        boolean boolean52 = book6.isOverdue();
        book6.setBorrowerEmail("LibraryItem [itemId=240, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setBorrowerEmail("LibraryItem [itemId=839, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean57 = book6.isOverdue();
        java.lang.String str58 = book6.toString();
        java.lang.String str59 = book6.getTitle();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10693, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10693, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "LibraryItem [itemId=10693, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str58, "LibraryItem [itemId=10693, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        items.Book book6 = new items.Book("LibraryItem [itemId=3396, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1936, itemType=Book, location=LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2151, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=9239, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        boolean boolean10 = book6.isPurchasable();
        boolean boolean11 = book6.isPurchasable();
        items.Book book18 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str19 = book18.getDetails();
        java.lang.String str20 = book18.getDetails();
        boolean boolean21 = book18.isOverdue();
        items.Book book28 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean29 = book28.isOverdue();
        items.Book book36 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean37 = book36.isOverdue();
        items.Book book44 = new items.Book("", "", true, true, "", "hi!");
        book44.returnItem();
        items.Book book52 = new items.Book("", "", true, true, "", "hi!");
        book52.returnItem();
        java.lang.String str54 = book52.getAuthor();
        items.Book book61 = new items.Book("", "", true, true, "", "hi!");
        book61.returnItem();
        java.lang.String str63 = book61.getAuthor();
        items.Book book70 = new items.Book("", "", true, true, "", "hi!");
        book70.returnItem();
        java.lang.String str72 = book70.getAuthor();
        java.lang.String str73 = book70.getAuthor();
        items.Book book80 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book52, book61, book70, book80 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        items.LibraryItem[] libraryItemArray85 = new items.LibraryItem[] { book36, book44 };
        java.util.ArrayList<items.LibraryItem> libraryItemList86 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList86, libraryItemArray85);
        boolean boolean88 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean89 = book18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean90 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean91 = book6.isOverdue();
        java.lang.String str92 = book6.getPrice();
        java.lang.String str93 = book6.toString();
        double double94 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str19, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str20, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(libraryItemArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "LibraryItem [itemId=10699, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str93, "LibraryItem [itemId=10699, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        book6.setIsPurchasable(true);
        book6.returnItem();
        java.lang.String str10 = book6.getAuthor();
        java.lang.String str11 = book6.toString();
        java.lang.String str12 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10708, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10708, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getDetails();
        boolean boolean52 = book6.isOverdue();
        java.lang.String str53 = book6.toString();
        boolean boolean54 = book6.isPurchasable();
        java.lang.String str55 = book6.getItemType();
        boolean boolean56 = book6.isOverdue();
        java.lang.String str57 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10709, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10709, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LibraryItem [itemId=10709, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str53, "LibraryItem [itemId=10709, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Book" + "'", str55, "Book");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        items.Book book6 = new items.Book("LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "", "Book:  by hi!. Location: . Purchasable: true");
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        java.lang.String str11 = book6.toString();
        java.lang.String str12 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10714, itemType=Book, location=LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10714, itemType=Book, location=LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str12, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        items.Book book6 = new items.Book("Book:  by hi!. Location: . Purchasable: true", "LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getLocation();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getDetails();
        items.Book book17 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str18 = book17.getDetails();
        book17.returnItem();
        boolean boolean20 = book17.isPurchasable();
        double double21 = book17.calculateOverduePenalty();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.returnItem();
        java.lang.String str47 = book45.getAuthor();
        items.Book book54 = new items.Book("", "", true, true, "", "hi!");
        book54.returnItem();
        java.lang.String str56 = book54.getAuthor();
        java.lang.String str57 = book54.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { book36, book45, book54, book64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean71 = book6.isOverdue();
        java.lang.String str72 = book6.getTitle();
        book6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str7, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10715, itemType=Book, location=Book:  by hi!. Location: . Purchasable: true, purchasable=true, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10715, itemType=Book, location=Book:  by hi!. Location: . Purchasable: true, purchasable=true, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book:  by hi!. Location: . Purchasable: true. Purchasable: true" + "'", str10, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book:  by hi!. Location: . Purchasable: true. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str18, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str72, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        java.lang.String str11 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=941, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book6.getAuthor();
        java.lang.String str15 = book6.getDetails();
        java.lang.String str16 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10722, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10722, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str15, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        items.Book book6 = new items.Book("LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6974, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=9513, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7146, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        items.Book book6 = new items.Book("Book:  by hi!. Location: . Purchasable: true", "LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getLocation();
        boolean boolean8 = book6.isRented();
        java.lang.String str9 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str7, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        java.lang.String str53 = book6.getDetails();
        book6.setBorrowerEmail("LibraryItem [itemId=1576, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str56 = book6.toString();
        java.lang.String str57 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10725, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10725, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str53, "Book:  by hi!. Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "LibraryItem [itemId=10725, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str56, "LibraryItem [itemId=10725, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str57, "Book:  by hi!. Location: . Purchasable: false");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isPurchasable();
        double double10 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        items.Book book6 = new items.Book("", "LibraryItem [itemId=3118, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2630, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getPrice();
        boolean boolean8 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        items.Book book6 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isRented();
        book6.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean10 = book6.isRented();
        book6.setIsPurchasable(false);
        book6.setBorrowerEmail("LibraryItem [itemId=1286, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str15 = book6.getDetails();
        java.lang.String str16 = book6.toString();
        double double17 = book6.calculateOverduePenalty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book:  by LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book. Purchasable: false" + "'", str15, "Book:  by LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book. Purchasable: false");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LibraryItem [itemId=10732, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str16, "LibraryItem [itemId=10732, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        double double7 = book6.calculateOverduePenalty();
        boolean boolean8 = book6.isOverdue();
        java.lang.String str9 = book6.getAuthor();
        java.time.LocalDate localDate10 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate10, (int) ' ', "LibraryItem [itemId=1908, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        items.Book book6 = new items.Book("LibraryItem [itemId=8574, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=6480, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6991, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.returnItem();
        java.lang.String str12 = book6.toString();
        boolean boolean13 = book6.isRented();
        boolean boolean14 = book6.isRented();
        book6.setIsPurchasable(true);
        boolean boolean17 = book6.isRented();
        java.lang.String str18 = book6.getItemType();
        boolean boolean19 = book6.isPurchasable();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10735, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10735, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=10735, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=10735, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book" + "'", str18, "Book");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        book15.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean33 = book32.isOverdue();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        java.lang.String str69 = book66.getAuthor();
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book48, book57, book66, book76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book32, book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean85 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean86 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        book6.returnItem();
        java.lang.String str88 = book6.getTitle();
        double double89 = book6.calculateOverduePenalty();
        java.lang.String str90 = book6.getLocation();
        java.lang.String str91 = book6.getItemType();
        book6.setLocation("LibraryItem [itemId=6990, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Book" + "'", str91, "Book");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        items.Book book6 = new items.Book("LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2813, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2860, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1592, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setLocation("LibraryItem [itemId=6492, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str9 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=2860, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=2860, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        book6.returnItem();
        int int9 = book6.getItemId();
        book6.setLocation("");
        java.lang.String str12 = book6.getTitle();
        java.lang.String str13 = book6.toString();
        double double14 = book6.calculateOverduePenalty();
        java.lang.String str15 = book6.toString();
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10746 + "'", int9 == 10746);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=10746, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=10746, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LibraryItem [itemId=10746, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str15, "LibraryItem [itemId=10746, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        book6.setIsPurchasable(true);
        book6.returnItem();
        java.lang.String str10 = book6.getAuthor();
        java.lang.String str11 = book6.getItemType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        book6.setIsPurchasable(true);
        java.lang.String str9 = book6.getBorrowerEmail();
        java.lang.Class<?> wildcardClass10 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        java.lang.String str49 = book6.getPrice();
        boolean boolean50 = book6.isPurchasable();
        int int51 = book6.getItemId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10750, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10750, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10750 + "'", int51 == 10750);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        double double10 = book6.calculateOverduePenalty();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray54 = new items.LibraryItem[] { book25, book34, book43, book53 };
        java.util.ArrayList<items.LibraryItem> libraryItemList55 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList55, libraryItemArray54);
        boolean boolean57 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean58 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean59 = book6.isRented();
        book6.setBorrowerEmail("LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        items.Book book6 = new items.Book("LibraryItem [itemId=7227, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=6807, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3523, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=3523, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=3523, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getLocation();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10762, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10762, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        items.Book book6 = new items.Book("LibraryItem [itemId=791, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=288, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=322, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getTitle();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=322, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=322, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        boolean boolean9 = book6.isPurchasable();
        double double10 = book6.calculateOverduePenalty();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray54 = new items.LibraryItem[] { book25, book34, book43, book53 };
        java.util.ArrayList<items.LibraryItem> libraryItemList55 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList55, libraryItemArray54);
        boolean boolean57 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean58 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean59 = book6.isRented();
        boolean boolean60 = book6.isPurchasable();
        boolean boolean61 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        book6.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book15 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean16 = book15.isOverdue();
        items.Book book23 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean24 = book23.isOverdue();
        items.Book book31 = new items.Book("", "", true, true, "", "hi!");
        book31.returnItem();
        items.Book book39 = new items.Book("", "", true, true, "", "hi!");
        book39.returnItem();
        java.lang.String str41 = book39.getAuthor();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        java.lang.String str60 = book57.getAuthor();
        items.Book book67 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray68 = new items.LibraryItem[] { book39, book48, book57, book67 };
        java.util.ArrayList<items.LibraryItem> libraryItemList69 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList69, libraryItemArray68);
        boolean boolean71 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        items.LibraryItem[] libraryItemArray72 = new items.LibraryItem[] { book23, book31 };
        java.util.ArrayList<items.LibraryItem> libraryItemList73 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList73, libraryItemArray72);
        boolean boolean75 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean76 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean77 = book6.isPurchasable();
        java.lang.String str78 = book6.getLocation();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(libraryItemArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        java.lang.String str49 = book6.toString();
        java.lang.String str50 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "LibraryItem [itemId=10778, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str49, "LibraryItem [itemId=10778, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        boolean boolean10 = book6.isPurchasable();
        int int11 = book6.getItemId();
        java.lang.String str12 = book6.getTitle();
        double double13 = book6.calculateOverduePenalty();
        boolean boolean14 = book6.isOverdue();
        java.lang.String str15 = book6.getItemType();
        book6.returnItem();
        java.lang.String str17 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10783 + "'", int11 == 10783);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book" + "'", str15, "Book");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        items.Book book6 = new items.Book("LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "", "Book:  by hi!. Location: . Purchasable: true");
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str9 = book6.getItemType();
        java.lang.String str10 = book6.getAuthor();
        int int11 = book6.getItemId();
        java.lang.String str12 = book6.toString();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book" + "'", str9, "Book");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str10, "Book:  by hi!. Location: . Purchasable: true");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10784 + "'", int11 == 10784);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=10784, itemType=Book, location=LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=10784, itemType=Book, location=LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getDetails();
        boolean boolean9 = book6.isRented();
        int int10 = book6.getItemId();
        java.lang.String str11 = book6.getBorrowerEmail();
        java.lang.String str12 = book6.getDetails();
        java.lang.String str13 = book6.getTitle();
        java.lang.String str14 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10785 + "'", int10 == 10785);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str12, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.setBorrowerEmail("LibraryItem [itemId=886, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean13 = book6.isPurchasable();
        int int14 = book6.getItemId();
        book6.setBorrowerEmail("LibraryItem [itemId=10548, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10786, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10786, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10786 + "'", int14 == 10786);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        boolean boolean53 = book6.isPurchasable();
        book6.returnItem();
        boolean boolean55 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10787, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10787, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        items.Book book6 = new items.Book("LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=92, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book");
        java.lang.String str7 = book6.getLocation();
        java.lang.String str8 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book" + "'", str8, "Book");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        double double49 = book6.calculateOverduePenalty();
        book6.returnItem();
        java.lang.String str51 = book6.getAuthor();
        boolean boolean52 = book6.isOverdue();
        boolean boolean53 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        boolean boolean10 = book6.isPurchasable();
        int int11 = book6.getItemId();
        java.lang.String str12 = book6.getTitle();
        double double13 = book6.calculateOverduePenalty();
        java.lang.String str14 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=3355, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = book6.getItemType();
        book6.setLocation("LibraryItem [itemId=5516, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10798 + "'", int11 == 10798);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=10798, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=10798, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Book" + "'", str17, "Book");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getBorrowerEmail();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10799, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10799, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        items.Book book6 = new items.Book("LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "Book:  by hi!. Location: . Purchasable: false");
        book6.returnItem();
        java.lang.String str8 = book6.getLocation();
        java.lang.String str9 = book6.getItemType();
        items.Book book16 = new items.Book("", "", true, true, "", "hi!");
        book16.returnItem();
        java.lang.String str18 = book16.getAuthor();
        book16.setIsPurchasable(true);
        items.Book book27 = new items.Book("", "", true, true, "", "hi!");
        book27.returnItem();
        java.lang.String str29 = book27.getAuthor();
        java.lang.String str30 = book27.getAuthor();
        double double31 = book27.calculateOverduePenalty();
        items.Book book38 = new items.Book("", "", true, true, "", "hi!");
        book38.returnItem();
        items.Book book46 = new items.Book("", "", true, true, "", "hi!");
        book46.returnItem();
        java.lang.String str48 = book46.getAuthor();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        book64.returnItem();
        java.lang.String str66 = book64.getAuthor();
        java.lang.String str67 = book64.getAuthor();
        items.Book book74 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray75 = new items.LibraryItem[] { book46, book55, book64, book74 };
        java.util.ArrayList<items.LibraryItem> libraryItemList76 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList76, libraryItemArray75);
        boolean boolean78 = book38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean79 = book27.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean80 = book16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        boolean boolean81 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList76);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book" + "'", str9, "Book");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.returnItem();
        boolean boolean12 = book6.isOverdue();
        java.lang.String str13 = book6.getItemType();
        java.lang.String str14 = book6.getAuthor();
        java.lang.String str15 = book6.getAuthor();
        boolean boolean16 = book6.isOverdue();
        book6.setLocation("LibraryItem [itemId=6126, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str19 = book6.getAuthor();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10808, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10808, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book" + "'", str13, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        items.Book book6 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getPrice();
        java.lang.String str8 = book6.toString();
        java.lang.String str9 = book6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=10809, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=10809, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10809, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10809, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.returnItem();
        java.lang.String str12 = book6.toString();
        boolean boolean13 = book6.isRented();
        boolean boolean14 = book6.isRented();
        items.Book book21 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str22 = book21.toString();
        items.Book book29 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean30 = book29.isOverdue();
        items.Book book37 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean38 = book37.isOverdue();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.returnItem();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        book53.returnItem();
        java.lang.String str55 = book53.getAuthor();
        items.Book book62 = new items.Book("", "", true, true, "", "hi!");
        book62.returnItem();
        java.lang.String str64 = book62.getAuthor();
        items.Book book71 = new items.Book("", "", true, true, "", "hi!");
        book71.returnItem();
        java.lang.String str73 = book71.getAuthor();
        java.lang.String str74 = book71.getAuthor();
        items.Book book81 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray82 = new items.LibraryItem[] { book53, book62, book71, book81 };
        java.util.ArrayList<items.LibraryItem> libraryItemList83 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList83, libraryItemArray82);
        boolean boolean85 = book45.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList83);
        items.LibraryItem[] libraryItemArray86 = new items.LibraryItem[] { book37, book45 };
        java.util.ArrayList<items.LibraryItem> libraryItemList87 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList87, libraryItemArray86);
        boolean boolean89 = book29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean90 = book21.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean91 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        book6.setIsPurchasable(false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10810, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10810, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=10810, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=10810, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "LibraryItem [itemId=10811, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str22, "LibraryItem [itemId=10811, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(libraryItemArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        double double10 = book6.calculateOverduePenalty();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray54 = new items.LibraryItem[] { book25, book34, book43, book53 };
        java.util.ArrayList<items.LibraryItem> libraryItemList55 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList55, libraryItemArray54);
        boolean boolean57 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean58 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean59 = book6.isRented();
        java.lang.String str60 = book6.getLocation();
        book6.setIsPurchasable(false);
        java.lang.String str63 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        items.Book book6 = new items.Book("LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", true, false, "LibraryItem [itemId=950, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=987, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getItemType();
        book6.returnItem();
        boolean boolean9 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book" + "'", str7, "Book");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.returnItem();
        java.lang.String str12 = book6.toString();
        boolean boolean13 = book6.isRented();
        boolean boolean14 = book6.isRented();
        java.lang.String str15 = book6.getItemType();
        double double16 = book6.calculateOverduePenalty();
        double double17 = book6.calculateOverduePenalty();
        java.lang.String str18 = book6.toString();
        double double19 = book6.calculateOverduePenalty();
        boolean boolean20 = book6.isRented();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10827, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10827, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=10827, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=10827, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book" + "'", str15, "Book");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LibraryItem [itemId=10827, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str18, "LibraryItem [itemId=10827, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        book6.setIsPurchasable(false);
        java.lang.String str11 = book6.getAuthor();
        items.Book book18 = new items.Book("", "", true, true, "", "hi!");
        book18.returnItem();
        boolean boolean20 = book18.isPurchasable();
        boolean boolean21 = book18.isRented();
        book18.setIsPurchasable(false);
        double double24 = book18.calculateOverduePenalty();
        items.Book book31 = new items.Book("", "", true, true, "", "hi!");
        book31.returnItem();
        java.lang.String str33 = book31.getAuthor();
        book31.setIsPurchasable(true);
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        book42.returnItem();
        java.lang.String str44 = book42.getAuthor();
        java.lang.String str45 = book42.getAuthor();
        double double46 = book42.calculateOverduePenalty();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        book53.returnItem();
        items.Book book61 = new items.Book("", "", true, true, "", "hi!");
        book61.returnItem();
        java.lang.String str63 = book61.getAuthor();
        items.Book book70 = new items.Book("", "", true, true, "", "hi!");
        book70.returnItem();
        java.lang.String str72 = book70.getAuthor();
        items.Book book79 = new items.Book("", "", true, true, "", "hi!");
        book79.returnItem();
        java.lang.String str81 = book79.getAuthor();
        java.lang.String str82 = book79.getAuthor();
        items.Book book89 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray90 = new items.LibraryItem[] { book61, book70, book79, book89 };
        java.util.ArrayList<items.LibraryItem> libraryItemList91 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList91, libraryItemArray90);
        boolean boolean93 = book53.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList91);
        boolean boolean94 = book42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList91);
        boolean boolean95 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList91);
        boolean boolean96 = book18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList91);
        boolean boolean97 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList91);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        book15.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean33 = book32.isOverdue();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        java.lang.String str69 = book66.getAuthor();
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book48, book57, book66, book76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book32, book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean85 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean86 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        book6.setIsPurchasable(false);
        boolean boolean89 = book6.isPurchasable();
        java.lang.String str90 = book6.getItemType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Book" + "'", str90, "Book");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        items.Book book6 = new items.Book("LibraryItem [itemId=5196, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=8181, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=8674, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4997, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        boolean boolean47 = book6.isOverdue();
        java.lang.String str48 = book6.getDetails();
        java.lang.String str49 = book6.getPrice();
        boolean boolean50 = book6.isPurchasable();
        java.lang.String str51 = book6.getBorrowerEmail();
        int int52 = book6.getItemId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str48, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10847 + "'", int52 == 10847);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        items.Book book6 = new items.Book("LibraryItem [itemId=2443, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2611, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=10462, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7092, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        items.Book book6 = new items.Book("LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "Book:  by hi!. Location: . Purchasable: false");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        boolean boolean9 = book6.isOverdue();
        boolean boolean10 = book6.isRented();
        book6.setLocation("LibraryItem [itemId=4314, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        java.lang.String str10 = book6.toString();
        book6.returnItem();
        java.lang.String str12 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=10854, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=10854, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.getAuthor();
        java.lang.String str10 = book6.getItemType();
        book6.setIsPurchasable(false);
        items.Book book19 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean20 = book19.isRented();
        book19.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean23 = book19.isRented();
        items.Book book30 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str31 = book30.getDetails();
        book30.returnItem();
        boolean boolean33 = book30.isPurchasable();
        double double34 = book30.calculateOverduePenalty();
        items.Book book41 = new items.Book("", "", true, true, "", "hi!");
        book41.returnItem();
        items.Book book49 = new items.Book("", "", true, true, "", "hi!");
        book49.returnItem();
        java.lang.String str51 = book49.getAuthor();
        items.Book book58 = new items.Book("", "", true, true, "", "hi!");
        book58.returnItem();
        java.lang.String str60 = book58.getAuthor();
        items.Book book67 = new items.Book("", "", true, true, "", "hi!");
        book67.returnItem();
        java.lang.String str69 = book67.getAuthor();
        java.lang.String str70 = book67.getAuthor();
        items.Book book77 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray78 = new items.LibraryItem[] { book49, book58, book67, book77 };
        java.util.ArrayList<items.LibraryItem> libraryItemList79 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList79, libraryItemArray78);
        boolean boolean81 = book41.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean82 = book30.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean83 = book19.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean84 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList79);
        java.lang.String str85 = book6.getBorrowerEmail();
        java.lang.String str86 = book6.getItemType();
        java.lang.String str87 = book6.getItemType();
        java.lang.String str88 = book6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book" + "'", str10, "Book");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str31, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Book" + "'", str86, "Book");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Book" + "'", str87, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str88 + "' != '" + "LibraryItem [itemId=10855, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str88, "LibraryItem [itemId=10855, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getDetails();
        book6.returnItem();
        java.lang.String str12 = book6.getPrice();
        boolean boolean13 = book6.isRented();
        book6.setBorrowerEmail("LibraryItem [itemId=288, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10863, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10863, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str10, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        double double10 = book6.calculateOverduePenalty();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray54 = new items.LibraryItem[] { book25, book34, book43, book53 };
        java.util.ArrayList<items.LibraryItem> libraryItemList55 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList55, libraryItemArray54);
        boolean boolean57 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean58 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean59 = book6.isRented();
        book6.setBorrowerEmail("");
        java.lang.String str62 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getDetails();
        boolean boolean9 = book6.isRented();
        int int10 = book6.getItemId();
        java.lang.String str11 = book6.getBorrowerEmail();
        book6.returnItem();
        int int13 = book6.getItemId();
        boolean boolean14 = book6.isOverdue();
        java.lang.String str15 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10871 + "'", int10 == 10871);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10871 + "'", int13 == 10871);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str15, "Book: hi! by . Location: hi!. Purchasable: true");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        java.lang.String str53 = book6.getDetails();
        book6.setIsPurchasable(false);
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10872, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10872, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str53, "Book:  by hi!. Location: . Purchasable: false");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        items.Book book6 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getPrice();
        java.lang.String str8 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        boolean boolean9 = book6.isRented();
        boolean boolean10 = book6.isOverdue();
        boolean boolean11 = book6.isRented();
        java.lang.String str12 = book6.toString();
        java.lang.String str13 = book6.getItemType();
        items.Book book20 = new items.Book("", "", true, true, "", "hi!");
        book20.returnItem();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        java.lang.String str30 = book28.getAuthor();
        items.Book book37 = new items.Book("", "", true, true, "", "hi!");
        book37.returnItem();
        java.lang.String str39 = book37.getAuthor();
        items.Book book46 = new items.Book("", "", true, true, "", "hi!");
        book46.returnItem();
        java.lang.String str48 = book46.getAuthor();
        java.lang.String str49 = book46.getAuthor();
        items.Book book56 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray57 = new items.LibraryItem[] { book28, book37, book46, book56 };
        java.util.ArrayList<items.LibraryItem> libraryItemList58 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList58, libraryItemArray57);
        boolean boolean60 = book20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList58);
        boolean boolean61 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList58);
        java.lang.String str62 = book6.getBorrowerEmail();
        book6.setBorrowerEmail("LibraryItem [itemId=2904, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=10878, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=10878, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book" + "'", str13, "Book");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getDetails();
        java.lang.String str9 = book6.getPrice();
        boolean boolean10 = book6.isRented();
        java.lang.String str11 = book6.getAuthor();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=10884, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=10884, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        items.Book book6 = new items.Book("LibraryItem [itemId=677, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1629, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=3753, itemType=Book, location=LibraryItem [itemId=791, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=322, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7078, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isOverdue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        items.Book book6 = new items.Book("LibraryItem [itemId=116, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2370, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3363, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.time.LocalDate localDate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate7, 10248, "LibraryItem [itemId=5283, itemType=Book, location=LibraryItem [itemId=2387, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1842, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        java.lang.String str49 = book6.getAuthor();
        java.lang.String str50 = book6.getTitle();
        java.lang.String str51 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        java.lang.String str11 = book6.getAuthor();
        java.lang.String str12 = book6.getLocation();
        int int13 = book6.getItemId();
        boolean boolean14 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10892 + "'", int13 == 10892);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.getTitle();
        java.lang.String str49 = book6.getTitle();
        book6.setIsPurchasable(true);
        int int52 = book6.getItemId();
        boolean boolean53 = book6.isRented();
        java.lang.String str54 = book6.getPrice();
        int int55 = book6.getItemId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10893 + "'", int52 == 10893);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10893 + "'", int55 == 10893);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        book15.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean33 = book32.isOverdue();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        java.lang.String str69 = book66.getAuthor();
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book48, book57, book66, book76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book32, book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean85 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean86 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        book6.returnItem();
        java.lang.String str88 = book6.getTitle();
        double double89 = book6.calculateOverduePenalty();
        java.lang.String str90 = book6.toString();
        double double91 = book6.calculateOverduePenalty();
        double double92 = book6.calculateOverduePenalty();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "LibraryItem [itemId=10898, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str90, "LibraryItem [itemId=10898, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.0d + "'", double92 == 0.0d);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        double double47 = book6.calculateOverduePenalty();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=2805, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean51 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10907, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10907, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        items.Book book6 = new items.Book("LibraryItem [itemId=1089, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1353, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=2920, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        items.Book book6 = new items.Book("LibraryItem [itemId=677, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=962, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1155, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=322, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=322, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=322, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=10913, itemType=Book, location=LibraryItem [itemId=677, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1155, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=10913, itemType=Book, location=LibraryItem [itemId=677, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1155, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.toString();
        java.lang.String str11 = book6.getLocation();
        java.lang.String str12 = book6.getBorrowerEmail();
        java.lang.String str13 = book6.toString();
        java.lang.String str14 = book6.getItemType();
        double double15 = book6.calculateOverduePenalty();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10914, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10914, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=10914, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=10914, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=10914, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=10914, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Book" + "'", str14, "Book");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.getAuthor();
        java.lang.String str10 = book6.getItemType();
        book6.setIsPurchasable(false);
        book6.setLocation("LibraryItem [itemId=495, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean15 = book6.isPurchasable();
        java.lang.String str16 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book" + "'", str10, "Book");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Book: hi! by . Location: LibraryItem [itemId=495, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str16, "Book: hi! by . Location: LibraryItem [itemId=495, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        double double49 = book6.calculateOverduePenalty();
        book6.returnItem();
        java.lang.String str51 = book6.getAuthor();
        java.lang.String str52 = book6.toString();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "LibraryItem [itemId=10916, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str52, "LibraryItem [itemId=10916, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getDetails();
        boolean boolean9 = book6.isOverdue();
        items.Book book16 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean17 = book16.isOverdue();
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        java.lang.String str42 = book40.getAuthor();
        items.Book book49 = new items.Book("", "", true, true, "", "hi!");
        book49.returnItem();
        java.lang.String str51 = book49.getAuthor();
        items.Book book58 = new items.Book("", "", true, true, "", "hi!");
        book58.returnItem();
        java.lang.String str60 = book58.getAuthor();
        java.lang.String str61 = book58.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray69 = new items.LibraryItem[] { book40, book49, book58, book68 };
        java.util.ArrayList<items.LibraryItem> libraryItemList70 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList70, libraryItemArray69);
        boolean boolean72 = book32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList70);
        items.LibraryItem[] libraryItemArray73 = new items.LibraryItem[] { book24, book32 };
        java.util.ArrayList<items.LibraryItem> libraryItemList74 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList74, libraryItemArray73);
        boolean boolean76 = book16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList74);
        boolean boolean77 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList74);
        java.lang.String str78 = book6.getTitle();
        boolean boolean79 = book6.isOverdue();
        book6.setLocation("LibraryItem [itemId=3349, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str82 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(libraryItemArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        items.Book book6 = new items.Book("LibraryItem [itemId=2215, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1015, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=1015, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=251, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getPrice();
        items.Book book14 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str15 = book14.toString();
        java.lang.String str16 = book14.getPrice();
        book14.setIsPurchasable(true);
        java.lang.String str19 = book14.getTitle();
        items.Book book26 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean27 = book26.isOverdue();
        items.Book book34 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean35 = book34.isOverdue();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        book42.returnItem();
        items.Book book50 = new items.Book("", "", true, true, "", "hi!");
        book50.returnItem();
        java.lang.String str52 = book50.getAuthor();
        items.Book book59 = new items.Book("", "", true, true, "", "hi!");
        book59.returnItem();
        java.lang.String str61 = book59.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        book68.returnItem();
        java.lang.String str70 = book68.getAuthor();
        java.lang.String str71 = book68.getAuthor();
        items.Book book78 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray79 = new items.LibraryItem[] { book50, book59, book68, book78 };
        java.util.ArrayList<items.LibraryItem> libraryItemList80 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList80, libraryItemArray79);
        boolean boolean82 = book42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        items.LibraryItem[] libraryItemArray83 = new items.LibraryItem[] { book34, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList84 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList84, libraryItemArray83);
        boolean boolean86 = book26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        boolean boolean87 = book14.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList84);
        boolean boolean88 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=251, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=251, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LibraryItem [itemId=10930, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str15, "LibraryItem [itemId=10930, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(libraryItemArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        items.Book book6 = new items.Book("LibraryItem [itemId=7392, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1469, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=6415, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3686, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isOverdue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        book6.returnItem();
        int int9 = book6.getItemId();
        book6.setLocation("");
        java.lang.String str12 = book6.getPrice();
        book6.setLocation("LibraryItem [itemId=4435, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.returnItem();
        java.lang.String str16 = book6.getDetails();
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10939 + "'", int9 == 10939);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Book:  by hi!. Location: LibraryItem [itemId=4435, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true" + "'", str16, "Book:  by hi!. Location: LibraryItem [itemId=4435, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        java.lang.String str19 = book17.getAuthor();
        java.lang.String str20 = book17.getAuthor();
        double double21 = book17.calculateOverduePenalty();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.returnItem();
        java.lang.String str47 = book45.getAuthor();
        items.Book book54 = new items.Book("", "", true, true, "", "hi!");
        book54.returnItem();
        java.lang.String str56 = book54.getAuthor();
        java.lang.String str57 = book54.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { book36, book45, book54, book64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        book6.setBorrowerEmail("LibraryItem [itemId=591, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str73 = book6.getDetails();
        boolean boolean74 = book6.isOverdue();
        book6.returnItem();
        book6.setLocation("LibraryItem [itemId=3294, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str73, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.getAuthor();
        book6.returnItem();
        java.lang.String str11 = book6.toString();
        book6.setLocation("LibraryItem [itemId=10525, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10947, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10947, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        items.Book book6 = new items.Book("LibraryItem [itemId=5477, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5733, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "", "LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getItemType();
        java.lang.String str8 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book" + "'", str7, "Book");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book:  by LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=5477, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str8, "Book:  by LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=5477, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.returnItem();
        boolean boolean12 = book6.isOverdue();
        java.lang.String str13 = book6.getItemType();
        java.lang.String str14 = book6.getAuthor();
        java.lang.String str15 = book6.getAuthor();
        boolean boolean16 = book6.isOverdue();
        java.lang.String str17 = book6.getPrice();
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=10949, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=10949, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book" + "'", str13, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.Class<?> wildcardClass7 = book6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        items.Book book6 = new items.Book("Book:  by hi!. Location: . Purchasable: true", "LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getDetails();
        double double8 = book6.calculateOverduePenalty();
        boolean boolean9 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book:  by hi!. Location: . Purchasable: true. Purchasable: true" + "'", str7, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=306, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Book:  by hi!. Location: . Purchasable: true. Purchasable: true");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        book15.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean33 = book32.isOverdue();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        java.lang.String str69 = book66.getAuthor();
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book48, book57, book66, book76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book32, book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean85 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean86 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        book6.setBorrowerEmail("Book:  by hi!. Location: . Purchasable: true");
        java.lang.String str89 = book6.getLocation();
        book6.setIsPurchasable(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isOverdue();
        items.Book book15 = new items.Book("", "", true, true, "", "hi!");
        book15.returnItem();
        boolean boolean17 = book15.isPurchasable();
        boolean boolean18 = book15.isRented();
        java.lang.String str19 = book15.getLocation();
        book15.setLocation("LibraryItem [itemId=434, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean22 = book15.isPurchasable();
        book15.setBorrowerEmail("LibraryItem [itemId=3148, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book31 = new items.Book("", "", true, true, "", "hi!");
        book31.returnItem();
        book31.returnItem();
        items.Book book40 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str41 = book40.getDetails();
        book40.returnItem();
        boolean boolean43 = book40.isPurchasable();
        double double44 = book40.calculateOverduePenalty();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        book51.returnItem();
        items.Book book59 = new items.Book("", "", true, true, "", "hi!");
        book59.returnItem();
        java.lang.String str61 = book59.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        book68.returnItem();
        java.lang.String str70 = book68.getAuthor();
        items.Book book77 = new items.Book("", "", true, true, "", "hi!");
        book77.returnItem();
        java.lang.String str79 = book77.getAuthor();
        java.lang.String str80 = book77.getAuthor();
        items.Book book87 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray88 = new items.LibraryItem[] { book59, book68, book77, book87 };
        java.util.ArrayList<items.LibraryItem> libraryItemList89 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList89, libraryItemArray88);
        boolean boolean91 = book51.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean92 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean93 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean94 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean95 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str41, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        book15.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean33 = book32.isOverdue();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        java.lang.String str69 = book66.getAuthor();
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book48, book57, book66, book76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book32, book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean85 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean86 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean87 = book6.isPurchasable();
        boolean boolean88 = book6.isRented();
        boolean boolean89 = book6.isPurchasable();
        java.lang.String str90 = book6.getAuthor();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getDetails();
        boolean boolean52 = book6.isOverdue();
        java.lang.String str53 = book6.toString();
        boolean boolean54 = book6.isPurchasable();
        java.lang.String str55 = book6.getItemType();
        java.lang.String str56 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=10979, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=10979, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "LibraryItem [itemId=10979, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str53, "LibraryItem [itemId=10979, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Book" + "'", str55, "Book");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        items.Book book6 = new items.Book("LibraryItem [itemId=549, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2071, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "", "LibraryItem [itemId=1021, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = book6.calculateOverduePenalty();
        boolean boolean8 = book6.isRented();
        boolean boolean9 = book6.isPurchasable();
        boolean boolean10 = book6.isOverdue();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        items.Book book6 = new items.Book("LibraryItem [itemId=2111, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2611, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=1614, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5306, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.time.LocalDate localDate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate7, 9188, "LibraryItem [itemId=1978, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        boolean boolean47 = book6.isOverdue();
        java.lang.String str48 = book6.getDetails();
        book6.setBorrowerEmail("LibraryItem [itemId=165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str51 = book6.getBorrowerEmail();
        book6.setLocation("LibraryItem [itemId=2018, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setLocation("LibraryItem [itemId=1727, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str56 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str48, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "LibraryItem [itemId=165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str51, "LibraryItem [itemId=165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "LibraryItem [itemId=165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str56, "LibraryItem [itemId=165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        items.Book book6 = new items.Book("LibraryItem [itemId=5422, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1575, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=6215, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3722, itemType=Book, location=LibraryItem [itemId=737, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = book6.calculateOverduePenalty();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        items.Book book6 = new items.Book("LibraryItem [itemId=6415, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=10898, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=4192, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=10601, itemType=Book, location=LibraryItem [itemId=1846, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=281, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        items.Book book6 = new items.Book("LibraryItem [itemId=116, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2370, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3363, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book13 = new items.Book("", "", true, true, "", "hi!");
        book13.returnItem();
        boolean boolean15 = book13.isPurchasable();
        boolean boolean16 = book13.isRented();
        boolean boolean17 = book13.isOverdue();
        boolean boolean18 = book13.isRented();
        java.lang.String str19 = book13.toString();
        java.lang.String str20 = book13.getItemType();
        items.Book book27 = new items.Book("", "", true, true, "", "hi!");
        book27.returnItem();
        items.Book book35 = new items.Book("", "", true, true, "", "hi!");
        book35.returnItem();
        java.lang.String str37 = book35.getAuthor();
        items.Book book44 = new items.Book("", "", true, true, "", "hi!");
        book44.returnItem();
        java.lang.String str46 = book44.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        book53.returnItem();
        java.lang.String str55 = book53.getAuthor();
        java.lang.String str56 = book53.getAuthor();
        items.Book book63 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray64 = new items.LibraryItem[] { book35, book44, book53, book63 };
        java.util.ArrayList<items.LibraryItem> libraryItemList65 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList65, libraryItemArray64);
        boolean boolean67 = book27.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList65);
        boolean boolean68 = book13.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList65);
        boolean boolean69 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList65);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LibraryItem [itemId=10999, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str19, "LibraryItem [itemId=10999, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Book" + "'", str20, "Book");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        double double10 = book6.calculateOverduePenalty();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray54 = new items.LibraryItem[] { book25, book34, book43, book53 };
        java.util.ArrayList<items.LibraryItem> libraryItemList55 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList55, libraryItemArray54);
        boolean boolean57 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean58 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean59 = book6.isRented();
        double double60 = book6.calculateOverduePenalty();
        java.lang.String str61 = book6.getPrice();
        boolean boolean62 = book6.isPurchasable();
        boolean boolean63 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        items.Book book6 = new items.Book("LibraryItem [itemId=409, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        java.lang.String str7 = book6.getLocation();
        boolean boolean8 = book6.isOverdue();
        book6.setLocation("LibraryItem [itemId=2813, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=409, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=409, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        book15.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean33 = book32.isOverdue();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        java.lang.String str69 = book66.getAuthor();
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book48, book57, book66, book76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book32, book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean85 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean86 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        book6.setBorrowerEmail("Book:  by hi!. Location: . Purchasable: true");
        boolean boolean89 = book6.isPurchasable();
        java.time.LocalDate localDate90 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate90, 3091, "LibraryItem [itemId=7438, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        book6.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        double double9 = book6.calculateOverduePenalty();
        java.lang.String str10 = book6.getAuthor();
        book6.setLocation("LibraryItem [itemId=3704, itemType=Book, location=LibraryItem [itemId=409, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=434, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book19 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book26 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean27 = book26.isOverdue();
        items.Book book34 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean35 = book34.isOverdue();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        book42.returnItem();
        items.Book book50 = new items.Book("", "", true, true, "", "hi!");
        book50.returnItem();
        java.lang.String str52 = book50.getAuthor();
        items.Book book59 = new items.Book("", "", true, true, "", "hi!");
        book59.returnItem();
        java.lang.String str61 = book59.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        book68.returnItem();
        java.lang.String str70 = book68.getAuthor();
        java.lang.String str71 = book68.getAuthor();
        items.Book book78 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray79 = new items.LibraryItem[] { book50, book59, book68, book78 };
        java.util.ArrayList<items.LibraryItem> libraryItemList80 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList80, libraryItemArray79);
        boolean boolean82 = book42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        items.LibraryItem[] libraryItemArray83 = new items.LibraryItem[] { book34, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList84 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList84, libraryItemArray83);
        boolean boolean86 = book26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        boolean boolean87 = book19.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        boolean boolean88 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList84);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(libraryItemArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        items.Book book6 = new items.Book("LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=251, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book13 = new items.Book("", "", true, true, "", "hi!");
        book13.returnItem();
        boolean boolean15 = book13.isPurchasable();
        items.Book book22 = new items.Book("hi!", "", true, false, "hi!", "");
        book22.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book31 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean32 = book31.isOverdue();
        items.Book book39 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean40 = book39.isOverdue();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        book47.returnItem();
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        book55.returnItem();
        java.lang.String str57 = book55.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        book64.returnItem();
        java.lang.String str66 = book64.getAuthor();
        items.Book book73 = new items.Book("", "", true, true, "", "hi!");
        book73.returnItem();
        java.lang.String str75 = book73.getAuthor();
        java.lang.String str76 = book73.getAuthor();
        items.Book book83 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray84 = new items.LibraryItem[] { book55, book64, book73, book83 };
        java.util.ArrayList<items.LibraryItem> libraryItemList85 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList85, libraryItemArray84);
        boolean boolean87 = book47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        items.LibraryItem[] libraryItemArray88 = new items.LibraryItem[] { book39, book47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList89 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList89, libraryItemArray88);
        boolean boolean91 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean92 = book22.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean93 = book13.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean94 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        java.lang.String str95 = book6.getLocation();
        java.lang.String str96 = book6.getPrice();
        book6.returnItem();
        java.lang.String str98 = book6.getDetails();
        java.lang.String str99 = book6.getItemType();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(libraryItemArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str95, "LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str96, "LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Book: LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str98, "Book: LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=64, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=263, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "Book" + "'", str99, "Book");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        items.Book book6 = new items.Book("LibraryItem [itemId=9095, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7868, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "", "LibraryItem [itemId=6807, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getTitle();
        book6.setBorrowerEmail("LibraryItem [itemId=886, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str13 = book6.getItemType();
        java.lang.String str14 = book6.getItemType();
        java.lang.String str15 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=11041, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=11041, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book" + "'", str13, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Book" + "'", str14, "Book");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        items.Book book6 = new items.Book("LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=92, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book");
        java.lang.String str7 = book6.toString();
        items.Book book14 = new items.Book("LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=92, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book");
        items.Book book21 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean22 = book21.isRented();
        book21.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean25 = book21.isRented();
        items.Book book32 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str33 = book32.getDetails();
        book32.returnItem();
        boolean boolean35 = book32.isPurchasable();
        double double36 = book32.calculateOverduePenalty();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        book51.returnItem();
        java.lang.String str53 = book51.getAuthor();
        items.Book book60 = new items.Book("", "", true, true, "", "hi!");
        book60.returnItem();
        java.lang.String str62 = book60.getAuthor();
        items.Book book69 = new items.Book("", "", true, true, "", "hi!");
        book69.returnItem();
        java.lang.String str71 = book69.getAuthor();
        java.lang.String str72 = book69.getAuthor();
        items.Book book79 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray80 = new items.LibraryItem[] { book51, book60, book69, book79 };
        java.util.ArrayList<items.LibraryItem> libraryItemList81 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList81, libraryItemArray80);
        boolean boolean83 = book43.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean84 = book32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean85 = book21.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean86 = book14.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean87 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean88 = book6.isPurchasable();
        book6.setIsPurchasable(true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=11042, itemType=Book, location=LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=11042, itemType=Book, location=LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str33, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        items.Book book6 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int7 = book6.getItemId();
        int int8 = book6.getItemId();
        java.lang.String str9 = book6.getDetails();
        java.lang.String str10 = book6.getAuthor();
        double double11 = book6.calculateOverduePenalty();
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11051 + "'", int7 == 11051);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11051 + "'", int8 == 11051);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str9, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.getTitle();
        java.lang.String str49 = book6.getTitle();
        book6.setIsPurchasable(true);
        int int52 = book6.getItemId();
        boolean boolean53 = book6.isRented();
        boolean boolean54 = book6.isOverdue();
        java.lang.String str55 = book6.getItemType();
        java.lang.String str56 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 11052 + "'", int52 == 11052);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Book" + "'", str55, "Book");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str56, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        java.lang.String str53 = book6.getDetails();
        java.lang.String str54 = book6.getBorrowerEmail();
        java.lang.String str55 = book6.getDetails();
        java.lang.String str56 = book6.getLocation();
        java.lang.String str57 = book6.toString();
        book6.setIsPurchasable(true);
        java.lang.String str60 = book6.getAuthor();
        java.lang.String str61 = book6.getItemType();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "LibraryItem [itemId=11057, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str48, "LibraryItem [itemId=11057, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str53, "Book:  by hi!. Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str54, "LibraryItem [itemId=90, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str55, "Book:  by hi!. Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "LibraryItem [itemId=11057, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str57, "LibraryItem [itemId=11057, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Book" + "'", str61, "Book");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        book6.returnItem();
        java.lang.String str50 = book6.getBorrowerEmail();
        double double51 = book6.calculateOverduePenalty();
        java.lang.String str52 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        book6.setIsPurchasable(false);
        book6.setLocation("LibraryItem [itemId=951, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book19 = new items.Book("", "", true, true, "", "hi!");
        book19.returnItem();
        java.lang.String str21 = book19.getAuthor();
        book19.setIsPurchasable(true);
        items.Book book30 = new items.Book("", "", true, true, "", "hi!");
        book30.returnItem();
        java.lang.String str32 = book30.getAuthor();
        java.lang.String str33 = book30.getAuthor();
        double double34 = book30.calculateOverduePenalty();
        items.Book book41 = new items.Book("", "", true, true, "", "hi!");
        book41.returnItem();
        items.Book book49 = new items.Book("", "", true, true, "", "hi!");
        book49.returnItem();
        java.lang.String str51 = book49.getAuthor();
        items.Book book58 = new items.Book("", "", true, true, "", "hi!");
        book58.returnItem();
        java.lang.String str60 = book58.getAuthor();
        items.Book book67 = new items.Book("", "", true, true, "", "hi!");
        book67.returnItem();
        java.lang.String str69 = book67.getAuthor();
        java.lang.String str70 = book67.getAuthor();
        items.Book book77 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray78 = new items.LibraryItem[] { book49, book58, book67, book77 };
        java.util.ArrayList<items.LibraryItem> libraryItemList79 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList79, libraryItemArray78);
        boolean boolean81 = book41.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean82 = book30.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean83 = book19.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean84 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        java.lang.String str85 = book6.getItemType();
        book6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Book" + "'", str85, "Book");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        double double10 = book6.calculateOverduePenalty();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.returnItem();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        book34.returnItem();
        java.lang.String str36 = book34.getAuthor();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        book43.returnItem();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getAuthor();
        items.Book book53 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray54 = new items.LibraryItem[] { book25, book34, book43, book53 };
        java.util.ArrayList<items.LibraryItem> libraryItemList55 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList55, libraryItemArray54);
        boolean boolean57 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean58 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList55);
        boolean boolean59 = book6.isRented();
        double double60 = book6.calculateOverduePenalty();
        book6.setBorrowerEmail("LibraryItem [itemId=6253, itemType=Book, location=LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str63 = book6.getAuthor();
        book6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        items.Book book15 = new items.Book("hi!", "", true, false, "hi!", "");
        book15.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        items.Book book24 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        boolean boolean33 = book32.isOverdue();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        book40.returnItem();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        book48.returnItem();
        java.lang.String str50 = book48.getAuthor();
        items.Book book57 = new items.Book("", "", true, true, "", "hi!");
        book57.returnItem();
        java.lang.String str59 = book57.getAuthor();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        book66.returnItem();
        java.lang.String str68 = book66.getAuthor();
        java.lang.String str69 = book66.getAuthor();
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book48, book57, book66, book76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        items.LibraryItem[] libraryItemArray81 = new items.LibraryItem[] { book32, book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList82 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList82, libraryItemArray81);
        boolean boolean84 = book24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean85 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        boolean boolean86 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList82);
        java.lang.String str87 = book6.getAuthor();
        book6.setBorrowerEmail("LibraryItem [itemId=7606, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(libraryItemArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        items.Book book6 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getDetails();
        java.lang.String str9 = book6.getTitle();
        java.lang.String str10 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str8, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str10, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        java.lang.String str19 = book17.getAuthor();
        java.lang.String str20 = book17.getAuthor();
        double double21 = book17.calculateOverduePenalty();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.returnItem();
        java.lang.String str47 = book45.getAuthor();
        items.Book book54 = new items.Book("", "", true, true, "", "hi!");
        book54.returnItem();
        java.lang.String str56 = book54.getAuthor();
        java.lang.String str57 = book54.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { book36, book45, book54, book64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        book6.setBorrowerEmail("LibraryItem [itemId=591, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str73 = book6.getDetails();
        boolean boolean74 = book6.isOverdue();
        java.lang.String str75 = book6.getBorrowerEmail();
        boolean boolean76 = book6.isRented();
        book6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str73, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "LibraryItem [itemId=591, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str75, "LibraryItem [itemId=591, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.getAuthor();
        java.lang.String str10 = book6.getAuthor();
        java.lang.String str11 = book6.toString();
        java.lang.String str12 = book6.getItemType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=11098, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=11098, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book" + "'", str12, "Book");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getTitle();
        java.lang.String str9 = book6.toString();
        java.lang.String str10 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=11099, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=11099, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str10, "Book: hi! by . Location: hi!. Purchasable: true");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        items.Book book6 = new items.Book("LibraryItem [itemId=3186, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1365, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=3454, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1715, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int7 = book6.getItemId();
        boolean boolean8 = book6.isRented();
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11100 + "'", int7 == 11100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        items.Book book6 = new items.Book("LibraryItem [itemId=197, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "Book:  by hi!. Location: . Purchasable: false");
        book6.returnItem();
        boolean boolean8 = book6.isPurchasable();
        boolean boolean9 = book6.isOverdue();
        boolean boolean10 = book6.isRented();
        book6.returnItem();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.getTitle();
        java.lang.String str49 = book6.getTitle();
        book6.setLocation("LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str52 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str52, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        items.Book book6 = new items.Book("LibraryItem [itemId=2282, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, false, "LibraryItem [itemId=2215, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=644, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=2282, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=2282, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        book6.returnItem();
        int int9 = book6.getItemId();
        book6.setLocation("");
        java.lang.String str12 = book6.getTitle();
        boolean boolean13 = book6.isOverdue();
        java.lang.String str14 = book6.toString();
        java.lang.String str15 = book6.getPrice();
        java.lang.String str16 = book6.getLocation();
        java.lang.String str17 = book6.toString();
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11108 + "'", int9 == 11108);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=11108, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=11108, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LibraryItem [itemId=11108, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str17, "LibraryItem [itemId=11108, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.getDetails();
        book6.returnItem();
        int int9 = book6.getItemId();
        book6.returnItem();
        java.lang.String str11 = book6.getAuthor();
        double double12 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str7, "Book: hi! by . Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11109 + "'", int9 == 11109);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        double double47 = book6.calculateOverduePenalty();
        book6.setIsPurchasable(false);
        java.lang.String str50 = book6.getBorrowerEmail();
        int int51 = book6.getItemId();
        book6.setLocation("LibraryItem [itemId=1089, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str54 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 11110 + "'", int51 == 11110);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Book:  by hi!. Location: LibraryItem [itemId=1089, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str54, "Book:  by hi!. Location: LibraryItem [itemId=1089, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        items.Book book6 = new items.Book("LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=229, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getDetails();
        java.lang.String str9 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str8, "Book: LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=383, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=110, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getPrice();
        book6.setIsPurchasable(true);
        items.Book book17 = new items.Book("Book", "LibraryItem [itemId=474, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=172, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean18 = book17.isRented();
        book17.setBorrowerEmail("LibraryItem [itemId=597, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean21 = book17.isRented();
        items.Book book28 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str29 = book28.getDetails();
        book28.returnItem();
        boolean boolean31 = book28.isPurchasable();
        double double32 = book28.calculateOverduePenalty();
        items.Book book39 = new items.Book("", "", true, true, "", "hi!");
        book39.returnItem();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        book47.returnItem();
        java.lang.String str49 = book47.getAuthor();
        items.Book book56 = new items.Book("", "", true, true, "", "hi!");
        book56.returnItem();
        java.lang.String str58 = book56.getAuthor();
        items.Book book65 = new items.Book("", "", true, true, "", "hi!");
        book65.returnItem();
        java.lang.String str67 = book65.getAuthor();
        java.lang.String str68 = book65.getAuthor();
        items.Book book75 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray76 = new items.LibraryItem[] { book47, book56, book65, book75 };
        java.util.ArrayList<items.LibraryItem> libraryItemList77 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList77, libraryItemArray76);
        boolean boolean79 = book39.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean80 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean81 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean82 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        java.lang.String str83 = book6.getItemType();
        java.lang.Class<?> wildcardClass84 = book6.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=11116, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=11116, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str29, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Book" + "'", str83, "Book");
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        book6.setIsPurchasable(true);
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.returnItem();
        java.lang.String str19 = book17.getAuthor();
        java.lang.String str20 = book17.getAuthor();
        double double21 = book17.calculateOverduePenalty();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        book28.returnItem();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        book36.returnItem();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.returnItem();
        java.lang.String str47 = book45.getAuthor();
        items.Book book54 = new items.Book("", "", true, true, "", "hi!");
        book54.returnItem();
        java.lang.String str56 = book54.getAuthor();
        java.lang.String str57 = book54.getAuthor();
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { book36, book45, book54, book64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        book6.setBorrowerEmail("LibraryItem [itemId=591, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str73 = book6.getDetails();
        boolean boolean74 = book6.isOverdue();
        java.lang.String str75 = book6.getBorrowerEmail();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str73, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "LibraryItem [itemId=591, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str75, "LibraryItem [itemId=591, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        items.Book book6 = new items.Book("LibraryItem [itemId=4210, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=9294, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2813, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5225, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        items.Book book6 = new items.Book("hi!", "hi!", true, true, "hi!", "");
        book6.setIsPurchasable(false);
        book6.setBorrowerEmail("Book: hi! by . Location: hi!. Purchasable: true");
        java.lang.String str11 = book6.getLocation();
        java.lang.String str12 = book6.getTitle();
        book6.setLocation("LibraryItem [itemId=6126, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean15 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        items.Book book6 = new items.Book("hi!", "", true, false, "hi!", "");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getDetails();
        java.lang.String str9 = book6.getPrice();
        boolean boolean10 = book6.isRented();
        java.lang.String str11 = book6.toString();
        boolean boolean12 = book6.isPurchasable();
        java.time.LocalDate localDate13 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate13, 0, "LibraryItem [itemId=5015, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=11133, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=11133, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book: hi! by . Location: hi!. Purchasable: true" + "'", str8, "Book: hi! by . Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=11133, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=11133, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        items.Book book6 = new items.Book("LibraryItem [itemId=7289, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7361, itemType=Book, location=LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=4610, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1937, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=11134, itemType=Book, location=LibraryItem [itemId=7289, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=4610, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=11134, itemType=Book, location=LibraryItem [itemId=7289, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=4610, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        java.lang.String str48 = book6.getTitle();
        java.lang.String str49 = book6.getTitle();
        book6.setIsPurchasable(true);
        book6.setLocation("LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double54 = book6.calculateOverduePenalty();
        java.lang.String str55 = book6.getItemType();
        java.lang.String str56 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Book" + "'", str55, "Book");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Book:  by hi!. Location: LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true" + "'", str56, "Book:  by hi!. Location: LibraryItem [itemId=136, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        boolean boolean10 = book6.isPurchasable();
        int int11 = book6.getItemId();
        java.lang.String str12 = book6.getTitle();
        java.lang.String str13 = book6.getBorrowerEmail();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11140 + "'", int11 == 11140);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        items.Book book6 = new items.Book("LibraryItem [itemId=5530, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=3466, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2798, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isOverdue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        items.Book book6 = new items.Book("LibraryItem [itemId=4207, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1816, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=8130, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7684, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        items.Book book6 = new items.Book("LibraryItem [itemId=178, itemType=Book, location=hi!, purchasable=false, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=92, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=170, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book");
        boolean boolean7 = book6.isPurchasable();
        java.lang.String str8 = book6.getBorrowerEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        boolean boolean47 = book6.isOverdue();
        java.lang.String str48 = book6.getDetails();
        book6.setBorrowerEmail("LibraryItem [itemId=165, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean51 = book6.isOverdue();
        book6.setIsPurchasable(true);
        java.lang.String str54 = book6.getAuthor();
        java.lang.Class<?> wildcardClass55 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str48, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        items.Book book6 = new items.Book("LibraryItem [itemId=10149, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4756, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=7565, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=10112, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        items.Book book14 = new items.Book("", "", true, true, "", "hi!");
        book14.returnItem();
        java.lang.String str16 = book14.getAuthor();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.returnItem();
        java.lang.String str25 = book23.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.returnItem();
        java.lang.String str34 = book32.getAuthor();
        java.lang.String str35 = book32.getAuthor();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book14, book23, book32, book42 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        java.lang.String str47 = book6.getItemType();
        double double48 = book6.calculateOverduePenalty();
        boolean boolean49 = book6.isPurchasable();
        java.lang.String str50 = book6.getTitle();
        java.lang.String str51 = book6.getLocation();
        book6.setLocation("LibraryItem [itemId=3856, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean54 = book6.isPurchasable();
        double double55 = book6.calculateOverduePenalty();
        book6.setBorrowerEmail("LibraryItem [itemId=10102, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Book" + "'", str47, "Book");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.returnItem();
        int int8 = book6.getItemId();
        boolean boolean9 = book6.isOverdue();
        boolean boolean10 = book6.isOverdue();
        int int11 = book6.getItemId();
        java.lang.String str12 = book6.getTitle();
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11155 + "'", int8 == 11155);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11155 + "'", int11 == 11155);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        items.Book book6 = new items.Book("LibraryItem [itemId=5240, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4029, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=6267, itemType=Book, location=hi!, purchasable=true, title=hi!, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4763, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }
}
