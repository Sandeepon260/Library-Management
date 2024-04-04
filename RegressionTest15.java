import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        items.Book book6 = new items.Book("LibraryItem [itemId=11515, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=32765, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=14564, itemType=Book, location=LibraryItem [itemId=653, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=12235, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        items.Book book6 = new items.Book("LibraryItem [itemId=877, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=872, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=1753, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1753, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getTitle();
        int int8 = book6.getItemId();
        items.Book book15 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str16 = book15.getAuthor();
        java.lang.String str17 = book15.getAuthor();
        java.lang.String str18 = book15.getBorrowerEmail();
        book15.setIsPurchasable(false);
        boolean boolean21 = book15.isOverdue();
        book15.setLocation("");
        java.lang.String str24 = book15.getAuthor();
// flaky:         book15.returnItem();
        java.lang.String str26 = book15.getItemType();
        items.Book book33 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str34 = book33.getAuthor();
        java.lang.String str35 = book33.getAuthor();
        boolean boolean36 = book33.isRented();
        book33.setBorrowerEmail("");
        java.lang.String str39 = book33.getTitle();
        double double40 = book33.calculateOverduePenalty();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str48 = book47.getAuthor();
        java.lang.String str49 = book47.getAuthor();
        boolean boolean50 = book47.isRented();
        java.lang.String str51 = book47.getAuthor();
        items.Book book58 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str59 = book58.getAuthor();
        java.lang.String str60 = book58.getAuthor();
        items.Book book67 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str68 = book67.getAuthor();
        items.LibraryItem[] libraryItemArray69 = new items.LibraryItem[] { book67 };
        java.util.ArrayList<items.LibraryItem> libraryItemList70 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList70, libraryItemArray69);
        boolean boolean72 = book58.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList70);
        boolean boolean73 = book47.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList70);
        boolean boolean74 = book33.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList70);
        boolean boolean75 = book15.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList70);
        boolean boolean76 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList70);
        boolean boolean77 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=1753, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=1753, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35996 + "'", int8 == 35996);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Book" + "'", str26, "Book");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        items.Book book16 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str17 = book16.getAuthor();
        java.lang.String str18 = book16.getAuthor();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str26 = book25.getAuthor();
        items.LibraryItem[] libraryItemArray27 = new items.LibraryItem[] { book25 };
        java.util.ArrayList<items.LibraryItem> libraryItemList28 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList28, libraryItemArray27);
        boolean boolean30 = book16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList28);
        boolean boolean31 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList28);
        java.lang.String str32 = book6.getTitle();
        book6.setIsPurchasable(true);
        boolean boolean35 = book6.isRented();
        book6.setLocation("LibraryItem [itemId=21924, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        items.Book book6 = new items.Book("hi!", "hi!", true, false, "Book", "Book:  by hi!. Location: . Purchasable: true");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.toString();
// flaky:         book6.returnItem();
        java.lang.String str10 = book6.getTitle();
        items.Book book17 = new items.Book("LibraryItem [itemId=806, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=809, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=1123, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=416, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str18 = book17.getAuthor();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        book25.setLocation("hi!");
        java.lang.String str28 = book25.getLocation();
        java.lang.String str29 = book25.getBorrowerEmail();
        java.lang.String str30 = book25.getTitle();
        java.lang.String str31 = book25.toString();
        items.Book book38 = new items.Book("", "", true, true, "", "hi!");
        book38.setLocation("hi!");
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str48 = book47.getAuthor();
        java.lang.String str49 = book47.getAuthor();
        items.Book book56 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str57 = book56.getAuthor();
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { book56 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = book47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = book38.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = book25.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean64 = book17.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean65 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str66 = book6.getPrice();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=36005, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=36005, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=36005, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=36005, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book" + "'", str10, "Book");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LibraryItem [itemId=416, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str18, "LibraryItem [itemId=416, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LibraryItem [itemId=36007, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str31, "LibraryItem [itemId=36007, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str66, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getDetails();
        book6.setLocation("hi!");
        java.lang.String str12 = book6.getPrice();
        java.lang.String str13 = book6.getAuthor();
        java.lang.String str14 = book6.toString();
        java.lang.String str15 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str9, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=36011, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=36011, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getLocation();
        boolean boolean11 = book6.isRented();
        double double12 = book6.calculateOverduePenalty();
        items.Book book19 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str20 = book19.getAuthor();
        java.lang.String str21 = book19.getAuthor();
        java.lang.String str22 = book19.getDetails();
        boolean boolean23 = book19.isPurchasable();
        boolean boolean24 = book19.isPurchasable();
        boolean boolean25 = book19.isRented();
        items.Book book32 = new items.Book("LibraryItem [itemId=868, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=291, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=770, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=437, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book39 = new items.Book("Book:  by hi!. Location: LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true", "Book:  by hi!. Location: . Purchasable: false", false, true, "LibraryItem [itemId=484, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=228, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         book39.returnItem();
        items.Book book47 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str48 = book47.getAuthor();
        java.lang.String str49 = book47.getAuthor();
        java.lang.String str50 = book47.getDetails();
        boolean boolean51 = book47.isPurchasable();
        boolean boolean52 = book47.isPurchasable();
        boolean boolean53 = book47.isRented();
        book47.setLocation("LibraryItem [itemId=405, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str56 = book47.getBorrowerEmail();
        items.Book book63 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str64 = book63.getAuthor();
        java.lang.String str65 = book63.getAuthor();
        boolean boolean66 = book63.isRented();
        java.lang.String str67 = book63.getAuthor();
        items.Book book74 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str75 = book74.getAuthor();
        java.lang.String str76 = book74.getAuthor();
        items.Book book83 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str84 = book83.getAuthor();
        items.LibraryItem[] libraryItemArray85 = new items.LibraryItem[] { book83 };
        java.util.ArrayList<items.LibraryItem> libraryItemList86 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList86, libraryItemArray85);
        boolean boolean88 = book74.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean89 = book63.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean90 = book47.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean91 = book39.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean92 = book32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean93 = book19.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean94 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        java.lang.String str95 = book6.getLocation();
        double double96 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str22, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str50, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getTitle();
        java.lang.String str12 = book6.getAuthor();
        java.lang.String str13 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getBorrowerEmail();
        book6.setIsPurchasable(false);
        boolean boolean12 = book6.isPurchasable();
        boolean boolean13 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        items.Book book16 = new items.Book("", "", true, true, "", "hi!");
        book16.setLocation("hi!");
        java.lang.String str19 = book16.getLocation();
        items.Book book26 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str27 = book26.getAuthor();
        java.lang.String str28 = book26.getAuthor();
        items.Book book35 = new items.Book("", "", true, true, "", "hi!");
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str43 = book42.getAuthor();
        java.lang.String str44 = book42.getAuthor();
        java.lang.String str45 = book42.getAuthor();
        items.Book book52 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str53 = book52.getAuthor();
        book52.setLocation("");
        items.Book book62 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str63 = book62.getAuthor();
        java.lang.String str64 = book62.getAuthor();
        java.lang.String str65 = book62.getAuthor();
        book62.setIsPurchasable(true);
        items.Book book74 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str75 = book74.getAuthor();
        book74.setLocation("");
        items.LibraryItem[] libraryItemArray78 = new items.LibraryItem[] { book16, book26, book35, book42, book52, book62, book74 };
        java.util.ArrayList<items.LibraryItem> libraryItemList79 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList79, libraryItemArray78);
        boolean boolean81 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        java.lang.String str82 = book6.getAuthor();
        boolean boolean83 = book6.isOverdue();
        java.lang.String str84 = book6.getItemType();
        java.lang.String str85 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Book" + "'", str84, "Book");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        items.Book book6 = new items.Book("LibraryItem [itemId=30835, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=19205, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=18778, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=32653, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getDetails();
        java.lang.String str10 = book6.getDetails();
        java.lang.String str11 = book6.getLocation();
        java.lang.String str12 = book6.toString();
        items.Book book19 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str20 = book19.getAuthor();
        java.lang.String str21 = book19.getAuthor();
        java.lang.String str22 = book19.getAuthor();
        java.lang.String str23 = book19.getBorrowerEmail();
// flaky:         book19.returnItem();
        java.lang.String str25 = book19.getTitle();
        items.Book book32 = new items.Book("hi!", "hi!", true, false, "Book", "Book:  by hi!. Location: . Purchasable: true");
        java.lang.String str33 = book32.toString();
        java.lang.String str34 = book32.getTitle();
        java.lang.String str35 = book32.getTitle();
        boolean boolean36 = book32.isPurchasable();
        items.Book book43 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str44 = book43.getAuthor();
        java.lang.String str45 = book43.getAuthor();
        java.lang.String str46 = book43.getBorrowerEmail();
        book43.setIsPurchasable(false);
        boolean boolean49 = book43.isRented();
        items.Book book56 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str57 = book56.getDetails();
        boolean boolean58 = book56.isRented();
        items.Book book65 = new items.Book("", "", true, true, "", "hi!");
        book65.setLocation("hi!");
        java.lang.String str68 = book65.getLocation();
        items.Book book75 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str76 = book75.getAuthor();
        java.lang.String str77 = book75.getAuthor();
        items.Book book84 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str85 = book84.getAuthor();
        items.LibraryItem[] libraryItemArray86 = new items.LibraryItem[] { book84 };
        java.util.ArrayList<items.LibraryItem> libraryItemList87 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList87, libraryItemArray86);
        boolean boolean89 = book75.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean90 = book65.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean91 = book56.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean92 = book43.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean93 = book32.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean94 = book19.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean95 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        java.lang.String str96 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str9, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str10, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=36031, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=36031, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "LibraryItem [itemId=36033, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str33, "LibraryItem [itemId=36033, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Book" + "'", str34, "Book");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Book" + "'", str35, "Book");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str57, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str96, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getBorrowerEmail();
        book6.setIsPurchasable(false);
        boolean boolean12 = book6.isRented();
        java.lang.String str13 = book6.getPrice();
        java.lang.String str14 = book6.getTitle();
        items.Book book21 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str22 = book21.getAuthor();
        book21.setLocation("");
        java.lang.String str25 = book21.getTitle();
        int int26 = book21.getItemId();
        int int27 = book21.getItemId();
        java.lang.String str28 = book21.getPrice();
        java.lang.String str29 = book21.getLocation();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str37 = book36.getAuthor();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str46 = book45.getAuthor();
        items.LibraryItem[] libraryItemArray47 = new items.LibraryItem[] { book45 };
        java.util.ArrayList<items.LibraryItem> libraryItemList48 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList48, libraryItemArray47);
        boolean boolean50 = book36.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList48);
        boolean boolean51 = book21.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList48);
        boolean boolean52 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList48);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 36040 + "'", int26 == 36040);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 36040 + "'", int27 == 36040);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        book6.setIsPurchasable(true);
        java.lang.String str13 = book6.getPrice();
        book6.setIsPurchasable(false);
        java.lang.String str16 = book6.getPrice();
        java.lang.String str17 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        boolean boolean10 = book6.isPurchasable();
        java.lang.String str11 = book6.toString();
        book6.setIsPurchasable(true);
        java.lang.String str14 = book6.getPrice();
        boolean boolean15 = book6.isPurchasable();
// flaky:         book6.returnItem();
        java.lang.String str17 = book6.getTitle();
        java.lang.String str18 = book6.getItemType();
        java.lang.Class<?> wildcardClass19 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=36044, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=36044, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book" + "'", str18, "Book");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.toString();
        boolean boolean12 = book6.isRented();
        boolean boolean13 = book6.isRented();
        boolean boolean14 = book6.isRented();
        items.Book book21 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str22 = book21.getAuthor();
        java.lang.String str23 = book21.getAuthor();
        java.lang.String str24 = book21.getAuthor();
        book21.setIsPurchasable(true);
        boolean boolean27 = book21.isRented();
        java.lang.String str28 = book21.getBorrowerEmail();
        items.Book book35 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str36 = book35.getAuthor();
        java.lang.String str37 = book35.getAuthor();
        java.lang.String str38 = book35.getBorrowerEmail();
        book35.setIsPurchasable(false);
        boolean boolean41 = book35.isPurchasable();
        book35.setBorrowerEmail("LibraryItem [itemId=236, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str44 = book35.getDetails();
        java.lang.String str45 = book35.getTitle();
        java.lang.String str46 = book35.getBorrowerEmail();
        book35.setLocation("LibraryItem [itemId=1180, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book55 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str56 = book55.getAuthor();
        java.lang.String str57 = book55.getAuthor();
        boolean boolean58 = book55.isRented();
        java.lang.String str59 = book55.getDetails();
        java.lang.String str60 = book55.getDetails();
        items.Book book67 = new items.Book("", "", true, true, "", "hi!");
        book67.setLocation("hi!");
        items.Book book76 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str77 = book76.getAuthor();
        java.lang.String str78 = book76.getAuthor();
        items.Book book85 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str86 = book85.getAuthor();
        items.LibraryItem[] libraryItemArray87 = new items.LibraryItem[] { book85 };
        java.util.ArrayList<items.LibraryItem> libraryItemList88 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList88, libraryItemArray87);
        boolean boolean90 = book76.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList88);
        boolean boolean91 = book67.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList88);
        boolean boolean92 = book55.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList88);
        boolean boolean93 = book35.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList88);
        boolean boolean94 = book21.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList88);
        boolean boolean95 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList88);
        java.lang.Class<?> wildcardClass96 = libraryItemList88.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=36045, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=36045, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str44, "Book:  by hi!. Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "LibraryItem [itemId=236, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str46, "LibraryItem [itemId=236, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str59, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str60, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isRented();
        java.lang.String str10 = book6.getDetails();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str18 = book17.getAuthor();
        java.lang.String str19 = book17.getAuthor();
        items.Book book26 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str27 = book26.getAuthor();
        items.LibraryItem[] libraryItemArray28 = new items.LibraryItem[] { book26 };
        java.util.ArrayList<items.LibraryItem> libraryItemList29 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList29, libraryItemArray28);
        boolean boolean31 = book17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList29);
        boolean boolean32 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList29);
        java.lang.String str33 = book6.getPrice();
        book6.setIsPurchasable(false);
// flaky:         book6.returnItem();
        java.lang.String str37 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str10, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        java.lang.String str11 = book6.getTitle();
        boolean boolean12 = book6.isOverdue();
        boolean boolean13 = book6.isPurchasable();
        java.lang.String str14 = book6.getBorrowerEmail();
        boolean boolean15 = book6.isOverdue();
        boolean boolean16 = book6.isRented();
        book6.setIsPurchasable(true);
        java.time.LocalDate localDate19 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate19, 0, "LibraryItem [itemId=21782, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getItemType();
        book6.setBorrowerEmail("LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book6.getBorrowerEmail();
        int int15 = book6.getItemId();
        book6.setLocation("LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str18 = book6.getDetails();
        boolean boolean19 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36056 + "'", int15 == 36056);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Book:  by hi!. Location: LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true" + "'", str18, "Book:  by hi!. Location: LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        items.Book book15 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str16 = book15.getAuthor();
        java.lang.String str17 = book15.getAuthor();
        items.Book book24 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str25 = book24.getAuthor();
        items.LibraryItem[] libraryItemArray26 = new items.LibraryItem[] { book24 };
        java.util.ArrayList<items.LibraryItem> libraryItemList27 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList27, libraryItemArray26);
        boolean boolean29 = book15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList27);
        boolean boolean30 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList27);
        book6.setIsPurchasable(true);
        java.lang.String str33 = book6.getAuthor();
        java.lang.String str34 = book6.getTitle();
        java.lang.String str35 = book6.toString();
// flaky:         book6.returnItem();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "LibraryItem [itemId=36057, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str35, "LibraryItem [itemId=36057, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        items.Book book6 = new items.Book("LibraryItem [itemId=961, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=8576, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=2281, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3161, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int7 = book6.getItemId();
        java.lang.String str8 = book6.getBorrowerEmail();
        boolean boolean9 = book6.isOverdue();
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36060 + "'", int7 == 36060);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getDetails();
        java.lang.String str8 = book6.getTitle();
        java.lang.String str9 = book6.getPrice();
        book6.setLocation("LibraryItem [itemId=1492, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str12 = book6.getAuthor();
        java.lang.String str13 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str7, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=1492, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=1492, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        items.Book book6 = new items.Book("LibraryItem [itemId=25098, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3966, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=14922, itemType=Book, location=Book, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=15970, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isRented();
        java.lang.String str10 = book6.getBorrowerEmail();
        boolean boolean11 = book6.isRented();
        java.lang.String str12 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        boolean boolean10 = book6.isPurchasable();
        java.lang.String str11 = book6.getAuthor();
        boolean boolean12 = book6.isRented();
        java.lang.String str13 = book6.getPrice();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        items.Book book6 = new items.Book("LibraryItem [itemId=11752, itemType=Book, location=LibraryItem [itemId=174, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=19512, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=18737, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=14936, itemType=Book, location=LibraryItem [itemId=1492, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getTitle();
        java.time.LocalDate localDate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate8, 28403, "LibraryItem [itemId=1594, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=18737, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=18737, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        items.Book book6 = new items.Book("LibraryItem [itemId=18976, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=32838, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=29606, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=31873, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getDetails();
        boolean boolean8 = book6.isRented();
        items.Book book15 = new items.Book("", "", true, true, "", "hi!");
        book15.setLocation("hi!");
        java.lang.String str18 = book15.getLocation();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str26 = book25.getAuthor();
        java.lang.String str27 = book25.getAuthor();
        items.Book book34 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str35 = book34.getAuthor();
        items.LibraryItem[] libraryItemArray36 = new items.LibraryItem[] { book34 };
        java.util.ArrayList<items.LibraryItem> libraryItemList37 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList37, libraryItemArray36);
        boolean boolean39 = book25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList37);
        boolean boolean40 = book15.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList37);
        boolean boolean41 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList37);
        boolean boolean42 = book6.isPurchasable();
        items.Book book49 = new items.Book("", "", true, true, "", "hi!");
        book49.setLocation("hi!");
        java.lang.String str52 = book49.getLocation();
        items.Book book59 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str60 = book59.getAuthor();
        java.lang.String str61 = book59.getAuthor();
        items.Book book68 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str69 = book68.getAuthor();
        items.LibraryItem[] libraryItemArray70 = new items.LibraryItem[] { book68 };
        java.util.ArrayList<items.LibraryItem> libraryItemList71 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList71, libraryItemArray70);
        boolean boolean73 = book59.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList71);
        boolean boolean74 = book49.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList71);
        boolean boolean75 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList71);
        java.lang.String str76 = book6.getAuthor();
        boolean boolean77 = book6.isPurchasable();
        java.lang.String str78 = book6.getBorrowerEmail();
        boolean boolean79 = book6.isRented();
        java.lang.String str80 = book6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str7, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Book" + "'", str80, "Book");
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isRented();
        java.lang.String str10 = book6.getLocation();
        items.Book book17 = new items.Book("", "", true, true, "", "hi!");
        book17.setLocation("hi!");
        java.lang.String str20 = book17.getLocation();
        boolean boolean21 = book17.isPurchasable();
        java.lang.String str22 = book17.getPrice();
        book17.setLocation("LibraryItem [itemId=134, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book31 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str32 = book31.getAuthor();
        java.lang.String str33 = book31.getAuthor();
        boolean boolean34 = book31.isRented();
        java.lang.String str35 = book31.getDetails();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str43 = book42.getAuthor();
        java.lang.String str44 = book42.getAuthor();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str52 = book51.getAuthor();
        items.LibraryItem[] libraryItemArray53 = new items.LibraryItem[] { book51 };
        java.util.ArrayList<items.LibraryItem> libraryItemList54 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList54, libraryItemArray53);
        boolean boolean56 = book42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList54);
        boolean boolean57 = book31.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList54);
        boolean boolean58 = book17.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList54);
        boolean boolean59 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList54);
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str67 = book66.getAuthor();
        java.lang.String str68 = book66.getAuthor();
        boolean boolean69 = book66.isRented();
        java.lang.String str70 = book66.getDetails();
        items.Book book77 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str78 = book77.getAuthor();
        java.lang.String str79 = book77.getAuthor();
        items.Book book86 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str87 = book86.getAuthor();
        items.LibraryItem[] libraryItemArray88 = new items.LibraryItem[] { book86 };
        java.util.ArrayList<items.LibraryItem> libraryItemList89 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList89, libraryItemArray88);
        boolean boolean91 = book77.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean92 = book66.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean93 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        book6.setIsPurchasable(false);
        java.lang.String str96 = book6.getPrice();
        book6.setBorrowerEmail("LibraryItem [itemId=7419, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str35, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str70, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        items.Book book6 = new items.Book("LibraryItem [itemId=13681, itemType=Book, location=Book, purchasable=false, title=LibraryItem [itemId=134, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=30228, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=20682, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=14121, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = book6.isOverdue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getItemType();
        book6.setBorrowerEmail("LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book20 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str21 = book20.getDetails();
        boolean boolean22 = book20.isRented();
        items.Book book29 = new items.Book("", "", true, true, "", "hi!");
        book29.setLocation("hi!");
        java.lang.String str32 = book29.getLocation();
        items.Book book39 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str40 = book39.getAuthor();
        java.lang.String str41 = book39.getAuthor();
        items.Book book48 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str49 = book48.getAuthor();
        items.LibraryItem[] libraryItemArray50 = new items.LibraryItem[] { book48 };
        java.util.ArrayList<items.LibraryItem> libraryItemList51 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList51, libraryItemArray50);
        boolean boolean53 = book39.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList51);
        boolean boolean54 = book29.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList51);
        boolean boolean55 = book20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList51);
        boolean boolean56 = book20.isPurchasable();
        items.Book book63 = new items.Book("", "", true, true, "", "hi!");
        book63.setLocation("hi!");
        java.lang.String str66 = book63.getLocation();
        items.Book book73 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str74 = book73.getAuthor();
        java.lang.String str75 = book73.getAuthor();
        items.Book book82 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str83 = book82.getAuthor();
        items.LibraryItem[] libraryItemArray84 = new items.LibraryItem[] { book82 };
        java.util.ArrayList<items.LibraryItem> libraryItemList85 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList85, libraryItemArray84);
        boolean boolean87 = book73.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean88 = book63.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean89 = book20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean90 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        book6.setIsPurchasable(true);
        java.lang.String str93 = book6.toString();
        java.lang.Class<?> wildcardClass94 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str21, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "LibraryItem [itemId=36083, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str93, "LibraryItem [itemId=36083, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        boolean boolean11 = book6.isPurchasable();
        book6.setLocation("LibraryItem [itemId=2248, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int14 = book6.getItemId();
        java.lang.String str15 = book6.getLocation();
        java.lang.String str16 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36091 + "'", int14 == 36091);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LibraryItem [itemId=2248, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str15, "LibraryItem [itemId=2248, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Book:  by hi!. Location: LibraryItem [itemId=2248, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true" + "'", str16, "Book:  by hi!. Location: LibraryItem [itemId=2248, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        java.lang.String str11 = book6.getTitle();
        items.Book book18 = new items.Book("", "", true, true, "", "hi!");
        book18.setLocation("hi!");
        java.lang.String str21 = book18.getLocation();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str29 = book28.getAuthor();
        java.lang.String str30 = book28.getAuthor();
        items.Book book37 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str38 = book37.getAuthor();
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { book37 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        boolean boolean43 = book18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList40);
        boolean boolean44 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        boolean boolean45 = book6.isPurchasable();
        book6.setBorrowerEmail("LibraryItem [itemId=927, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean48 = book6.isPurchasable();
        java.lang.String str49 = book6.getDetails();
        java.lang.String str50 = book6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Book:  by hi!. Location: hi!. Purchasable: true" + "'", str49, "Book:  by hi!. Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "LibraryItem [itemId=36092, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str50, "LibraryItem [itemId=36092, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        boolean boolean10 = book6.isPurchasable();
        java.lang.String str11 = book6.toString();
        boolean boolean12 = book6.isRented();
        book6.setIsPurchasable(true);
        java.lang.String str15 = book6.getAuthor();
        java.lang.String str16 = book6.getAuthor();
        double double17 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=36096, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=36096, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isRented();
        book6.setBorrowerEmail("");
        java.lang.String str12 = book6.getTitle();
        java.lang.String str13 = book6.getBorrowerEmail();
        boolean boolean14 = book6.isPurchasable();
        java.lang.String str15 = book6.getDetails();
        boolean boolean16 = book6.isPurchasable();
        java.lang.String str17 = book6.getBorrowerEmail();
        java.lang.String str18 = book6.getAuthor();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str15, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        items.Book book6 = new items.Book("LibraryItem [itemId=1233, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=8592, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4950, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int7 = book6.getItemId();
        java.lang.String str8 = book6.toString();
        book6.returnItem();
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36098 + "'", int7 == 36098);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=36098, itemType=Book, location=LibraryItem [itemId=1233, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=36098, itemType=Book, location=LibraryItem [itemId=1233, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        book6.setIsPurchasable(true);
        java.lang.String str13 = book6.getPrice();
        book6.setBorrowerEmail("LibraryItem [itemId=1123, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        items.Book book6 = new items.Book("LibraryItem [itemId=5093, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=15583, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=31002, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=16461, itemType=Book, location=LibraryItem [itemId=1299, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1645, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        java.lang.String str11 = book6.getTitle();
        java.lang.String str12 = book6.getItemType();
        book6.setBorrowerEmail("LibraryItem [itemId=236, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str15 = book6.getPrice();
        boolean boolean16 = book6.isOverdue();
        boolean boolean17 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Book" + "'", str12, "Book");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getBorrowerEmail();
        book6.setIsPurchasable(false);
        boolean boolean12 = book6.isPurchasable();
        book6.setLocation("Book");
        items.Book book21 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str22 = book21.getAuthor();
        java.lang.String str23 = book21.getAuthor();
        boolean boolean24 = book21.isRented();
        java.lang.String str25 = book21.getAuthor();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str33 = book32.getAuthor();
        java.lang.String str34 = book32.getAuthor();
        items.Book book41 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str42 = book41.getAuthor();
        items.LibraryItem[] libraryItemArray43 = new items.LibraryItem[] { book41 };
        java.util.ArrayList<items.LibraryItem> libraryItemList44 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList44, libraryItemArray43);
        boolean boolean46 = book32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        boolean boolean47 = book21.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList44);
        boolean boolean48 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList44);
        book6.setIsPurchasable(true);
        book6.returnItem();
        double double52 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        items.Book book6 = new items.Book("Book", "LibraryItem [itemId=196, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=134, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book");
        java.lang.String str7 = book6.getLocation();
        java.lang.String str8 = book6.getItemType();
        boolean boolean9 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book" + "'", str7, "Book");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book" + "'", str8, "Book");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getLocation();
        java.lang.String str11 = book6.getBorrowerEmail();
        book6.setBorrowerEmail("LibraryItem [itemId=392, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book6.getLocation();
        java.lang.String str15 = book6.getItemType();
        int int16 = book6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book" + "'", str15, "Book");
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36107 + "'", int16 == 36107);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        boolean boolean10 = book6.isPurchasable();
        java.lang.String str11 = book6.toString();
        book6.setIsPurchasable(true);
        java.lang.String str14 = book6.getPrice();
        boolean boolean15 = book6.isPurchasable();
        book6.returnItem();
        book6.setIsPurchasable(false);
        java.lang.String str19 = book6.getItemType();
        java.lang.String str20 = book6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=36108, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=36108, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Book" + "'", str19, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LibraryItem [itemId=36108, itemType=Book, location=hi!, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str20, "LibraryItem [itemId=36108, itemType=Book, location=hi!, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isRented();
        book6.setIsPurchasable(false);
        double double12 = book6.calculateOverduePenalty();
        book6.setLocation("LibraryItem [itemId=2281, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(true);
        double double17 = book6.calculateOverduePenalty();
        java.lang.String str18 = book6.getPrice();
        book6.returnItem();
        boolean boolean20 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        items.Book book6 = new items.Book("LibraryItem [itemId=358, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=199, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=228, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=228, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.toString();
        boolean boolean8 = book6.isRented();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=36110, itemType=Book, location=LibraryItem [itemId=358, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=228, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=36110, itemType=Book, location=LibraryItem [itemId=358, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=228, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getItemType();
        book6.setBorrowerEmail("LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book6.getBorrowerEmail();
        int int15 = book6.getItemId();
        book6.setLocation("LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int18 = book6.getItemId();
        java.lang.String str19 = book6.getLocation();
        int int20 = book6.getItemId();
        java.lang.String str21 = book6.getLocation();
        int int22 = book6.getItemId();
        book6.setIsPurchasable(false);
        java.lang.String str25 = book6.getItemType();
        java.lang.String str26 = book6.getBorrowerEmail();
        book6.setLocation("LibraryItem [itemId=7468, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str29 = book6.getItemType();
        book6.returnItem();
        java.lang.String str31 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36111 + "'", int15 == 36111);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36111 + "'", int18 == 36111);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str19, "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36111 + "'", int20 == 36111);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str21, "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36111 + "'", int22 == 36111);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Book" + "'", str25, "Book");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str26, "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Book" + "'", str29, "Book");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        items.Book book6 = new items.Book("LibraryItem [itemId=25910, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=27616, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=17088, itemType=Book, location=Book:  by hi!. Location: hi!. Purchasable: true, purchasable=false, title=LibraryItem [itemId=115, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=16130, itemType=Book, location=Book, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setLocation("LibraryItem [itemId=3175, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        items.Book book6 = new items.Book("hi!", "hi!", true, false, "Book", "Book:  by hi!. Location: . Purchasable: true");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getTitle();
        book6.setIsPurchasable(true);
        book6.returnItem();
        double double12 = book6.calculateOverduePenalty();
        boolean boolean13 = book6.isOverdue();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=36113, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=36113, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book" + "'", str8, "Book");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        boolean boolean10 = book6.isPurchasable();
        java.lang.String str11 = book6.getPrice();
        java.lang.String str12 = book6.getAuthor();
        double double13 = book6.calculateOverduePenalty();
        int int14 = book6.getItemId();
        book6.setBorrowerEmail("LibraryItem [itemId=3538, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = book6.getItemType();
        java.lang.String str18 = book6.getLocation();
        java.lang.String str19 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36114 + "'", int14 == 36114);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Book" + "'", str17, "Book");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getItemType();
        java.lang.String str12 = book6.getAuthor();
        java.lang.String str13 = book6.toString();
        boolean boolean14 = book6.isPurchasable();
        boolean boolean15 = book6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=36115, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=36115, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getBorrowerEmail();
        book6.setIsPurchasable(false);
        boolean boolean12 = book6.isOverdue();
        java.lang.String str13 = book6.getItemType();
        java.lang.String str14 = book6.getBorrowerEmail();
        book6.setLocation("LibraryItem [itemId=3331, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = book6.getAuthor();
        boolean boolean18 = book6.isOverdue();
        boolean boolean19 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book" + "'", str13, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        items.Book book6 = new items.Book("LibraryItem [itemId=525, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=222, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=805, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=843, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getLocation();
        java.lang.String str8 = book6.toString();
        java.lang.String str9 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=25106, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=525, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=525, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=36117, itemType=Book, location=LibraryItem [itemId=525, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=805, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=36117, itemType=Book, location=LibraryItem [itemId=525, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=805, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=36117, itemType=Book, location=LibraryItem [itemId=525, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=805, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=36117, itemType=Book, location=LibraryItem [itemId=525, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=805, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        boolean boolean9 = book6.isPurchasable();
        java.lang.String str10 = book6.getItemType();
        java.lang.String str11 = book6.getLocation();
        items.Book book18 = new items.Book("", "", true, true, "", "hi!");
        book18.setLocation("hi!");
        java.lang.String str21 = book18.getLocation();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str29 = book28.getAuthor();
        java.lang.String str30 = book28.getAuthor();
        items.Book book37 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str38 = book37.getAuthor();
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { book37 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        boolean boolean43 = book18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList40);
        items.Book book50 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str51 = book50.getAuthor();
        java.lang.String str52 = book50.getAuthor();
        boolean boolean53 = book50.isRented();
        java.lang.String str54 = book50.getAuthor();
        items.Book book61 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str62 = book61.getAuthor();
        java.lang.String str63 = book61.getAuthor();
        items.Book book70 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str71 = book70.getAuthor();
        items.LibraryItem[] libraryItemArray72 = new items.LibraryItem[] { book70 };
        java.util.ArrayList<items.LibraryItem> libraryItemList73 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList73, libraryItemArray72);
        boolean boolean75 = book61.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean76 = book50.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean77 = book18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean78 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        int int79 = book6.getItemId();
        java.lang.String str80 = book6.getLocation();
        boolean boolean81 = book6.isRented();
        java.lang.String str82 = book6.getBorrowerEmail();
        book6.returnItem();
        book6.setBorrowerEmail("LibraryItem [itemId=34742, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book" + "'", str10, "Book");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int79 + "' != '" + 36118 + "'", int79 == 36118);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getItemType();
        book6.setBorrowerEmail("LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book6.getBorrowerEmail();
        book6.setLocation("LibraryItem [itemId=809, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = book6.getPrice();
        items.Book book24 = new items.Book("LibraryItem [itemId=731, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1153, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=1610, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=852, itemType=Book, location=Book, purchasable=false, title=LibraryItem [itemId=134, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean25 = book24.isOverdue();
        items.Book book32 = new items.Book("", "", true, true, "", "hi!");
        book32.setLocation("hi!");
        java.lang.String str35 = book32.getLocation();
        items.Book book42 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str43 = book42.getAuthor();
        java.lang.String str44 = book42.getAuthor();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str52 = book51.getAuthor();
        items.LibraryItem[] libraryItemArray53 = new items.LibraryItem[] { book51 };
        java.util.ArrayList<items.LibraryItem> libraryItemList54 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList54, libraryItemArray53);
        boolean boolean56 = book42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList54);
        boolean boolean57 = book32.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList54);
        items.Book book64 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str65 = book64.getAuthor();
        java.lang.String str66 = book64.getAuthor();
        boolean boolean67 = book64.isRented();
        java.lang.String str68 = book64.getAuthor();
        items.Book book75 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str76 = book75.getAuthor();
        java.lang.String str77 = book75.getAuthor();
        items.Book book84 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str85 = book84.getAuthor();
        items.LibraryItem[] libraryItemArray86 = new items.LibraryItem[] { book84 };
        java.util.ArrayList<items.LibraryItem> libraryItemList87 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList87, libraryItemArray86);
        boolean boolean89 = book75.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean90 = book64.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean91 = book32.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean92 = book24.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean93 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        java.lang.Class<?> wildcardClass94 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        items.Book book6 = new items.Book("hi!", "hi!", true, false, "Book", "Book:  by hi!. Location: . Purchasable: true");
        java.lang.String str7 = book6.toString();
        java.lang.String str8 = book6.getTitle();
        java.lang.String str9 = book6.getTitle();
        boolean boolean10 = book6.isPurchasable();
        java.lang.String str11 = book6.getDetails();
        items.Book book18 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str19 = book18.getAuthor();
        book18.setLocation("");
        java.lang.String str22 = book18.getTitle();
        java.lang.String str23 = book18.getItemType();
        book18.setBorrowerEmail("LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str26 = book18.getBorrowerEmail();
        java.lang.String str27 = book18.getBorrowerEmail();
        int int28 = book18.getItemId();
        int int29 = book18.getItemId();
        items.Book book36 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str37 = book36.getAuthor();
        java.lang.String str38 = book36.getAuthor();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str46 = book45.getAuthor();
        items.LibraryItem[] libraryItemArray47 = new items.LibraryItem[] { book45 };
        java.util.ArrayList<items.LibraryItem> libraryItemList48 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList48, libraryItemArray47);
        boolean boolean50 = book36.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList48);
        boolean boolean51 = book18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList48);
        boolean boolean52 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList48);
        java.lang.String str53 = book6.getPrice();
        java.lang.String str54 = book6.getPrice();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=36133, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=36133, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Book" + "'", str8, "Book");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book" + "'", str9, "Book");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book: Book by Book:  by hi!. Location: . Purchasable: true. Location: hi!. Purchasable: true" + "'", str11, "Book: Book by Book:  by hi!. Location: . Purchasable: true. Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Book" + "'", str23, "Book");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str26, "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str27, "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 36134 + "'", int28 == 36134);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 36134 + "'", int29 == 36134);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str53, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str54, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        java.lang.String str11 = book6.getAuthor();
        boolean boolean12 = book6.isOverdue();
        double double13 = book6.calculateOverduePenalty();
        book6.returnItem();
        java.lang.String str15 = book6.getDetails();
        double double16 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book:  by hi!. Location: hi!. Purchasable: true" + "'", str15, "Book:  by hi!. Location: hi!. Purchasable: true");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        boolean boolean10 = book6.isPurchasable();
        java.lang.String str11 = book6.toString();
        book6.setBorrowerEmail("LibraryItem [itemId=820, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        book6.setIsPurchasable(false);
        book6.returnItem();
        book6.returnItem();
        java.lang.String str20 = book6.getTitle();
        java.lang.String str21 = book6.getTitle();
        double double22 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=36138, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=36138, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getDetails();
        boolean boolean8 = book6.isRented();
        java.lang.String str9 = book6.getDetails();
        java.lang.String str10 = book6.getAuthor();
        int int11 = book6.getItemId();
        java.lang.String str12 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str7, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str9, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36139 + "'", int11 == 36139);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getDetails();
        java.lang.String str10 = book6.getBorrowerEmail();
        java.lang.String str11 = book6.toString();
        int int12 = book6.getItemId();
        boolean boolean13 = book6.isPurchasable();
        double double14 = book6.calculateOverduePenalty();
        java.lang.String str15 = book6.getItemType();
        java.lang.String str16 = book6.getPrice();
        java.lang.String str17 = book6.getAuthor();
        book6.returnItem();
        java.lang.String str19 = book6.getTitle();
        boolean boolean20 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str9, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=36140, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=36140, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36140 + "'", int12 == 36140);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Book" + "'", str15, "Book");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getBorrowerEmail();
        book6.setIsPurchasable(false);
        boolean boolean12 = book6.isPurchasable();
        book6.setLocation("Book");
        book6.returnItem();
        book6.setBorrowerEmail("LibraryItem [itemId=2857, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str18 = book6.getBorrowerEmail();
        book6.setLocation("LibraryItem [itemId=27419, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LibraryItem [itemId=2857, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str18, "LibraryItem [itemId=2857, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isRented();
        book6.setBorrowerEmail("");
        java.lang.String str12 = book6.getTitle();
        double double13 = book6.calculateOverduePenalty();
        items.Book book20 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str21 = book20.getAuthor();
        java.lang.String str22 = book20.getAuthor();
        boolean boolean23 = book20.isRented();
        java.lang.String str24 = book20.getAuthor();
        items.Book book31 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str32 = book31.getAuthor();
        java.lang.String str33 = book31.getAuthor();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str41 = book40.getAuthor();
        items.LibraryItem[] libraryItemArray42 = new items.LibraryItem[] { book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList43 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList43, libraryItemArray42);
        boolean boolean45 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList43);
        boolean boolean46 = book20.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList43);
        boolean boolean47 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList43);
        boolean boolean48 = book6.isPurchasable();
        book6.setIsPurchasable(true);
        java.lang.String str51 = book6.getDetails();
        book6.returnItem();
        boolean boolean53 = book6.isRented();
        java.lang.String str54 = book6.getDetails();
        java.time.LocalDate localDate55 = null;
        // The following exception was thrown during execution in test generation
        try {
            book6.rentItem(localDate55, 32413, "LibraryItem [itemId=19962, itemType=Book, location=LibraryItem [itemId=115, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str51, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str54, "Book:  by hi!. Location: . Purchasable: true");
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        items.Book book6 = new items.Book("", "LibraryItem [itemId=12490, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=19582, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6431, itemType=Book, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getItemType();
        book6.setBorrowerEmail("LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book6.getBorrowerEmail();
        java.lang.String str15 = book6.getAuthor();
        double double16 = book6.calculateOverduePenalty();
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str24 = book23.getAuthor();
        java.lang.String str25 = book23.getAuthor();
        java.lang.String str26 = book23.getDetails();
        book23.setLocation("hi!");
        java.lang.String str29 = book23.getTitle();
        java.lang.String str30 = book23.getAuthor();
        items.Book book37 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str38 = book37.getAuthor();
        java.lang.String str39 = book37.getAuthor();
        java.lang.String str40 = book37.getAuthor();
        book37.setIsPurchasable(true);
        boolean boolean43 = book37.isRented();
        java.lang.String str44 = book37.getBorrowerEmail();
        items.Book book51 = new items.Book("", "", true, true, "", "hi!");
        book51.setLocation("hi!");
        java.lang.String str54 = book51.getLocation();
        items.Book book61 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str62 = book61.getAuthor();
        java.lang.String str63 = book61.getAuthor();
        items.Book book70 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str71 = book70.getAuthor();
        items.LibraryItem[] libraryItemArray72 = new items.LibraryItem[] { book70 };
        java.util.ArrayList<items.LibraryItem> libraryItemList73 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList73, libraryItemArray72);
        boolean boolean75 = book61.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean76 = book51.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean77 = book37.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean78 = book23.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean79 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str26, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        items.Book book6 = new items.Book("LibraryItem [itemId=291, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=125, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=196, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=228, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getLocation();
        book6.setIsPurchasable(false);
        java.util.List<items.LibraryItem> libraryItemList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = book6.hasBorrowingPrivileges(libraryItemList10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=291, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=291, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        items.Book book6 = new items.Book("LibraryItem [itemId=2516, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1765, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=10138, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7346, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.toString();
        book6.setLocation("LibraryItem [itemId=14157, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int10 = book6.getItemId();
        java.lang.String str11 = book6.getTitle();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=36154, itemType=Book, location=LibraryItem [itemId=2516, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=10138, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=36154, itemType=Book, location=LibraryItem [itemId=2516, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=10138, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36154 + "'", int10 == 36154);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=10138, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=10138, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        items.Book book16 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str17 = book16.getAuthor();
        java.lang.String str18 = book16.getAuthor();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str26 = book25.getAuthor();
        items.LibraryItem[] libraryItemArray27 = new items.LibraryItem[] { book25 };
        java.util.ArrayList<items.LibraryItem> libraryItemList28 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList28, libraryItemArray27);
        boolean boolean30 = book16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList28);
        boolean boolean31 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList28);
        java.lang.String str32 = book6.toString();
        java.lang.String str33 = book6.getTitle();
        book6.setIsPurchasable(true);
        java.lang.String str36 = book6.getTitle();
        book6.setBorrowerEmail("LibraryItem [itemId=731, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.setIsPurchasable(false);
        java.lang.String str41 = book6.getItemType();
        java.lang.String str42 = book6.getLocation();
        boolean boolean43 = book6.isOverdue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LibraryItem [itemId=36155, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str32, "LibraryItem [itemId=36155, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Book" + "'", str41, "Book");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        items.Book book6 = new items.Book("LibraryItem [itemId=1636, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3111, itemType=Book, location=Book:  by hi!. Location: hi!. Purchasable: true, purchasable=false, title=LibraryItem [itemId=115, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=4944, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2555, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book13 = new items.Book("LibraryItem [itemId=291, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=125, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=196, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=228, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book13.getLocation();
        book13.setIsPurchasable(false);
        items.Book book23 = new items.Book("", "", true, true, "", "hi!");
        book23.setLocation("hi!");
        boolean boolean26 = book23.isRented();
        items.Book book33 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str34 = book33.getAuthor();
        book33.setLocation("");
        java.lang.String str37 = book33.getTitle();
        java.lang.String str38 = book33.toString();
        items.Book book45 = new items.Book("", "", true, true, "", "hi!");
        book45.setLocation("hi!");
        items.Book book54 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str55 = book54.getAuthor();
        java.lang.String str56 = book54.getAuthor();
        items.Book book63 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str64 = book63.getAuthor();
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { book63 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = book54.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = book45.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = book33.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean71 = book23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean72 = book13.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean73 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        int int74 = book6.getItemId();
        java.lang.String str75 = book6.getAuthor();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=291, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=291, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LibraryItem [itemId=36161, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str38, "LibraryItem [itemId=36161, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 36158 + "'", int74 == 36158);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "LibraryItem [itemId=2555, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str75, "LibraryItem [itemId=2555, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        items.Book book6 = new items.Book("LibraryItem [itemId=1299, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1605, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1645, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=778, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getBorrowerEmail();
        boolean boolean8 = book6.isRented();
        boolean boolean9 = book6.isRented();
        items.Book book16 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str17 = book16.getAuthor();
        java.lang.String str18 = book16.getAuthor();
        java.lang.String str19 = book16.getAuthor();
        book16.setIsPurchasable(true);
        boolean boolean22 = book16.isRented();
        java.lang.String str23 = book16.getBorrowerEmail();
        items.Book book30 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str31 = book30.getAuthor();
        java.lang.String str32 = book30.getAuthor();
        java.lang.String str33 = book30.getBorrowerEmail();
        book30.setIsPurchasable(false);
        boolean boolean36 = book30.isPurchasable();
        book30.setBorrowerEmail("LibraryItem [itemId=236, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str39 = book30.getDetails();
        java.lang.String str40 = book30.getTitle();
        java.lang.String str41 = book30.getBorrowerEmail();
        book30.setLocation("LibraryItem [itemId=1180, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book50 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str51 = book50.getAuthor();
        java.lang.String str52 = book50.getAuthor();
        boolean boolean53 = book50.isRented();
        java.lang.String str54 = book50.getDetails();
        java.lang.String str55 = book50.getDetails();
        items.Book book62 = new items.Book("", "", true, true, "", "hi!");
        book62.setLocation("hi!");
        items.Book book71 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str72 = book71.getAuthor();
        java.lang.String str73 = book71.getAuthor();
        items.Book book80 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str81 = book80.getAuthor();
        items.LibraryItem[] libraryItemArray82 = new items.LibraryItem[] { book80 };
        java.util.ArrayList<items.LibraryItem> libraryItemList83 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList83, libraryItemArray82);
        boolean boolean85 = book71.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList83);
        boolean boolean86 = book62.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList83);
        boolean boolean87 = book50.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList83);
        boolean boolean88 = book30.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList83);
        boolean boolean89 = book16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList83);
        boolean boolean90 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList83);
        double double91 = book6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Book:  by hi!. Location: . Purchasable: false" + "'", str39, "Book:  by hi!. Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "LibraryItem [itemId=236, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str41, "LibraryItem [itemId=236, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str54, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str55, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        java.lang.String str9 = book6.getAuthor();
        book6.setIsPurchasable(true);
        java.lang.String str12 = book6.getBorrowerEmail();
        items.Book book19 = new items.Book("", "", true, true, "", "hi!");
        book19.setLocation("hi!");
        boolean boolean22 = book19.isPurchasable();
        book19.returnItem();
        java.lang.String str24 = book19.getBorrowerEmail();
        items.Book book31 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str32 = book31.getAuthor();
        java.lang.String str33 = book31.getAuthor();
        java.lang.String str34 = book31.getBorrowerEmail();
        book31.setIsPurchasable(false);
        boolean boolean37 = book31.isOverdue();
        items.Book book44 = new items.Book("", "", true, true, "", "hi!");
        book44.setLocation("hi!");
        java.lang.String str47 = book44.getLocation();
        java.lang.String str48 = book44.getBorrowerEmail();
        java.lang.String str49 = book44.getTitle();
        items.Book book56 = new items.Book("", "", true, true, "", "hi!");
        book56.setLocation("hi!");
        java.lang.String str59 = book56.getLocation();
        items.Book book66 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str67 = book66.getAuthor();
        java.lang.String str68 = book66.getAuthor();
        items.Book book75 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str76 = book75.getAuthor();
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { book75 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = book66.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean81 = book56.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean82 = book44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean83 = book31.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean84 = book19.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean85 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        java.lang.String str86 = book6.getBorrowerEmail();
        double double87 = book6.calculateOverduePenalty();
        java.lang.String str88 = book6.getDetails();
        book6.setBorrowerEmail("LibraryItem [itemId=1763, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean91 = book6.isPurchasable();
        boolean boolean92 = book6.isRented();
        book6.setLocation("LibraryItem [itemId=12080, itemType=Book, location=LibraryItem [itemId=1123, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=437, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str95 = book6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str88, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        items.Book book6 = new items.Book("LibraryItem [itemId=35374, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=13292, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=33816, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=9257, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        items.Book book6 = new items.Book("LibraryItem [itemId=21169, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7314, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=25573, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=12828, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        items.Book book6 = new items.Book("LibraryItem [itemId=5084, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5089, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=1017, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        book6.setIsPurchasable(false);
        java.lang.String str9 = book6.getDetails();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book: LibraryItem [itemId=1017, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by . Location: LibraryItem [itemId=5084, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str9, "Book: LibraryItem [itemId=1017, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null] by . Location: LibraryItem [itemId=5084, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        items.Book book16 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str17 = book16.getAuthor();
        java.lang.String str18 = book16.getAuthor();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str26 = book25.getAuthor();
        items.LibraryItem[] libraryItemArray27 = new items.LibraryItem[] { book25 };
        java.util.ArrayList<items.LibraryItem> libraryItemList28 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList28, libraryItemArray27);
        boolean boolean30 = book16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList28);
        boolean boolean31 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList28);
        java.lang.String str32 = book6.toString();
        java.lang.String str33 = book6.getItemType();
        java.lang.String str34 = book6.getDetails();
        java.lang.String str35 = book6.getItemType();
        book6.setBorrowerEmail("LibraryItem [itemId=927, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        book6.returnItem();
        java.lang.String str39 = book6.getItemType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "LibraryItem [itemId=36182, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str32, "LibraryItem [itemId=36182, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Book" + "'", str33, "Book");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Book:  by hi!. Location: hi!. Purchasable: true" + "'", str34, "Book:  by hi!. Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Book" + "'", str35, "Book");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Book" + "'", str39, "Book");
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        items.Book book6 = new items.Book("LibraryItem [itemId=3962, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, false, "LibraryItem [itemId=6513, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book:  by hi!. Location: LibraryItem [itemId=1492, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
        book6.setLocation("LibraryItem [itemId=21259, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Book book15 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str16 = book15.getAuthor();
        java.lang.String str17 = book15.getAuthor();
        boolean boolean18 = book15.isRented();
        java.lang.String str19 = book15.getLocation();
        java.lang.String str20 = book15.getBorrowerEmail();
        boolean boolean21 = book15.isOverdue();
        java.lang.String str22 = book15.toString();
        int int23 = book15.getItemId();
        java.lang.String str24 = book15.getDetails();
        items.Book book31 = new items.Book("Book", "", false, false, "LibraryItem [itemId=620, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book");
        double double32 = book31.calculateOverduePenalty();
        int int33 = book31.getItemId();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str41 = book40.getAuthor();
        java.lang.String str42 = book40.getAuthor();
        boolean boolean43 = book40.isRented();
        java.lang.String str44 = book40.getDetails();
        java.lang.String str45 = book40.getDetails();
        items.Book book52 = new items.Book("", "", true, true, "", "hi!");
        book52.setLocation("hi!");
        java.lang.String str55 = book52.getLocation();
        java.lang.String str56 = book52.getBorrowerEmail();
        java.lang.String str57 = book52.getTitle();
        boolean boolean58 = book52.isOverdue();
        items.Book book65 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str66 = book65.getAuthor();
        java.lang.String str67 = book65.getAuthor();
        items.Book book74 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str75 = book74.getAuthor();
        items.LibraryItem[] libraryItemArray76 = new items.LibraryItem[] { book74 };
        java.util.ArrayList<items.LibraryItem> libraryItemList77 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList77, libraryItemArray76);
        boolean boolean79 = book65.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean80 = book52.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean81 = book40.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean82 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean83 = book15.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean84 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList77);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "LibraryItem [itemId=36186, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str22, "LibraryItem [itemId=36186, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36186 + "'", int23 == 36186);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str24, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 36187 + "'", int33 == 36187);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str44, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str45, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getAuthor();
        java.lang.String str12 = book6.getLocation();
        java.lang.String str13 = book6.getDetails();
        java.lang.String str14 = book6.getPrice();
        book6.setLocation("LibraryItem [itemId=2437, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = book6.getBorrowerEmail();
        double double18 = book6.calculateOverduePenalty();
        java.lang.String str19 = book6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str13, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LibraryItem [itemId=36192, itemType=Book, location=LibraryItem [itemId=2437, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str19, "LibraryItem [itemId=36192, itemType=Book, location=LibraryItem [itemId=2437, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        items.Book book6 = new items.Book("LibraryItem [itemId=19787, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3389, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=1723, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=24878, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=24878, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=24878, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=19787, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=19787, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        book6.setLocation("");
        java.lang.String str10 = book6.getTitle();
        java.lang.String str11 = book6.getItemType();
        book6.setBorrowerEmail("LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = book6.getBorrowerEmail();
        int int15 = book6.getItemId();
        book6.setLocation("LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int18 = book6.getItemId();
        java.lang.String str19 = book6.getLocation();
        int int20 = book6.getItemId();
        java.lang.String str21 = book6.getLocation();
        int int22 = book6.getItemId();
        book6.setIsPurchasable(true);
        java.lang.String str25 = book6.getPrice();
        boolean boolean26 = book6.isOverdue();
        boolean boolean27 = book6.isRented();
        java.lang.Class<?> wildcardClass28 = book6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book" + "'", str11, "Book");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=79, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36194 + "'", int15 == 36194);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36194 + "'", int18 == 36194);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str19, "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36194 + "'", int20 == 36194);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str21, "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 36194 + "'", int22 == 36194);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        items.Book book6 = new items.Book("LibraryItem [itemId=199, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=134, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=72, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Book:  by hi!. Location: hi!. Purchasable: true");
        book6.setIsPurchasable(true);
        java.lang.String str9 = book6.getPrice();
        book6.returnItem();
        java.lang.String str11 = book6.getPrice();
        java.lang.String str12 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Book:  by hi!. Location: hi!. Purchasable: true" + "'", str9, "Book:  by hi!. Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Book:  by hi!. Location: hi!. Purchasable: true" + "'", str11, "Book:  by hi!. Location: hi!. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        items.Book book16 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str17 = book16.getAuthor();
        java.lang.String str18 = book16.getAuthor();
        items.Book book25 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str26 = book25.getAuthor();
        items.LibraryItem[] libraryItemArray27 = new items.LibraryItem[] { book25 };
        java.util.ArrayList<items.LibraryItem> libraryItemList28 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList28, libraryItemArray27);
        boolean boolean30 = book16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList28);
        boolean boolean31 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList28);
        java.lang.String str32 = book6.getTitle();
        java.lang.String str33 = book6.getDetails();
        int int34 = book6.getItemId();
        java.lang.String str35 = book6.getBorrowerEmail();
        java.lang.String str36 = book6.getItemType();
        book6.returnItem();
        java.lang.String str38 = book6.toString();
        boolean boolean39 = book6.isRented();
        book6.returnItem();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Book:  by hi!. Location: hi!. Purchasable: true" + "'", str33, "Book:  by hi!. Location: hi!. Purchasable: true");
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 36196 + "'", int34 == 36196);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Book" + "'", str36, "Book");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LibraryItem [itemId=36196, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str38, "LibraryItem [itemId=36196, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str7 = book6.getAuthor();
        java.lang.String str8 = book6.getAuthor();
        boolean boolean9 = book6.isRented();
        book6.setBorrowerEmail("");
        java.lang.String str12 = book6.getTitle();
        double double13 = book6.calculateOverduePenalty();
        items.Book book20 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str21 = book20.getAuthor();
        java.lang.String str22 = book20.getAuthor();
        boolean boolean23 = book20.isRented();
        java.lang.String str24 = book20.getAuthor();
        items.Book book31 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str32 = book31.getAuthor();
        java.lang.String str33 = book31.getAuthor();
        items.Book book40 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str41 = book40.getAuthor();
        items.LibraryItem[] libraryItemArray42 = new items.LibraryItem[] { book40 };
        java.util.ArrayList<items.LibraryItem> libraryItemList43 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList43, libraryItemArray42);
        boolean boolean45 = book31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList43);
        boolean boolean46 = book20.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList43);
        boolean boolean47 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList43);
        java.lang.String str48 = book6.getItemType();
        java.lang.String str49 = book6.getDetails();
        java.lang.String str50 = book6.getPrice();
        int int51 = book6.getItemId();
        book6.setLocation("LibraryItem [itemId=6618, itemType=Book, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str54 = book6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Book" + "'", str48, "Book");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Book:  by hi!. Location: . Purchasable: true" + "'", str49, "Book:  by hi!. Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 36199 + "'", int51 == 36199);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        items.Book book6 = new items.Book("LibraryItem [itemId=3283, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2775, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "");
        java.lang.String str7 = book6.getBorrowerEmail();
        java.lang.String str8 = book6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=36203, itemType=Book, location=LibraryItem [itemId=3283, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=36203, itemType=Book, location=LibraryItem [itemId=3283, itemType=Book, location=hi!, purchasable=true, title=Book, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        java.lang.String str9 = book6.getLocation();
        java.lang.String str10 = book6.getBorrowerEmail();
        java.lang.String str11 = book6.getTitle();
        items.Book book18 = new items.Book("", "", true, true, "", "hi!");
        book18.setLocation("hi!");
        java.lang.String str21 = book18.getLocation();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str29 = book28.getAuthor();
        java.lang.String str30 = book28.getAuthor();
        items.Book book37 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str38 = book37.getAuthor();
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { book37 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        boolean boolean43 = book18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList40);
        boolean boolean44 = book6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        java.lang.String str45 = book6.toString();
        java.lang.String str46 = book6.toString();
        boolean boolean47 = book6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "LibraryItem [itemId=36204, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str45, "LibraryItem [itemId=36204, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "LibraryItem [itemId=36204, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str46, "LibraryItem [itemId=36204, itemType=Book, location=hi!, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        items.Book book6 = new items.Book("", "", true, true, "", "hi!");
        book6.setLocation("hi!");
        boolean boolean9 = book6.isPurchasable();
        java.lang.String str10 = book6.getItemType();
        java.lang.String str11 = book6.getLocation();
        items.Book book18 = new items.Book("", "", true, true, "", "hi!");
        book18.setLocation("hi!");
        java.lang.String str21 = book18.getLocation();
        items.Book book28 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str29 = book28.getAuthor();
        java.lang.String str30 = book28.getAuthor();
        items.Book book37 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str38 = book37.getAuthor();
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { book37 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = book28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        boolean boolean43 = book18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList40);
        items.Book book50 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str51 = book50.getAuthor();
        java.lang.String str52 = book50.getAuthor();
        boolean boolean53 = book50.isRented();
        java.lang.String str54 = book50.getAuthor();
        items.Book book61 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str62 = book61.getAuthor();
        java.lang.String str63 = book61.getAuthor();
        items.Book book70 = new items.Book("", "", true, true, "", "hi!");
        java.lang.String str71 = book70.getAuthor();
        items.LibraryItem[] libraryItemArray72 = new items.LibraryItem[] { book70 };
        java.util.ArrayList<items.LibraryItem> libraryItemList73 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList73, libraryItemArray72);
        boolean boolean75 = book61.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean76 = book50.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean77 = book18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean78 = book6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        int int79 = book6.getItemId();
        boolean boolean80 = book6.isOverdue();
        java.lang.String str81 = book6.getAuthor();
        boolean boolean82 = book6.isPurchasable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Book" + "'", str10, "Book");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(libraryItemArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int79 + "' != '" + 36208 + "'", int79 == 36208);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }
}
