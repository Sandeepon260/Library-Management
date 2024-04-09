package AutomatedTesting;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Magazine4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4182, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=4023, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5123, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = magazine6.isOverdue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=796, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPrice();
        java.lang.String str8 = magazine6.getLocation();
        java.lang.String str9 = magazine6.getPublisher();
        magazine6.setLocation("LibraryItem [itemId=12050, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=9738, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=12050, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=10432, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7250, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.returnItem();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        boolean boolean19 = magazine16.isOverdue();
        items.Magazine magazine26 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str27 = magazine26.getTitle();
        java.lang.String str28 = magazine26.getTitle();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine42 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str43 = magazine42.getPublisher();
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str51 = magazine50.getPublisher();
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str59 = magazine58.getPublisher();
        double double60 = magazine58.calculateOverduePenalty();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray68 = new items.LibraryItem[] { magazine42, magazine50, magazine58, magazine67 };
        java.util.ArrayList<items.LibraryItem> libraryItemList69 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList69, libraryItemArray68);
        boolean boolean71 = magazine35.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean72 = magazine26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean73 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean74 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        magazine6.setBorrowerEmail("LibraryItem [itemId=3416, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str77 = magazine6.getTitle();
        boolean boolean78 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14809 + "'", int8 == 14809);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        java.lang.String str54 = magazine6.getBorrowerEmail();
        double double55 = magazine6.calculateOverduePenalty();
        java.lang.String str56 = magazine6.getBorrowerEmail();
        java.lang.String str57 = magazine6.getAuthor();
        java.lang.String str58 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        java.lang.String str11 = magazine6.getItemType();
        java.lang.String str12 = magazine6.getItemType();
        items.Magazine magazine19 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str20 = magazine19.getTitle();
        java.lang.String str21 = magazine19.getTitle();
        items.Magazine magazine28 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getPublisher();
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str44 = magazine43.getPublisher();
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str52 = magazine51.getPublisher();
        double double53 = magazine51.calculateOverduePenalty();
        items.Magazine magazine60 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray61 = new items.LibraryItem[] { magazine35, magazine43, magazine51, magazine60 };
        java.util.ArrayList<items.LibraryItem> libraryItemList62 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList62, libraryItemArray61);
        boolean boolean64 = magazine28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        boolean boolean65 = magazine19.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        boolean boolean66 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        java.lang.String str67 = magazine6.getItemType();
        boolean boolean68 = magazine6.isOverdue();
        boolean boolean69 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine" + "'", str11, "Magazine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Magazine" + "'", str67, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=6010, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=14342, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=9489, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7195, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1056, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str69 = magazine6.getAuthor();
        java.lang.String str70 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "LibraryItem [itemId=14831, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str70, "LibraryItem [itemId=14831, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        boolean boolean55 = magazine6.isRented();
        java.lang.String str56 = magazine6.getDetails();
        java.lang.String str57 = magazine6.getPublisher();
        java.lang.String str58 = magazine6.getPrice();
        java.lang.String str59 = magazine6.getPrice();
        java.lang.String str60 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str56, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Magazine" + "'", str60, "Magazine");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getPublisher();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getPublisher();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getPublisher();
        double double31 = magazine29.calculateOverduePenalty();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { magazine13, magazine21, magazine29, magazine38 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        java.lang.String str43 = magazine6.getPublisher();
        java.lang.String str44 = magazine6.getDetails();
        java.lang.String str45 = magazine6.getLocation();
        java.time.LocalDate localDate46 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate46, 7228, "LibraryItem [itemId=14342, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str44, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        double double55 = magazine6.calculateOverduePenalty();
        magazine6.returnItem();
        java.lang.String str57 = magazine6.getBorrowerEmail();
        java.lang.String str58 = magazine6.getPrice();
        java.lang.String str59 = magazine6.toString();
        double double60 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "LibraryItem [itemId=14849, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str59, "LibraryItem [itemId=14849, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getTitle();
        java.lang.String str16 = magazine14.getTitle();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str47 = magazine46.getPublisher();
        double double48 = magazine46.calculateOverduePenalty();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray56 = new items.LibraryItem[] { magazine30, magazine38, magazine46, magazine55 };
        java.util.ArrayList<items.LibraryItem> libraryItemList57 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList57, libraryItemArray56);
        boolean boolean59 = magazine23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean60 = magazine14.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean61 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList57);
        java.lang.String str62 = magazine6.getItemType();
        boolean boolean63 = magazine6.isRented();
        java.lang.String str64 = magazine6.getPrice();
        magazine6.setBorrowerEmail("");
        java.lang.String str67 = magazine6.getDetails();
        boolean boolean68 = magazine6.isRented();
        magazine6.setBorrowerEmail("LibraryItem [itemId=4758, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int71 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Magazine" + "'", str62, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str67, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 14855 + "'", int71 == 14855);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=9763, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2931, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=9595, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4599, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=9595, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=9595, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getPrice();
        java.lang.String str14 = magazine6.getAuthor();
        java.lang.String str15 = magazine6.getPublisher();
        java.lang.String str16 = magazine6.getAuthor();
        boolean boolean17 = magazine6.isOverdue();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3318, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.Class<?> wildcardClass20 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        double double55 = magazine6.calculateOverduePenalty();
        magazine6.returnItem();
        java.lang.String str57 = magazine6.getBorrowerEmail();
        java.lang.String str58 = magazine6.getItemType();
        boolean boolean59 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Magazine" + "'", str58, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1044, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=981, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getAuthor();
        java.lang.String str8 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=981, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=981, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine: LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=1044, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str8, "Magazine: LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=1044, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        items.Magazine magazine6 = new items.Magazine("Magazine", "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "Magazine", "Magazine");
        boolean boolean7 = magazine6.isRented();
        java.lang.String str8 = magazine6.toString();
        java.lang.String str9 = magazine6.getAuthor();
        java.lang.String str10 = magazine6.getPrice();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=14871, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=14871, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine" + "'", str10, "Magazine");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("");
        boolean boolean11 = magazine6.isRented();
        java.lang.String str12 = magazine6.toString();
        java.lang.String str13 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=14872, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=14872, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        java.lang.String str55 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("Magazine: . Location: . Purchasable: false");
        magazine6.returnItem();
        boolean boolean59 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getItemType();
        boolean boolean67 = magazine6.isRented();
        java.lang.String str68 = magazine6.getDetails();
        java.lang.String str69 = magazine6.toString();
        magazine6.setBorrowerEmail("LibraryItem [itemId=7878, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=2140, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Magazine" + "'", str66, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str68, "Magazine: . Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "LibraryItem [itemId=14879, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str69, "LibraryItem [itemId=14879, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getAuthor();
        double double67 = magazine6.calculateOverduePenalty();
        java.lang.String str68 = magazine6.getLocation();
        java.lang.String str69 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        items.Magazine magazine6 = new items.Magazine("hi!", "Magazine: . Location: . Purchasable: false", false, true, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine");
        int int7 = magazine6.getItemId();
        boolean boolean8 = magazine6.isRented();
        magazine6.setBorrowerEmail("LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str11 = magazine6.getItemType();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setIsPurchasable(true);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 14893 + "'", int7 == 14893);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine" + "'", str11, "Magazine");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getItemType();
        boolean boolean67 = magazine6.isRented();
        boolean boolean68 = magazine6.isOverdue();
        boolean boolean69 = magazine6.isPurchasable();
        java.lang.String str70 = magazine6.getBorrowerEmail();
        java.lang.String str71 = magazine6.getBorrowerEmail();
        java.lang.String str72 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Magazine" + "'", str66, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2142, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "", "LibraryItem [itemId=1587, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setBorrowerEmail("LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setBorrowerEmail("LibraryItem [itemId=10893, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isPurchasable();
        items.Magazine magazine17 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str18 = magazine17.getPublisher();
        double double19 = magazine17.calculateOverduePenalty();
        items.Magazine magazine26 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str27 = magazine26.getTitle();
        java.lang.String str28 = magazine26.getTitle();
        boolean boolean29 = magazine26.isOverdue();
        items.Magazine magazine36 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str37 = magazine36.getTitle();
        java.lang.String str38 = magazine36.getTitle();
        items.Magazine magazine45 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine52 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str53 = magazine52.getPublisher();
        items.Magazine magazine60 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str61 = magazine60.getPublisher();
        items.Magazine magazine68 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str69 = magazine68.getPublisher();
        double double70 = magazine68.calculateOverduePenalty();
        items.Magazine magazine77 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray78 = new items.LibraryItem[] { magazine52, magazine60, magazine68, magazine77 };
        java.util.ArrayList<items.LibraryItem> libraryItemList79 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList79, libraryItemArray78);
        boolean boolean81 = magazine45.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean82 = magazine36.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean83 = magazine26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean84 = magazine17.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean85 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        java.lang.String str86 = magazine6.getAuthor();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14902 + "'", int9 == 14902);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3301, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("Magazine: LibraryItem [itemId=3326, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=1773, itemType=Magazine, location=Magazine, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getPrice();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setBorrowerEmail("LibraryItem [itemId=4207, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str16 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14917 + "'", int9 == 14917);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        magazine6.setIsPurchasable(false);
        magazine6.setBorrowerEmail("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str69 = magazine6.getDetails();
        java.lang.String str70 = magazine6.getBorrowerEmail();
        java.lang.String str71 = magazine6.getTitle();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1493, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean74 = magazine6.isPurchasable();
        java.lang.Class<?> wildcardClass75 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str69, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str70, "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.returnItem();
        java.lang.String str8 = magazine6.getPrice();
        java.lang.String str9 = magazine6.getBorrowerEmail();
        java.lang.String str10 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean7 = magazine6.isRented();
        magazine6.setLocation("LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getPublisher();
        double double18 = magazine16.calculateOverduePenalty();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str26 = magazine25.getTitle();
        java.lang.String str27 = magazine25.getTitle();
        boolean boolean28 = magazine25.isOverdue();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getTitle();
        java.lang.String str37 = magazine35.getTitle();
        items.Magazine magazine44 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str52 = magazine51.getPublisher();
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str60 = magazine59.getPublisher();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str68 = magazine67.getPublisher();
        double double69 = magazine67.calculateOverduePenalty();
        items.Magazine magazine76 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { magazine51, magazine59, magazine67, magazine76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = magazine44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean81 = magazine35.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean82 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean83 = magazine16.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean84 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean85 = magazine6.isOverdue();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=11285, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3300, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "Magazine: . Location: Magazine: . Location: . Purchasable: false. Purchasable: false", "LibraryItem [itemId=14297, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, false, "", "LibraryItem [itemId=2669, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = magazine6.calculateOverduePenalty();
        magazine6.returnItem();
        java.lang.String str9 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getItemType();
        boolean boolean13 = magazine6.isPurchasable();
        magazine6.returnItem();
        java.lang.String str15 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str15, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("");
        magazine6.setBorrowerEmail("hi!");
        magazine6.setLocation("");
        java.lang.String str17 = magazine6.getLocation();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1493, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str20 = magazine6.getDetails();
        java.time.LocalDate localDate21 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate21, 6388, "LibraryItem [itemId=8947, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str20, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getTitle();
        java.lang.String str16 = magazine14.getTitle();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str47 = magazine46.getPublisher();
        double double48 = magazine46.calculateOverduePenalty();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray56 = new items.LibraryItem[] { magazine30, magazine38, magazine46, magazine55 };
        java.util.ArrayList<items.LibraryItem> libraryItemList57 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList57, libraryItemArray56);
        boolean boolean59 = magazine23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean60 = magazine14.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean61 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList57);
        java.lang.String str62 = magazine6.getItemType();
        boolean boolean63 = magazine6.isRented();
        java.lang.String str64 = magazine6.getPrice();
        magazine6.setBorrowerEmail("");
        java.lang.String str67 = magazine6.getAuthor();
        int int68 = magazine6.getItemId();
        magazine6.setLocation("LibraryItem [itemId=8379, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Magazine" + "'", str62, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 14939 + "'", int68 == 14939);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getPublisher();
        java.lang.String str68 = magazine6.getAuthor();
        int int69 = magazine6.getItemId();
        magazine6.setLocation("LibraryItem [itemId=11109, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 14946 + "'", int69 == 14946);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        items.Magazine magazine6 = new items.Magazine("Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", "", false, true, "LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6648, itemType=Magazine, location=LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("LibraryItem [itemId=7955, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.returnItem();
        java.lang.String str11 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        boolean boolean9 = magazine6.isPurchasable();
        magazine6.setIsPurchasable(true);
        boolean boolean12 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14954 + "'", int8 == 14954);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toString();
        java.lang.String str10 = magazine6.getLocation();
        items.Magazine magazine17 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str18 = magazine17.getTitle();
        int int19 = magazine17.getItemId();
        boolean boolean20 = magazine17.isPurchasable();
        int int21 = magazine17.getItemId();
        java.lang.String str22 = magazine17.getDetails();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getTitle();
        java.lang.String str31 = magazine29.getTitle();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine45 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str46 = magazine45.getPublisher();
        items.Magazine magazine53 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str54 = magazine53.getPublisher();
        items.Magazine magazine61 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str62 = magazine61.getPublisher();
        double double63 = magazine61.calculateOverduePenalty();
        items.Magazine magazine70 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray71 = new items.LibraryItem[] { magazine45, magazine53, magazine61, magazine70 };
        java.util.ArrayList<items.LibraryItem> libraryItemList72 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList72, libraryItemArray71);
        boolean boolean74 = magazine38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList72);
        boolean boolean75 = magazine29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList72);
        boolean boolean76 = magazine17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList72);
        boolean boolean77 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList72);
        boolean boolean78 = magazine6.isOverdue();
        int int79 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=14956, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=14956, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 14957 + "'", int19 == 14957);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14957 + "'", int21 == 14957);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str22, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int79 + "' != '" + 14956 + "'", int79 == 14956);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=6590, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=10279, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=6648, itemType=Magazine, location=LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2141, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=6590, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=6590, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.toString();
        java.lang.String str9 = magazine6.getPublisher();
        java.lang.String str10 = magazine6.getPrice();
        boolean boolean11 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=14965, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=14965, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.returnItem();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        boolean boolean19 = magazine16.isOverdue();
        items.Magazine magazine26 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str27 = magazine26.getTitle();
        java.lang.String str28 = magazine26.getTitle();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine42 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str43 = magazine42.getPublisher();
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str51 = magazine50.getPublisher();
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str59 = magazine58.getPublisher();
        double double60 = magazine58.calculateOverduePenalty();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray68 = new items.LibraryItem[] { magazine42, magazine50, magazine58, magazine67 };
        java.util.ArrayList<items.LibraryItem> libraryItemList69 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList69, libraryItemArray68);
        boolean boolean71 = magazine35.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean72 = magazine26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean73 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean74 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        magazine6.setBorrowerEmail("LibraryItem [itemId=3416, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str77 = magazine6.getTitle();
        java.lang.String str78 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14966 + "'", int8 == 14966);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=14974, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=14974, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("LibraryItem [itemId=918, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int14 = magazine6.getItemId();
        boolean boolean15 = magazine6.isOverdue();
        double double16 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14975 + "'", int14 == 14975);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        items.Magazine magazine6 = new items.Magazine("", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=453, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.returnItem();
        java.lang.Class<?> wildcardClass8 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getPublisher();
        double double12 = magazine6.calculateOverduePenalty();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setBorrowerEmail("LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean16 = magazine6.isOverdue();
        magazine6.setLocation("LibraryItem [itemId=2366, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setIsPurchasable(true);
        java.lang.String str21 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14977 + "'", int8 == 14977);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        magazine6.setIsPurchasable(false);
        java.lang.String str67 = magazine6.getDetails();
        java.lang.String str68 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str67, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Magazine" + "'", str68, "Magazine");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1687, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: . Location: . Purchasable: true", true, true, "LibraryItem [itemId=3208, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean7 = magazine6.isRented();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getTitle();
        java.lang.String str16 = magazine14.getTitle();
        magazine14.setIsPurchasable(true);
        java.lang.String str19 = magazine14.getBorrowerEmail();
        magazine14.returnItem();
        java.lang.String str21 = magazine14.getLocation();
        magazine14.setLocation("");
        java.lang.String str24 = magazine14.getItemType();
        java.lang.String str25 = magazine14.getLocation();
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getTitle();
        java.lang.String str34 = magazine32.getTitle();
        boolean boolean35 = magazine32.isOverdue();
        items.Magazine magazine42 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str43 = magazine42.getTitle();
        java.lang.String str44 = magazine42.getTitle();
        magazine42.setIsPurchasable(true);
        items.Magazine magazine53 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine60 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str61 = magazine60.getPublisher();
        items.Magazine magazine68 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str69 = magazine68.getPublisher();
        items.Magazine magazine76 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str77 = magazine76.getPublisher();
        double double78 = magazine76.calculateOverduePenalty();
        items.Magazine magazine85 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray86 = new items.LibraryItem[] { magazine60, magazine68, magazine76, magazine85 };
        java.util.ArrayList<items.LibraryItem> libraryItemList87 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList87, libraryItemArray86);
        boolean boolean89 = magazine53.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean90 = magazine42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean91 = magazine32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean92 = magazine14.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean93 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Magazine" + "'", str24, "Magazine");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        double double55 = magazine6.calculateOverduePenalty();
        magazine6.setIsPurchasable(false);
        java.lang.String str58 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Magazine" + "'", str58, "Magazine");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getPrice();
        java.lang.String str14 = magazine6.getItemType();
        java.lang.String str15 = magazine6.getDetails();
        java.lang.String str16 = magazine6.getLocation();
        double double17 = magazine6.calculateOverduePenalty();
        java.lang.String str18 = magazine6.getItemType();
        java.lang.String str19 = magazine6.getLocation();
        java.lang.String str20 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Magazine" + "'", str14, "Magazine");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str15, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Magazine" + "'", str18, "Magazine");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Magazine" + "'", str20, "Magazine");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        boolean boolean55 = magazine6.isRented();
        java.lang.String str56 = magazine6.getDetails();
        java.lang.String str57 = magazine6.toString();
        java.lang.String str58 = magazine6.getBorrowerEmail();
        java.time.LocalDate localDate59 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate59, 14639, "Magazine: LibraryItem [itemId=1103, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=3318, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str56, "Magazine: . Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "LibraryItem [itemId=15008, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str57, "LibraryItem [itemId=15008, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getPublisher();
        java.lang.String str10 = magazine6.getDetails();
        java.lang.String str11 = magazine6.getTitle();
        magazine6.returnItem();
        boolean boolean13 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str10, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        boolean boolean11 = magazine6.isRented();
        java.lang.String str12 = magazine6.getPublisher();
        magazine6.setBorrowerEmail("LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15015 + "'", int9 == 15015);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        boolean boolean67 = magazine6.isPurchasable();
        java.lang.String str68 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        boolean boolean11 = magazine6.isOverdue();
        items.Magazine magazine18 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str19 = magazine18.getTitle();
        java.lang.String str20 = magazine18.getTitle();
        java.lang.String str21 = magazine18.getItemType();
        java.lang.String str22 = magazine18.getAuthor();
        java.lang.String str23 = magazine18.getItemType();
        java.lang.String str24 = magazine18.getItemType();
        items.Magazine magazine31 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str32 = magazine31.getTitle();
        java.lang.String str33 = magazine31.getTitle();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str48 = magazine47.getPublisher();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str56 = magazine55.getPublisher();
        items.Magazine magazine63 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str64 = magazine63.getPublisher();
        double double65 = magazine63.calculateOverduePenalty();
        items.Magazine magazine72 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray73 = new items.LibraryItem[] { magazine47, magazine55, magazine63, magazine72 };
        java.util.ArrayList<items.LibraryItem> libraryItemList74 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList74, libraryItemArray73);
        boolean boolean76 = magazine40.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList74);
        boolean boolean77 = magazine31.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList74);
        boolean boolean78 = magazine18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList74);
        boolean boolean79 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList74);
        java.lang.String str80 = magazine6.getDetails();
        boolean boolean81 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15023 + "'", int9 == 15023);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Magazine" + "'", str21, "Magazine");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Magazine" + "'", str23, "Magazine");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Magazine" + "'", str24, "Magazine");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str80, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        int int8 = magazine6.getItemId();
        java.lang.String str9 = magazine6.getPublisher();
        magazine6.setIsPurchasable(true);
        java.lang.String str12 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15031 + "'", int8 == 15031);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine", true, false, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPrice();
        java.lang.String str8 = magazine6.getBorrowerEmail();
        java.lang.String str9 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        java.lang.String str11 = magazine6.getItemType();
        java.lang.String str12 = magazine6.getItemType();
        boolean boolean13 = magazine6.isOverdue();
        java.lang.String str14 = magazine6.getDetails();
        java.lang.String str15 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine" + "'", str11, "Magazine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str14, "Magazine: . Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LibraryItem [itemId=15033, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str15, "LibraryItem [itemId=15033, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        magazine6.returnItem();
        java.lang.Class<?> wildcardClass11 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine", true, false, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPublisher();
        java.lang.String str8 = magazine6.getPrice();
        java.lang.String str9 = magazine6.toString();
        magazine6.setIsPurchasable(false);
        boolean boolean12 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15035, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15035, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getDetails();
        java.lang.String str12 = magazine6.getItemType();
        java.lang.String str13 = magazine6.getPrice();
        java.lang.String str14 = magazine6.getPublisher();
        boolean boolean15 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str11, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        java.lang.String str9 = magazine6.getPrice();
        boolean boolean10 = magazine6.isOverdue();
        java.lang.String str11 = magazine6.getPublisher();
        magazine6.setIsPurchasable(false);
        java.lang.String str14 = magazine6.getLocation();
        boolean boolean15 = magazine6.isOverdue();
        boolean boolean16 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15037 + "'", int8 == 15037);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        java.lang.String str55 = magazine6.getLocation();
        java.lang.String str56 = magazine6.getPrice();
        boolean boolean57 = magazine6.isOverdue();
        java.lang.String str58 = magazine6.getBorrowerEmail();
        magazine6.setBorrowerEmail("LibraryItem [itemId=11697, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getBorrowerEmail();
        boolean boolean13 = magazine6.isPurchasable();
        boolean boolean14 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("");
        java.lang.String str17 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getPrice();
        magazine6.returnItem();
        int int12 = magazine6.getItemId();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15045 + "'", int9 == 15045);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15045 + "'", int12 == 15045);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2697, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=7765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4050, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=15046, itemType=Magazine, location=LibraryItem [itemId=1765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=7765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=15046, itemType=Magazine, location=LibraryItem [itemId=1765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=7765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setLocation("Magazine: Magazine. Location: Magazine. Purchasable: true");
        java.lang.String str13 = magazine6.getBorrowerEmail();
        magazine6.setBorrowerEmail("LibraryItem [itemId=2421, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str16 = magazine6.getPublisher();
        java.time.LocalDate localDate17 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate17, 4628, "LibraryItem [itemId=854, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        double double55 = magazine6.calculateOverduePenalty();
        boolean boolean56 = magazine6.isPurchasable();
        java.lang.String str57 = magazine6.getPublisher();
        boolean boolean58 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        java.lang.String str8 = magazine6.getBorrowerEmail();
        java.lang.String str9 = magazine6.getPrice();
        magazine6.setLocation("Magazine: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        java.lang.String str12 = magazine6.getItemType();
        java.lang.String str13 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=15054, itemType=Magazine, location=Magazine: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=15054, itemType=Magazine, location=Magazine: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        boolean boolean8 = magazine6.isRented();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str16 = magazine15.getPublisher();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str24 = magazine23.getTitle();
        java.lang.String str25 = magazine23.getTitle();
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine39 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str40 = magazine39.getPublisher();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str48 = magazine47.getPublisher();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str56 = magazine55.getPublisher();
        double double57 = magazine55.calculateOverduePenalty();
        items.Magazine magazine64 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { magazine39, magazine47, magazine55, magazine64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = magazine32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = magazine23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = magazine15.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean71 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        double double72 = magazine6.calculateOverduePenalty();
        java.lang.String str73 = magazine6.toString();
        java.lang.String str74 = magazine6.getDetails();
        java.lang.String str75 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "LibraryItem [itemId=15055, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str73, "LibraryItem [itemId=15055, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str74, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str75, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=5114, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=10024, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=4374, itemType=Magazine, location=LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=8963, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setLocation("LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Magazine magazine17 = new items.Magazine("hi!", "Magazine: . Location: . Purchasable: false", false, true, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine");
        items.Magazine magazine24 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str25 = magazine24.getTitle();
        java.lang.String str26 = magazine24.getTitle();
        boolean boolean27 = magazine24.isOverdue();
        java.lang.String str28 = magazine24.getAuthor();
        boolean boolean29 = magazine24.isOverdue();
        java.lang.String str30 = magazine24.getBorrowerEmail();
        java.lang.String str31 = magazine24.toString();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str47 = magazine46.getTitle();
        java.lang.String str48 = magazine46.getTitle();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine62 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str63 = magazine62.getPublisher();
        items.Magazine magazine70 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str71 = magazine70.getPublisher();
        items.Magazine magazine78 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str79 = magazine78.getPublisher();
        double double80 = magazine78.calculateOverduePenalty();
        items.Magazine magazine87 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray88 = new items.LibraryItem[] { magazine62, magazine70, magazine78, magazine87 };
        java.util.ArrayList<items.LibraryItem> libraryItemList89 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList89, libraryItemArray88);
        boolean boolean91 = magazine55.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean92 = magazine46.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean93 = magazine38.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean94 = magazine24.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean95 = magazine17.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList89);
        boolean boolean96 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList89);
        int int97 = magazine6.getItemId();
        int int98 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15064 + "'", int8 == 15064);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LibraryItem [itemId=15066, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str31, "LibraryItem [itemId=15066, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int97 + "' != '" + 15064 + "'", int97 == 15064);
// flaky:         org.junit.Assert.assertTrue("'" + int98 + "' != '" + 15064 + "'", int98 == 15064);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2685, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2735, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=2305, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=798, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setIsPurchasable(false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=12809, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4250, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=4401, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2366, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getItemType();
        magazine6.setLocation("");
        magazine6.setBorrowerEmail("");
        double double15 = magazine6.calculateOverduePenalty();
        magazine6.returnItem();
        java.lang.String str17 = magazine6.toString();
        java.lang.String str18 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine" + "'", str10, "Magazine");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LibraryItem [itemId=15076, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str17, "LibraryItem [itemId=15076, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=10794, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "LibraryItem [itemId=11860, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3854, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isOverdue();
        items.Magazine magazine18 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str19 = magazine18.getPublisher();
        boolean boolean20 = magazine18.isRented();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getPublisher();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getTitle();
        java.lang.String str37 = magazine35.getTitle();
        items.Magazine magazine44 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str52 = magazine51.getPublisher();
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str60 = magazine59.getPublisher();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str68 = magazine67.getPublisher();
        double double69 = magazine67.calculateOverduePenalty();
        items.Magazine magazine76 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { magazine51, magazine59, magazine67, magazine76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = magazine44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean81 = magazine35.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean82 = magazine27.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean83 = magazine18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean84 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        java.lang.String str85 = magazine6.getLocation();
        java.lang.String str86 = magazine6.getAuthor();
        java.lang.String str87 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=3326, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1493, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=2881, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = magazine6.isRented();
        java.lang.String str8 = magazine6.getPublisher();
        java.lang.String str9 = magazine6.getDetails();
        boolean boolean10 = magazine6.isPurchasable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine: LibraryItem [itemId=2881, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=3326, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true" + "'", str9, "Magazine: LibraryItem [itemId=2881, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=3326, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "Magazine: . Location: . Purchasable: true", "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getBorrowerEmail();
        java.lang.String str8 = magazine6.getPublisher();
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15088 + "'", int9 == 15088);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str10, "Magazine: . Location: . Purchasable: true");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getTitle();
        java.lang.String str16 = magazine14.getTitle();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str47 = magazine46.getPublisher();
        double double48 = magazine46.calculateOverduePenalty();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray56 = new items.LibraryItem[] { magazine30, magazine38, magazine46, magazine55 };
        java.util.ArrayList<items.LibraryItem> libraryItemList57 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList57, libraryItemArray56);
        boolean boolean59 = magazine23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean60 = magazine14.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean61 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList57);
        java.lang.String str62 = magazine6.getItemType();
        boolean boolean63 = magazine6.isRented();
        java.lang.String str64 = magazine6.getPrice();
        magazine6.setBorrowerEmail("");
        java.lang.String str67 = magazine6.getAuthor();
        int int68 = magazine6.getItemId();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Magazine" + "'", str62, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 15089 + "'", int68 == 15089);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        items.Magazine magazine6 = new items.Magazine("", "LibraryItem [itemId=13509, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2673, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=13572, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Magazine: LibraryItem [itemId=2673, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: . Purchasable: false" + "'", str7, "Magazine: LibraryItem [itemId=2673, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: . Purchasable: false");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getItemType();
        boolean boolean67 = magazine6.isRented();
        boolean boolean68 = magazine6.isOverdue();
        java.lang.String str69 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Magazine" + "'", str66, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Magazine" + "'", str69, "Magazine");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getPrice();
        java.lang.String str14 = magazine6.getAuthor();
        java.lang.String str15 = magazine6.getPublisher();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1677, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str18 = magazine6.getItemType();
        double double19 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Magazine" + "'", str18, "Magazine");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        boolean boolean8 = magazine6.isRented();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str16 = magazine15.getPublisher();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str24 = magazine23.getTitle();
        java.lang.String str25 = magazine23.getTitle();
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine39 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str40 = magazine39.getPublisher();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str48 = magazine47.getPublisher();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str56 = magazine55.getPublisher();
        double double57 = magazine55.calculateOverduePenalty();
        items.Magazine magazine64 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { magazine39, magazine47, magazine55, magazine64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = magazine32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = magazine23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = magazine15.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean71 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        int int72 = magazine6.getItemId();
        magazine6.returnItem();
        magazine6.setLocation("LibraryItem [itemId=3839, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean76 = magazine6.isRented();
        java.lang.String str77 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int72 + "' != '" + 15105 + "'", int72 == 15105);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        java.lang.String str11 = magazine6.getItemType();
        java.lang.String str12 = magazine6.getItemType();
        magazine6.setBorrowerEmail("Magazine: . Location: Magazine: . Location: . Purchasable: false. Purchasable: false");
        java.lang.String str15 = magazine6.getTitle();
        double double16 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine" + "'", str11, "Magazine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getPublisher();
        boolean boolean18 = magazine16.isRented();
        int int19 = magazine16.getItemId();
        java.lang.String str20 = magazine16.getTitle();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getPublisher();
        double double29 = magazine27.calculateOverduePenalty();
        int int30 = magazine27.getItemId();
        boolean boolean31 = magazine27.isRented();
        double double32 = magazine27.calculateOverduePenalty();
        items.Magazine magazine39 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str47 = magazine46.getPublisher();
        items.Magazine magazine54 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str55 = magazine54.getPublisher();
        items.Magazine magazine62 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str63 = magazine62.getPublisher();
        double double64 = magazine62.calculateOverduePenalty();
        items.Magazine magazine71 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray72 = new items.LibraryItem[] { magazine46, magazine54, magazine62, magazine71 };
        java.util.ArrayList<items.LibraryItem> libraryItemList73 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList73, libraryItemArray72);
        boolean boolean75 = magazine39.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean76 = magazine27.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean77 = magazine16.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean78 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        magazine6.setLocation("LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str81 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15115 + "'", int19 == 15115);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15116 + "'", int30 == 15116);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        items.Magazine magazine17 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str18 = magazine17.getTitle();
        int int19 = magazine17.getItemId();
        magazine17.returnItem();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getTitle();
        java.lang.String str29 = magazine27.getTitle();
        boolean boolean30 = magazine27.isOverdue();
        items.Magazine magazine37 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str38 = magazine37.getTitle();
        java.lang.String str39 = magazine37.getTitle();
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine53 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str54 = magazine53.getPublisher();
        items.Magazine magazine61 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str62 = magazine61.getPublisher();
        items.Magazine magazine69 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str70 = magazine69.getPublisher();
        double double71 = magazine69.calculateOverduePenalty();
        items.Magazine magazine78 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray79 = new items.LibraryItem[] { magazine53, magazine61, magazine69, magazine78 };
        java.util.ArrayList<items.LibraryItem> libraryItemList80 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList80, libraryItemArray79);
        boolean boolean82 = magazine46.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean83 = magazine37.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean84 = magazine27.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean85 = magazine17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean86 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList80);
        java.lang.String str87 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15122 + "'", int9 == 15122);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15123 + "'", int19 == 15123);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str87, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        java.lang.String str7 = magazine6.getLocation();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getPublisher();
        boolean boolean16 = magazine14.isRented();
        java.lang.String str17 = magazine14.getLocation();
        java.lang.String str18 = magazine14.getDetails();
        java.lang.String str19 = magazine14.getPrice();
        items.Magazine magazine26 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str27 = magazine26.getTitle();
        java.lang.String str28 = magazine26.getTitle();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine42 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str43 = magazine42.getPublisher();
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str51 = magazine50.getPublisher();
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str59 = magazine58.getPublisher();
        double double60 = magazine58.calculateOverduePenalty();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray68 = new items.LibraryItem[] { magazine42, magazine50, magazine58, magazine67 };
        java.util.ArrayList<items.LibraryItem> libraryItemList69 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList69, libraryItemArray68);
        boolean boolean71 = magazine35.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean72 = magazine26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean73 = magazine14.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList69);
        boolean boolean74 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList69);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str18, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean7 = magazine6.isRented();
        java.lang.String str8 = magazine6.toString();
        magazine6.setLocation("LibraryItem [itemId=2149, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str11 = magazine6.toString();
        boolean boolean12 = magazine6.isPurchasable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=15139, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=15139, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=15139, itemType=Magazine, location=LibraryItem [itemId=2149, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=15139, itemType=Magazine, location=LibraryItem [itemId=2149, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2931, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2673, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=10857, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=Magazine: . Location: . Purchasable: true, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=9559, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getPublisher();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getPublisher();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getPublisher();
        double double31 = magazine29.calculateOverduePenalty();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { magazine13, magazine21, magazine29, magazine38 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        java.lang.String str43 = magazine6.getPublisher();
        double double44 = magazine6.calculateOverduePenalty();
        java.lang.String str45 = magazine6.getTitle();
        magazine6.setBorrowerEmail("LibraryItem [itemId=4707, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setIsPurchasable(false);
        java.lang.String str50 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1203, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", false, false, "LibraryItem [itemId=8821, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7180, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getPublisher();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getPublisher();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getPublisher();
        double double31 = magazine29.calculateOverduePenalty();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { magazine13, magazine21, magazine29, magazine38 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        boolean boolean43 = magazine6.isPurchasable();
        boolean boolean44 = magazine6.isOverdue();
        magazine6.setIsPurchasable(true);
        java.lang.String str47 = magazine6.getDetails();
        java.lang.String str48 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str47, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getTitle();
        magazine6.returnItem();
        int int14 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15152 + "'", int9 == 15152);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15152 + "'", int14 == 15152);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("Magazine: . Location: . Purchasable: false");
        magazine6.setLocation("hi!");
        magazine6.returnItem();
        boolean boolean16 = magazine6.isRented();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1951, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setBorrowerEmail("LibraryItem [itemId=4305, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.Class<?> wildcardClass21 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getBorrowerEmail();
        java.lang.String str13 = magazine6.toString();
        boolean boolean14 = magazine6.isOverdue();
        magazine6.setIsPurchasable(true);
        boolean boolean17 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=15154, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=15154, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine", true, false, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.getAuthor();
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15155 + "'", int9 == 15155);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isOverdue();
        items.Magazine magazine18 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str19 = magazine18.getPublisher();
        boolean boolean20 = magazine18.isRented();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getPublisher();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getTitle();
        java.lang.String str37 = magazine35.getTitle();
        items.Magazine magazine44 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str52 = magazine51.getPublisher();
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str60 = magazine59.getPublisher();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str68 = magazine67.getPublisher();
        double double69 = magazine67.calculateOverduePenalty();
        items.Magazine magazine76 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { magazine51, magazine59, magazine67, magazine76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = magazine44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean81 = magazine35.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean82 = magazine27.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean83 = magazine18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean84 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        double double85 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double88 = magazine6.calculateOverduePenalty();
        boolean boolean89 = magazine6.isPurchasable();
        magazine6.setLocation("LibraryItem [itemId=796, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setIsPurchasable(true);
        java.lang.String str94 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getTitle();
        java.lang.String str67 = magazine6.toString();
        magazine6.setLocation("LibraryItem [itemId=1765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setBorrowerEmail("LibraryItem [itemId=14120, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "LibraryItem [itemId=15165, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str67, "LibraryItem [itemId=15165, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("LibraryItem [itemId=453, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str69 = magazine6.getAuthor();
        java.lang.String str70 = magazine6.getAuthor();
        java.time.LocalDate localDate71 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate71, 11765, "LibraryItem [itemId=6508, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        int int65 = magazine6.getItemId();
        boolean boolean66 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 15179 + "'", int65 == 15179);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean10 = magazine6.isPurchasable();
        java.lang.String str11 = magazine6.getAuthor();
        boolean boolean12 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=453, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine", false, false, "Magazine", "");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getBorrowerEmail();
        java.lang.String str9 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=453, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=453, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean64 = magazine6.isPurchasable();
        magazine6.setLocation("Magazine: . Location: . Purchasable: false");
        magazine6.returnItem();
        magazine6.returnItem();
        double double69 = magazine6.calculateOverduePenalty();
        java.lang.String str70 = magazine6.getDetails();
        boolean boolean71 = magazine6.isOverdue();
        java.lang.String str72 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Magazine: . Location: Magazine: . Location: . Purchasable: false. Purchasable: false" + "'", str70, "Magazine: . Location: Magazine: . Location: . Purchasable: false. Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "LibraryItem [itemId=15188, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str72, "LibraryItem [itemId=15188, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        java.lang.String str8 = magazine6.getBorrowerEmail();
        java.lang.String str9 = magazine6.getPrice();
        boolean boolean10 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine", true, false, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getAuthor();
        double double8 = magazine6.calculateOverduePenalty();
        java.lang.String str9 = magazine6.getLocation();
        magazine6.setLocation("LibraryItem [itemId=8038, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean7 = magazine6.isRented();
        magazine6.setLocation("LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str10 = magazine6.getPrice();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        magazine6.setIsPurchasable(false);
        boolean boolean67 = magazine6.isPurchasable();
        magazine6.setIsPurchasable(false);
        boolean boolean70 = magazine6.isRented();
        java.lang.String str71 = magazine6.getDetails();
        java.lang.String str72 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str71, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPrice();
        java.lang.String str8 = magazine6.getBorrowerEmail();
        magazine6.setBorrowerEmail("Magazine: LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("");
        int int71 = magazine6.getItemId();
        java.lang.String str72 = magazine6.toString();
        java.lang.String str73 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 15207 + "'", int71 == 15207);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "LibraryItem [itemId=15207, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str72, "LibraryItem [itemId=15207, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getAuthor();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15214 + "'", int8 == 15214);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=15214, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=15214, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        items.Magazine magazine17 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str18 = magazine17.getTitle();
        int int19 = magazine17.getItemId();
        magazine17.returnItem();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getTitle();
        java.lang.String str29 = magazine27.getTitle();
        boolean boolean30 = magazine27.isOverdue();
        items.Magazine magazine37 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str38 = magazine37.getTitle();
        java.lang.String str39 = magazine37.getTitle();
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine53 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str54 = magazine53.getPublisher();
        items.Magazine magazine61 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str62 = magazine61.getPublisher();
        items.Magazine magazine69 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str70 = magazine69.getPublisher();
        double double71 = magazine69.calculateOverduePenalty();
        items.Magazine magazine78 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray79 = new items.LibraryItem[] { magazine53, magazine61, magazine69, magazine78 };
        java.util.ArrayList<items.LibraryItem> libraryItemList80 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList80, libraryItemArray79);
        boolean boolean82 = magazine46.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean83 = magazine37.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean84 = magazine27.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean85 = magazine17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList80);
        boolean boolean86 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList80);
        magazine6.setIsPurchasable(false);
        boolean boolean89 = magazine6.isRented();
        boolean boolean90 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15215 + "'", int9 == 15215);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15216 + "'", int19 == 15216);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getPublisher();
        boolean boolean18 = magazine16.isRented();
        int int19 = magazine16.getItemId();
        java.lang.String str20 = magazine16.getTitle();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getPublisher();
        double double29 = magazine27.calculateOverduePenalty();
        int int30 = magazine27.getItemId();
        boolean boolean31 = magazine27.isRented();
        double double32 = magazine27.calculateOverduePenalty();
        items.Magazine magazine39 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str47 = magazine46.getPublisher();
        items.Magazine magazine54 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str55 = magazine54.getPublisher();
        items.Magazine magazine62 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str63 = magazine62.getPublisher();
        double double64 = magazine62.calculateOverduePenalty();
        items.Magazine magazine71 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray72 = new items.LibraryItem[] { magazine46, magazine54, magazine62, magazine71 };
        java.util.ArrayList<items.LibraryItem> libraryItemList73 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList73, libraryItemArray72);
        boolean boolean75 = magazine39.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean76 = magazine27.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean77 = magazine16.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList73);
        boolean boolean78 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList73);
        magazine6.setLocation("LibraryItem [itemId=4050, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("Magazine: LibraryItem [itemId=2881, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=3326, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15225 + "'", int19 == 15225);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15226 + "'", int30 == 15226);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=796, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPrice();
        java.lang.String str8 = magazine6.getLocation();
        java.lang.String str9 = magazine6.getPublisher();
        java.lang.String str10 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean64 = magazine6.isPurchasable();
        magazine6.setLocation("Magazine: . Location: . Purchasable: false");
        int int67 = magazine6.getItemId();
        java.lang.String str68 = magazine6.getPublisher();
        java.lang.String str69 = magazine6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 15233 + "'", int67 == 15233);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getTitle();
        java.lang.String str16 = magazine14.getTitle();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str47 = magazine46.getPublisher();
        double double48 = magazine46.calculateOverduePenalty();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray56 = new items.LibraryItem[] { magazine30, magazine38, magazine46, magazine55 };
        java.util.ArrayList<items.LibraryItem> libraryItemList57 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList57, libraryItemArray56);
        boolean boolean59 = magazine23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean60 = magazine14.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean61 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList57);
        java.lang.String str62 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getPrice();
        items.Magazine magazine20 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str21 = magazine20.getPublisher();
        java.lang.String str22 = magazine20.getBorrowerEmail();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getTitle();
        java.lang.String str31 = magazine29.getTitle();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine45 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str46 = magazine45.getPublisher();
        items.Magazine magazine53 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str54 = magazine53.getPublisher();
        items.Magazine magazine61 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str62 = magazine61.getPublisher();
        double double63 = magazine61.calculateOverduePenalty();
        items.Magazine magazine70 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray71 = new items.LibraryItem[] { magazine45, magazine53, magazine61, magazine70 };
        java.util.ArrayList<items.LibraryItem> libraryItemList72 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList72, libraryItemArray71);
        boolean boolean74 = magazine38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList72);
        boolean boolean75 = magazine29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList72);
        boolean boolean76 = magazine20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList72);
        boolean boolean77 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList72);
        java.lang.String str78 = magazine6.getLocation();
        boolean boolean79 = magazine6.isOverdue();
        java.lang.String str80 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getAuthor();
        double double12 = magazine6.calculateOverduePenalty();
        java.lang.String str13 = magazine6.getBorrowerEmail();
        java.lang.String str14 = magazine6.getPublisher();
        java.lang.String str15 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15255 + "'", int8 == 15255);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str15, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        java.lang.String str55 = magazine6.getLocation();
        java.lang.String str56 = magazine6.getPrice();
        double double57 = magazine6.calculateOverduePenalty();
        java.lang.String str58 = magazine6.getPrice();
        java.lang.String str59 = magazine6.toString();
        java.lang.Class<?> wildcardClass60 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "LibraryItem [itemId=15256, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str59, "LibraryItem [itemId=15256, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getTitle();
        magazine6.returnItem();
        boolean boolean69 = magazine6.isOverdue();
        magazine6.setBorrowerEmail("LibraryItem [itemId=6231, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str72 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str72, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toString();
        magazine6.setIsPurchasable(false);
        magazine6.setBorrowerEmail("");
        double double14 = magazine6.calculateOverduePenalty();
        magazine6.setIsPurchasable(false);
        java.lang.String str17 = magazine6.getDetails();
        int int18 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15269, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15269, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str17, "Magazine: . Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15269 + "'", int18 == 15269);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        items.Magazine magazine6 = new items.Magazine("Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", "", false, true, "LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6648, itemType=Magazine, location=LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getDetails();
        java.lang.String str8 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Magazine: LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false" + "'", str7, "Magazine: LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=6648, itemType=Magazine, location=LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=6648, itemType=Magazine, location=LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getPublisher();
        double double12 = magazine6.calculateOverduePenalty();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setBorrowerEmail("LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setBorrowerEmail("Magazine: . Location: Magazine: Magazine. Location: Magazine. Purchasable: true. Purchasable: false");
        java.lang.String str18 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15271 + "'", int8 == 15271);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("");
        magazine6.setBorrowerEmail("hi!");
        magazine6.setLocation("LibraryItem [itemId=1888, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=13541, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        java.lang.String str55 = magazine6.getLocation();
        java.lang.String str56 = magazine6.getPrice();
        magazine6.returnItem();
        magazine6.setLocation("LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str60 = magazine6.getPrice();
        magazine6.setLocation("LibraryItem [itemId=2673, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setIsPurchasable(false);
        java.time.LocalDate localDate65 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate65, 13658, "LibraryItem [itemId=3232, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=13965, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=10225, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=11638, itemType=Magazine, location=LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6955, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2038, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2881, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=606, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2589, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPublisher();
        java.lang.String str8 = magazine6.getPrice();
        magazine6.setIsPurchasable(false);
        java.lang.String str11 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=2589, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=2589, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=2589, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=2589, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=2589, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=2589, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.toString();
        java.lang.String str13 = magazine6.getPublisher();
        java.lang.String str14 = magazine6.getBorrowerEmail();
        boolean boolean15 = magazine6.isRented();
        java.lang.String str16 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=15288, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=15288, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        double double12 = magazine6.calculateOverduePenalty();
        boolean boolean13 = magazine6.isPurchasable();
        java.lang.String str14 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=14297, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=11205, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=6058, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=12842, itemType=Magazine, location=LibraryItem [itemId=4279, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        items.Magazine magazine6 = new items.Magazine("Magazine: . Location: . Purchasable: true", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!");
        boolean boolean7 = magazine6.isOverdue();
        java.lang.String str8 = magazine6.getItemType();
        boolean boolean9 = magazine6.isRented();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine" + "'", str8, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=4122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3661, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "", "LibraryItem [itemId=6026, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Magazine: . Location: LibraryItem [itemId=4122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str7, "Magazine: . Location: LibraryItem [itemId=4122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str10 = magazine6.getDetails();
        magazine6.setIsPurchasable(true);
        items.Magazine magazine19 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str20 = magazine19.getTitle();
        java.lang.String str21 = magazine19.getTitle();
        items.Magazine magazine28 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getPublisher();
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str44 = magazine43.getPublisher();
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str52 = magazine51.getPublisher();
        double double53 = magazine51.calculateOverduePenalty();
        items.Magazine magazine60 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray61 = new items.LibraryItem[] { magazine35, magazine43, magazine51, magazine60 };
        java.util.ArrayList<items.LibraryItem> libraryItemList62 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList62, libraryItemArray61);
        boolean boolean64 = magazine28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        boolean boolean65 = magazine19.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        boolean boolean66 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList62);
        java.lang.String str67 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str10, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getPublisher();
        double double12 = magazine6.calculateOverduePenalty();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15300 + "'", int8 == 15300);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        items.Magazine magazine6 = new items.Magazine("", "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=8858, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6648, itemType=Magazine, location=LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=12527, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getPrice();
        boolean boolean68 = magazine6.isRented();
        double double69 = magazine6.calculateOverduePenalty();
        java.lang.String str70 = magazine6.toString();
        java.lang.String str71 = magazine6.getPrice();
        java.lang.String str72 = magazine6.getPrice();
        java.lang.String str73 = magazine6.getPrice();
        double double74 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "LibraryItem [itemId=15302, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str70, "LibraryItem [itemId=15302, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setLocation("");
        java.lang.String str16 = magazine6.getTitle();
        boolean boolean17 = magazine6.isRented();
        boolean boolean18 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        java.lang.String str11 = magazine6.getBorrowerEmail();
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        java.lang.String str12 = magazine6.getItemType();
        boolean boolean13 = magazine6.isOverdue();
        java.lang.String str14 = magazine6.getAuthor();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getTitle();
        java.lang.String str23 = magazine21.getTitle();
        java.lang.String str24 = magazine21.getItemType();
        java.lang.String str25 = magazine21.getAuthor();
        java.lang.String str26 = magazine21.getItemType();
        java.lang.String str27 = magazine21.getItemType();
        items.Magazine magazine34 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str35 = magazine34.getTitle();
        java.lang.String str36 = magazine34.getTitle();
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str51 = magazine50.getPublisher();
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str59 = magazine58.getPublisher();
        items.Magazine magazine66 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str67 = magazine66.getPublisher();
        double double68 = magazine66.calculateOverduePenalty();
        items.Magazine magazine75 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray76 = new items.LibraryItem[] { magazine50, magazine58, magazine66, magazine75 };
        java.util.ArrayList<items.LibraryItem> libraryItemList77 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList77, libraryItemArray76);
        boolean boolean79 = magazine43.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean80 = magazine34.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean81 = magazine21.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean82 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        java.lang.String str83 = magazine6.getDetails();
        java.lang.String str84 = magazine6.getBorrowerEmail();
        double double85 = magazine6.calculateOverduePenalty();
        boolean boolean86 = magazine6.isOverdue();
        java.lang.String str87 = magazine6.getPrice();
        double double88 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Magazine" + "'", str24, "Magazine");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Magazine" + "'", str26, "Magazine");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Magazine" + "'", str27, "Magazine");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str83, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        magazine6.returnItem();
        magazine6.setIsPurchasable(false);
        magazine6.setBorrowerEmail("LibraryItem [itemId=3646, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean70 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        boolean boolean9 = magazine6.isPurchasable();
        int int10 = magazine6.getItemId();
        java.lang.String str11 = magazine6.getLocation();
        double double12 = magazine6.calculateOverduePenalty();
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15327 + "'", int8 == 15327);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15327 + "'", int10 == 15327);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getItemType();
        magazine6.setIsPurchasable(true);
        java.lang.String str69 = magazine6.getLocation();
        java.lang.String str70 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Magazine" + "'", str66, "Magazine");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("LibraryItem [itemId=6409, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str13 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15335 + "'", int9 == 15335);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=15335, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=15335, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: Magazine. Location: Magazine. Purchasable: true");
        boolean boolean7 = magazine6.isOverdue();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine: LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str9, "Magazine: LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        java.lang.String str55 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str58 = magazine6.toString();
        java.lang.String str59 = magazine6.getLocation();
        java.lang.String str60 = magazine6.getItemType();
        java.lang.String str61 = magazine6.getPublisher();
        java.lang.String str62 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "LibraryItem [itemId=15337, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str58, "LibraryItem [itemId=15337, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Magazine" + "'", str60, "Magazine");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getLocation();
        boolean boolean12 = magazine6.isRented();
        java.lang.String str13 = magazine6.getBorrowerEmail();
        java.lang.String str14 = magazine6.getPublisher();
        java.lang.String str15 = magazine6.getItemType();
        magazine6.setIsPurchasable(true);
        double double18 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine" + "'", str15, "Magazine");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("");
        magazine6.setBorrowerEmail("hi!");
        java.lang.String str15 = magazine6.getPrice();
        java.lang.String str16 = magazine6.getBorrowerEmail();
        boolean boolean17 = magazine6.isPurchasable();
        java.lang.Class<?> wildcardClass18 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getPrice();
        double double11 = magazine6.calculateOverduePenalty();
        items.Magazine magazine18 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str19 = magazine18.getTitle();
        java.lang.String str20 = magazine18.getTitle();
        magazine18.setIsPurchasable(true);
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine36 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str37 = magazine36.getPublisher();
        items.Magazine magazine44 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str45 = magazine44.getPublisher();
        items.Magazine magazine52 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str53 = magazine52.getPublisher();
        double double54 = magazine52.calculateOverduePenalty();
        items.Magazine magazine61 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray62 = new items.LibraryItem[] { magazine36, magazine44, magazine52, magazine61 };
        java.util.ArrayList<items.LibraryItem> libraryItemList63 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList63, libraryItemArray62);
        boolean boolean65 = magazine29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList63);
        boolean boolean66 = magazine18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList63);
        boolean boolean67 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList63);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        items.Magazine magazine6 = new items.Magazine("Magazine", "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "Magazine", "Magazine");
        java.lang.String str7 = magazine6.getDetails();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setBorrowerEmail("LibraryItem [itemId=9293, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Magazine: Magazine. Location: Magazine. Purchasable: true" + "'", str7, "Magazine: Magazine. Location: Magazine. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine" + "'", str8, "Magazine");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        items.Magazine magazine6 = new items.Magazine("hi!", "Magazine: . Location: . Purchasable: false", false, true, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine");
        int int7 = magazine6.getItemId();
        boolean boolean8 = magazine6.isRented();
        magazine6.setBorrowerEmail("LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str11 = magazine6.getDetails();
        java.time.LocalDate localDate12 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate12, 11614, "LibraryItem [itemId=10000, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15354 + "'", int7 == 15354);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: hi!. Purchasable: false" + "'", str11, "Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: hi!. Purchasable: false");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=3784, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4869, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=8443, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7327, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Magazine magazine13 = new items.Magazine("LibraryItem [itemId=2215, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2938, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = magazine13.getTitle();
        java.lang.String str15 = magazine13.getTitle();
        java.lang.String str16 = magazine13.getAuthor();
        java.lang.String str17 = magazine13.getLocation();
        boolean boolean18 = magazine13.isRented();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine13.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str15, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str16, "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LibraryItem [itemId=2215, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str17, "LibraryItem [itemId=2215, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=3944, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, false, "LibraryItem [itemId=2735, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7167, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("");
        boolean boolean71 = magazine6.isOverdue();
        java.lang.String str72 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        java.lang.String str9 = magazine6.getPrice();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getAuthor();
        java.lang.String str12 = magazine6.getPrice();
        boolean boolean13 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.toString();
        java.lang.String str13 = magazine6.getPublisher();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean16 = magazine6.isOverdue();
        double double17 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=15372, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=15372, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        double double10 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("hi!");
        java.lang.String str13 = magazine6.getDetails();
        java.lang.String str14 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15373 + "'", int9 == 15373);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str13, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str14, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isPurchasable();
        java.lang.String str55 = magazine6.getPrice();
        java.lang.String str56 = magazine6.getLocation();
        boolean boolean57 = magazine6.isOverdue();
        java.time.LocalDate localDate58 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate58, 6477, "LibraryItem [itemId=4949, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getBorrowerEmail();
        boolean boolean13 = magazine6.isPurchasable();
        boolean boolean14 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("");
        java.lang.String str17 = magazine6.getPublisher();
        java.lang.String str18 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Magazine" + "'", str18, "Magazine");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2436, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
        double double7 = magazine6.calculateOverduePenalty();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3232, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=15055, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=979, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=11504, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=8531, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getPrice();
        boolean boolean68 = magazine6.isRented();
        magazine6.setIsPurchasable(false);
        java.lang.String str71 = magazine6.getAuthor();
        java.lang.String str72 = magazine6.getLocation();
        boolean boolean73 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getDetails();
        boolean boolean68 = magazine6.isPurchasable();
        java.lang.String str69 = magazine6.getAuthor();
        java.lang.String str70 = magazine6.getBorrowerEmail();
        java.lang.String str71 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str67, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "LibraryItem [itemId=15390, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str71, "LibraryItem [itemId=15390, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        items.Magazine magazine6 = new items.Magazine("", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        java.lang.String str7 = magazine6.getPublisher();
        java.lang.String str8 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: . Purchasable: false" + "'", str8, "Magazine: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: . Purchasable: false");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3425, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean71 = magazine6.isRented();
        java.lang.String str72 = magazine6.getLocation();
        boolean boolean73 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=7245, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5657, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=6334, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3301, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=7245, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=7245, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=798, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1677, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false", "LibraryItem [itemId=2182, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.returnItem();
        magazine6.setIsPurchasable(true);
        java.lang.String str10 = magazine6.getDetails();
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine: Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false. Location: LibraryItem [itemId=798, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true" + "'", str10, "Magazine: Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false. Location: LibraryItem [itemId=798, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getItemType();
        boolean boolean67 = magazine6.isRented();
        java.lang.String str68 = magazine6.getDetails();
        int int69 = magazine6.getItemId();
        magazine6.setLocation("LibraryItem [itemId=1044, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean72 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Magazine" + "'", str66, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str68, "Magazine: . Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 15407 + "'", int69 == 15407);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setLocation("LibraryItem [itemId=5786, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.Class<?> wildcardClass13 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15414 + "'", int9 == 15414);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        java.lang.String str12 = magazine6.getItemType();
        boolean boolean13 = magazine6.isOverdue();
        java.lang.String str14 = magazine6.getAuthor();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getTitle();
        java.lang.String str23 = magazine21.getTitle();
        java.lang.String str24 = magazine21.getItemType();
        java.lang.String str25 = magazine21.getAuthor();
        java.lang.String str26 = magazine21.getItemType();
        java.lang.String str27 = magazine21.getItemType();
        items.Magazine magazine34 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str35 = magazine34.getTitle();
        java.lang.String str36 = magazine34.getTitle();
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str51 = magazine50.getPublisher();
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str59 = magazine58.getPublisher();
        items.Magazine magazine66 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str67 = magazine66.getPublisher();
        double double68 = magazine66.calculateOverduePenalty();
        items.Magazine magazine75 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray76 = new items.LibraryItem[] { magazine50, magazine58, magazine66, magazine75 };
        java.util.ArrayList<items.LibraryItem> libraryItemList77 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList77, libraryItemArray76);
        boolean boolean79 = magazine43.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean80 = magazine34.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean81 = magazine21.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean82 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        java.lang.String str83 = magazine6.getDetails();
        java.lang.String str84 = magazine6.getBorrowerEmail();
        double double85 = magazine6.calculateOverduePenalty();
        boolean boolean86 = magazine6.isOverdue();
        java.lang.String str87 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Magazine" + "'", str24, "Magazine");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Magazine" + "'", str26, "Magazine");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Magazine" + "'", str27, "Magazine");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str83, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str87, "Magazine: . Location: . Purchasable: true");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("Magazine: . Location: . Purchasable: false");
        magazine6.setIsPurchasable(false);
        java.lang.String str15 = magazine6.getPrice();
        java.lang.String str16 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LibraryItem [itemId=15423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str16, "LibraryItem [itemId=15423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isPurchasable();
        magazine6.setIsPurchasable(true);
        java.lang.String str57 = magazine6.getDetails();
        int int58 = magazine6.getItemId();
        java.lang.String str59 = magazine6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str57, "Magazine: . Location: . Purchasable: true");
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 15424 + "'", int58 == 15424);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        magazine6.setBorrowerEmail("LibraryItem [itemId=3301, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean13 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15430 + "'", int8 == 15430);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        items.Magazine magazine6 = new items.Magazine("", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=453, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getTitle();
        java.lang.String str15 = magazine13.getTitle();
        magazine13.setIsPurchasable(true);
        java.lang.String str18 = magazine13.getBorrowerEmail();
        java.lang.String str19 = magazine13.getItemType();
        boolean boolean20 = magazine13.isOverdue();
        java.lang.String str21 = magazine13.getAuthor();
        items.Magazine magazine28 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str29 = magazine28.getTitle();
        java.lang.String str30 = magazine28.getTitle();
        java.lang.String str31 = magazine28.getItemType();
        java.lang.String str32 = magazine28.getAuthor();
        java.lang.String str33 = magazine28.getItemType();
        java.lang.String str34 = magazine28.getItemType();
        items.Magazine magazine41 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str42 = magazine41.getTitle();
        java.lang.String str43 = magazine41.getTitle();
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str58 = magazine57.getPublisher();
        items.Magazine magazine65 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str66 = magazine65.getPublisher();
        items.Magazine magazine73 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str74 = magazine73.getPublisher();
        double double75 = magazine73.calculateOverduePenalty();
        items.Magazine magazine82 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray83 = new items.LibraryItem[] { magazine57, magazine65, magazine73, magazine82 };
        java.util.ArrayList<items.LibraryItem> libraryItemList84 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList84, libraryItemArray83);
        boolean boolean86 = magazine50.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        boolean boolean87 = magazine41.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        boolean boolean88 = magazine28.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        boolean boolean89 = magazine13.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        boolean boolean90 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList84);
        java.lang.String str91 = magazine6.getAuthor();
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Magazine" + "'", str19, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Magazine" + "'", str31, "Magazine");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Magazine" + "'", str33, "Magazine");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Magazine" + "'", str34, "Magazine");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "LibraryItem [itemId=453, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str91, "LibraryItem [itemId=453, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getPrice();
        boolean boolean68 = magazine6.isRented();
        magazine6.setIsPurchasable(false);
        java.lang.String str71 = magazine6.getAuthor();
        java.lang.String str72 = magazine6.getItemType();
        magazine6.setLocation("LibraryItem [itemId=2096, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setIsPurchasable(false);
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Magazine" + "'", str72, "Magazine");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getPublisher();
        double double12 = magazine6.calculateOverduePenalty();
        magazine6.setLocation("Magazine: . Location: . Purchasable: false");
        java.lang.String str15 = magazine6.getItemType();
        java.lang.String str16 = magazine6.getDetails();
        magazine6.setLocation("LibraryItem [itemId=6721, itemType=Magazine, location=LibraryItem [itemId=1044, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean19 = magazine6.isOverdue();
        boolean boolean20 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15447 + "'", int8 == 15447);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine" + "'", str15, "Magazine");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Magazine: . Location: Magazine: . Location: . Purchasable: false. Purchasable: false" + "'", str16, "Magazine: . Location: Magazine: . Location: . Purchasable: false. Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getTitle();
        java.lang.String str16 = magazine14.getTitle();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        items.Magazine magazine46 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str47 = magazine46.getPublisher();
        double double48 = magazine46.calculateOverduePenalty();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray56 = new items.LibraryItem[] { magazine30, magazine38, magazine46, magazine55 };
        java.util.ArrayList<items.LibraryItem> libraryItemList57 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList57, libraryItemArray56);
        boolean boolean59 = magazine23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean60 = magazine14.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList57);
        boolean boolean61 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList57);
        java.lang.String str62 = magazine6.getItemType();
        boolean boolean63 = magazine6.isRented();
        java.lang.String str64 = magazine6.getPrice();
        magazine6.setBorrowerEmail("");
        int int67 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Magazine" + "'", str62, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 15448 + "'", int67 == 15448);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("Magazine: . Location: . Purchasable: false");
        magazine6.returnItem();
        java.lang.String str67 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getPublisher();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getPublisher();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getPublisher();
        double double31 = magazine29.calculateOverduePenalty();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { magazine13, magazine21, magazine29, magazine38 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        java.lang.String str43 = magazine6.getPublisher();
        double double44 = magazine6.calculateOverduePenalty();
        java.lang.String str45 = magazine6.getItemType();
        java.lang.String str46 = magazine6.getBorrowerEmail();
        java.lang.String str47 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Magazine" + "'", str45, "Magazine");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getPrice();
        double double11 = magazine6.calculateOverduePenalty();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getBorrowerEmail();
        items.Magazine magazine20 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str21 = magazine20.getTitle();
        java.lang.String str22 = magazine20.getTitle();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine36 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str37 = magazine36.getPublisher();
        items.Magazine magazine44 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str45 = magazine44.getPublisher();
        items.Magazine magazine52 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str53 = magazine52.getPublisher();
        double double54 = magazine52.calculateOverduePenalty();
        items.Magazine magazine61 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray62 = new items.LibraryItem[] { magazine36, magazine44, magazine52, magazine61 };
        java.util.ArrayList<items.LibraryItem> libraryItemList63 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList63, libraryItemArray62);
        boolean boolean65 = magazine29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList63);
        boolean boolean66 = magazine20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList63);
        boolean boolean67 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList63);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("");
        magazine6.setBorrowerEmail("hi!");
        boolean boolean15 = magazine6.isOverdue();
        int int16 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15474 + "'", int16 == 15474);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        java.lang.String str55 = magazine6.getTitle();
        java.lang.String str56 = magazine6.getItemType();
        java.lang.String str57 = magazine6.getTitle();
        boolean boolean58 = magazine6.isPurchasable();
        boolean boolean59 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Magazine" + "'", str56, "Magazine");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "Magazine: . Location: . Purchasable: false", "hi!");
        magazine6.setLocation("LibraryItem [itemId=1056, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean9 = magazine6.isOverdue();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        boolean boolean11 = magazine6.isRented();
        java.lang.String str12 = magazine6.getPublisher();
        java.lang.String str13 = magazine6.getItemType();
        double double14 = magazine6.calculateOverduePenalty();
        java.lang.Class<?> wildcardClass15 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15482 + "'", int9 == 15482);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine" + "'", str13, "Magazine");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=10024, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=13914, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=13085, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        double double55 = magazine6.calculateOverduePenalty();
        magazine6.returnItem();
        java.lang.String str57 = magazine6.getBorrowerEmail();
        java.lang.String str58 = magazine6.getPrice();
        java.lang.String str59 = magazine6.toString();
        java.lang.String str60 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3944, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setBorrowerEmail("LibraryItem [itemId=4050, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str65 = magazine6.getBorrowerEmail();
        boolean boolean66 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "LibraryItem [itemId=15484, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str59, "LibraryItem [itemId=15484, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "LibraryItem [itemId=4050, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str65, "LibraryItem [itemId=4050, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("Magazine: . Location: . Purchasable: false");
        java.lang.String str13 = magazine6.getBorrowerEmail();
        boolean boolean14 = magazine6.isOverdue();
        int int15 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str13, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15490 + "'", int15 == 15490);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=4253, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean9 = magazine6.isPurchasable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getDetails();
        java.lang.String str12 = magazine6.getItemType();
        java.lang.String str13 = magazine6.getPublisher();
        java.lang.String str14 = magazine6.getLocation();
        magazine6.setLocation("LibraryItem [itemId=7857, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean17 = magazine6.isRented();
        java.lang.String str18 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str11, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3425, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean71 = magazine6.isRented();
        java.lang.String str72 = magazine6.getItemType();
        java.lang.String str73 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Magazine" + "'", str72, "Magazine");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getAuthor();
        java.lang.String str13 = magazine6.toString();
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=15500, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=15500, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getPrice();
        boolean boolean10 = magazine6.isPurchasable();
        int int11 = magazine6.getItemId();
        int int12 = magazine6.getItemId();
        java.lang.String str13 = magazine6.getPrice();
        java.lang.String str14 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15501 + "'", int11 == 15501);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15501 + "'", int12 == 15501);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Magazine" + "'", str14, "Magazine");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=3930, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3590, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=4829, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.time.LocalDate localDate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate7, 7516, "LibraryItem [itemId=10199, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        boolean boolean9 = magazine6.isPurchasable();
        int int10 = magazine6.getItemId();
        java.lang.String str11 = magazine6.getDetails();
        items.Magazine magazine18 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str19 = magazine18.getTitle();
        java.lang.String str20 = magazine18.getTitle();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine34 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str35 = magazine34.getPublisher();
        items.Magazine magazine42 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str43 = magazine42.getPublisher();
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str51 = magazine50.getPublisher();
        double double52 = magazine50.calculateOverduePenalty();
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray60 = new items.LibraryItem[] { magazine34, magazine42, magazine50, magazine59 };
        java.util.ArrayList<items.LibraryItem> libraryItemList61 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList61, libraryItemArray60);
        boolean boolean63 = magazine27.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList61);
        boolean boolean64 = magazine18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList61);
        boolean boolean65 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList61);
        double double66 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3661, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean69 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15503 + "'", int8 == 15503);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15503 + "'", int10 == 15503);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str11, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isPurchasable();
        double double12 = magazine6.calculateOverduePenalty();
        java.lang.String str13 = magazine6.getDetails();
        java.lang.String str14 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str13, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", false, false, "LibraryItem [itemId=1951, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2085, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = magazine6.calculateOverduePenalty();
        java.lang.String str8 = magazine6.getDetails();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine: LibraryItem [itemId=1951, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str8, "Magazine: LibraryItem [itemId=1951, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2038, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2589, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=996, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        java.lang.String str7 = magazine6.getBorrowerEmail();
        boolean boolean8 = magazine6.isRented();
        magazine6.setBorrowerEmail("LibraryItem [itemId=8859, itemType=Magazine, location=Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        boolean boolean8 = magazine6.isRented();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isPurchasable();
        int int11 = magazine6.getItemId();
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15513 + "'", int9 == 15513);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15513 + "'", int11 == 15513);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=5814, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2204, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=3839, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1910, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getLocation();
        int int8 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=5814, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=5814, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15514 + "'", int8 == 15514);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2215, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2938, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("LibraryItem [itemId=4957, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1056, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=4023, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5738, itemType=Magazine, location=Magazine: Magazine. Location: Magazine. Purchasable: true, purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine15.returnItem();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        magazine23.setBorrowerEmail("Magazine");
        boolean boolean26 = magazine23.isRented();
        boolean boolean27 = magazine23.isRented();
        items.Magazine magazine34 = new items.Magazine("LibraryItem [itemId=3784, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4869, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=8443, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7327, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Magazine magazine41 = new items.Magazine("LibraryItem [itemId=2215, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2938, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str42 = magazine41.getTitle();
        java.lang.String str43 = magazine41.getTitle();
        java.lang.String str44 = magazine41.getAuthor();
        java.lang.String str45 = magazine41.getLocation();
        boolean boolean46 = magazine41.isRented();
        items.Magazine magazine53 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine60 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str61 = magazine60.getPublisher();
        items.Magazine magazine68 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str69 = magazine68.getPublisher();
        items.Magazine magazine76 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str77 = magazine76.getPublisher();
        double double78 = magazine76.calculateOverduePenalty();
        items.Magazine magazine85 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray86 = new items.LibraryItem[] { magazine60, magazine68, magazine76, magazine85 };
        java.util.ArrayList<items.LibraryItem> libraryItemList87 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList87, libraryItemArray86);
        boolean boolean89 = magazine53.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean90 = magazine41.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean91 = magazine34.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean92 = magazine23.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean93 = magazine15.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean94 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList87);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str42, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str43, "LibraryItem [itemId=616, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str44, "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "LibraryItem [itemId=2215, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str45, "LibraryItem [itemId=2215, itemType=Magazine, location=LibraryItem [itemId=1184, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        boolean boolean9 = magazine6.isPurchasable();
        magazine6.setIsPurchasable(true);
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getLocation();
        boolean boolean14 = magazine6.isRented();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getTitle();
        java.lang.String str23 = magazine21.getTitle();
        boolean boolean24 = magazine21.isOverdue();
        java.lang.String str25 = magazine21.getAuthor();
        boolean boolean26 = magazine21.isOverdue();
        java.lang.String str27 = magazine21.getBorrowerEmail();
        java.lang.String str28 = magazine21.toString();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getPublisher();
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str44 = magazine43.getTitle();
        java.lang.String str45 = magazine43.getTitle();
        items.Magazine magazine52 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str60 = magazine59.getPublisher();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str68 = magazine67.getPublisher();
        items.Magazine magazine75 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str76 = magazine75.getPublisher();
        double double77 = magazine75.calculateOverduePenalty();
        items.Magazine magazine84 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray85 = new items.LibraryItem[] { magazine59, magazine67, magazine75, magazine84 };
        java.util.ArrayList<items.LibraryItem> libraryItemList86 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList86, libraryItemArray85);
        boolean boolean88 = magazine52.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean89 = magazine43.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean90 = magazine35.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean91 = magazine21.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        boolean boolean92 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList86);
        java.lang.String str93 = magazine6.getBorrowerEmail();
        boolean boolean94 = magazine6.isOverdue();
        magazine6.setIsPurchasable(true);
        java.lang.String str97 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15525 + "'", int8 == 15525);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "LibraryItem [itemId=15526, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str28, "LibraryItem [itemId=15526, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        int int13 = magazine6.getItemId();
        java.lang.String str14 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15534 + "'", int13 == 15534);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str14, "Magazine: . Location: . Purchasable: true");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        double double55 = magazine6.calculateOverduePenalty();
        boolean boolean56 = magazine6.isPurchasable();
        java.lang.String str57 = magazine6.getBorrowerEmail();
        java.lang.String str58 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("Magazine: . Location: . Purchasable: false");
        magazine6.setIsPurchasable(false);
        java.lang.String str15 = magazine6.getPrice();
        java.lang.String str16 = magazine6.getAuthor();
        double double17 = magazine6.calculateOverduePenalty();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getAuthor();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        int int18 = magazine16.getItemId();
        boolean boolean19 = magazine16.isPurchasable();
        magazine16.returnItem();
        java.lang.String str21 = magazine16.getBorrowerEmail();
        items.Magazine magazine28 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str29 = magazine28.getPublisher();
        boolean boolean30 = magazine28.isRented();
        java.lang.String str31 = magazine28.getLocation();
        java.lang.String str32 = magazine28.getDetails();
        java.lang.String str33 = magazine28.getPrice();
        magazine28.setLocation("LibraryItem [itemId=5724, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine28.returnItem();
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str44 = magazine43.getTitle();
        java.lang.String str45 = magazine43.getTitle();
        java.lang.String str46 = magazine43.toString();
        java.lang.String str47 = magazine43.getLocation();
        java.lang.String str48 = magazine43.getPublisher();
        java.lang.String str49 = magazine43.getPrice();
        boolean boolean50 = magazine43.isRented();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine64 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str65 = magazine64.getPublisher();
        items.Magazine magazine72 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str73 = magazine72.getPublisher();
        items.Magazine magazine80 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str81 = magazine80.getPublisher();
        double double82 = magazine80.calculateOverduePenalty();
        items.Magazine magazine89 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray90 = new items.LibraryItem[] { magazine64, magazine72, magazine80, magazine89 };
        java.util.ArrayList<items.LibraryItem> libraryItemList91 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList91, libraryItemArray90);
        boolean boolean93 = magazine57.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList91);
        boolean boolean94 = magazine43.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList91);
        boolean boolean95 = magazine28.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList91);
        boolean boolean96 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList91);
        boolean boolean97 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList91);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15543 + "'", int18 == 15543);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str32, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "LibraryItem [itemId=15545, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str46, "LibraryItem [itemId=15545, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        double double10 = magazine6.calculateOverduePenalty();
        boolean boolean11 = magazine6.isRented();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        magazine6.setIsPurchasable(false);
        magazine6.setBorrowerEmail("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str69 = magazine6.getBorrowerEmail();
        boolean boolean70 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str69, "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getBorrowerEmail();
        boolean boolean13 = magazine6.isPurchasable();
        boolean boolean14 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("");
        magazine6.setLocation("LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str19 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Magazine" + "'", str19, "Magazine");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        magazine6.setBorrowerEmail("LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str12 = magazine6.getPublisher();
        java.lang.String str13 = magazine6.getDetails();
        boolean boolean14 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str13, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=9489, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=4949, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=13431, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7110, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine", true, false, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPublisher();
        java.lang.String str8 = magazine6.getPrice();
        java.lang.String str9 = magazine6.toString();
        magazine6.setLocation("LibraryItem [itemId=1928, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int12 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15562, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15562, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15562 + "'", int12 == 15562);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        java.lang.String str55 = magazine6.getLocation();
        java.lang.String str56 = magazine6.getPrice();
        double double57 = magazine6.calculateOverduePenalty();
        java.lang.String str58 = magazine6.getPrice();
        java.lang.String str59 = magazine6.toString();
        java.lang.String str60 = magazine6.getItemType();
        java.lang.String str61 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "LibraryItem [itemId=15563, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str59, "LibraryItem [itemId=15563, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Magazine" + "'", str60, "Magazine");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=15288, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=8047, itemType=Magazine, location=LibraryItem [itemId=2685, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=2305, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=13059, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=12743, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getPublisher();
        double double12 = magazine6.calculateOverduePenalty();
        magazine6.setLocation("Magazine: . Location: . Purchasable: false");
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getTitle();
        java.lang.String str23 = magazine21.getTitle();
        java.lang.String str24 = magazine21.toString();
        magazine21.setIsPurchasable(false);
        items.Magazine magazine33 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str34 = magazine33.getPublisher();
        double double35 = magazine33.calculateOverduePenalty();
        int int36 = magazine33.getItemId();
        boolean boolean37 = magazine33.isRented();
        double double38 = magazine33.calculateOverduePenalty();
        items.Magazine magazine45 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine52 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str53 = magazine52.getPublisher();
        items.Magazine magazine60 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str61 = magazine60.getPublisher();
        items.Magazine magazine68 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str69 = magazine68.getPublisher();
        double double70 = magazine68.calculateOverduePenalty();
        items.Magazine magazine77 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray78 = new items.LibraryItem[] { magazine52, magazine60, magazine68, magazine77 };
        java.util.ArrayList<items.LibraryItem> libraryItemList79 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList79, libraryItemArray78);
        boolean boolean81 = magazine45.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean82 = magazine33.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean83 = magazine21.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList79);
        boolean boolean84 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList79);
        java.lang.String str85 = magazine6.getTitle();
        double double86 = magazine6.calculateOverduePenalty();
        int int87 = magazine6.getItemId();
        boolean boolean88 = magazine6.isOverdue();
        magazine6.setBorrowerEmail("LibraryItem [itemId=11368, itemType=Magazine, location=, purchasable=false, title=LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15570 + "'", int8 == 15570);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LibraryItem [itemId=15571, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str24, "LibraryItem [itemId=15571, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15572 + "'", int36 == 15572);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int87 + "' != '" + 15570 + "'", int87 == 15570);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        double double55 = magazine6.calculateOverduePenalty();
        boolean boolean56 = magazine6.isPurchasable();
        java.lang.String str57 = magazine6.getItemType();
        java.lang.String str58 = magazine6.getLocation();
        java.lang.String str59 = magazine6.getPrice();
        java.lang.String str60 = magazine6.getPublisher();
        java.lang.String str61 = magazine6.getPrice();
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Magazine" + "'", str57, "Magazine");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("");
        magazine6.setBorrowerEmail("hi!");
        magazine6.setLocation("");
        magazine6.returnItem();
        double double18 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("");
        magazine6.setBorrowerEmail("hi!");
        java.lang.String str15 = magazine6.getPublisher();
        boolean boolean16 = magazine6.isOverdue();
        java.lang.String str17 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LibraryItem [itemId=15585, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str17, "LibraryItem [itemId=15585, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        java.lang.String str12 = magazine6.getItemType();
        boolean boolean13 = magazine6.isOverdue();
        java.lang.String str14 = magazine6.getBorrowerEmail();
        java.lang.String str15 = magazine6.getItemType();
        int int16 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine" + "'", str15, "Magazine");
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15586 + "'", int16 == 15586);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getItemType();
        boolean boolean13 = magazine6.isPurchasable();
        java.lang.String str14 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine", true, false, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getTitle();
        java.lang.String str12 = magazine6.getTitle();
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15588 + "'", int9 == 15588);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=9056, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=996, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true", false, true, "LibraryItem [itemId=15500, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=12853, itemType=Magazine, location=LibraryItem [itemId=5179, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=4253, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isPurchasable();
        magazine6.setIsPurchasable(true);
        java.time.LocalDate localDate57 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate57, 14966, "LibraryItem [itemId=14871, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getPrice();
        java.lang.String str68 = magazine6.getItemType();
        magazine6.setLocation("LibraryItem [itemId=979, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setBorrowerEmail("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Magazine" + "'", str68, "Magazine");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getDetails();
        magazine6.setLocation("");
        magazine6.setBorrowerEmail("LibraryItem [itemId=3599, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=10601, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str12, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        double double10 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("hi!");
        boolean boolean13 = magazine6.isPurchasable();
        java.lang.String str14 = magazine6.getTitle();
        java.lang.String str15 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15604 + "'", int9 == 15604);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        double double12 = magazine6.calculateOverduePenalty();
        boolean boolean13 = magazine6.isPurchasable();
        items.Magazine magazine20 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str21 = magazine20.getTitle();
        java.lang.String str22 = magazine20.getTitle();
        boolean boolean23 = magazine20.isOverdue();
        java.lang.String str24 = magazine20.getAuthor();
        boolean boolean25 = magazine20.isOverdue();
        java.lang.String str26 = magazine20.getBorrowerEmail();
        java.lang.String str27 = magazine20.toString();
        items.Magazine magazine34 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str35 = magazine34.getPublisher();
        items.Magazine magazine42 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str43 = magazine42.getTitle();
        java.lang.String str44 = magazine42.getTitle();
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str59 = magazine58.getPublisher();
        items.Magazine magazine66 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str67 = magazine66.getPublisher();
        items.Magazine magazine74 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str75 = magazine74.getPublisher();
        double double76 = magazine74.calculateOverduePenalty();
        items.Magazine magazine83 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray84 = new items.LibraryItem[] { magazine58, magazine66, magazine74, magazine83 };
        java.util.ArrayList<items.LibraryItem> libraryItemList85 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList85, libraryItemArray84);
        boolean boolean87 = magazine51.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean88 = magazine42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean89 = magazine34.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean90 = magazine20.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean91 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        java.lang.String str92 = magazine6.getItemType();
        java.lang.String str93 = magazine6.getTitle();
        int int94 = magazine6.getItemId();
        java.lang.String str95 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "LibraryItem [itemId=15606, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str27, "LibraryItem [itemId=15606, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Magazine" + "'", str92, "Magazine");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
// flaky:         org.junit.Assert.assertTrue("'" + int94 + "' != '" + 15605 + "'", int94 == 15605);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=3089, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1493, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1928, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
        boolean boolean7 = magazine6.isPurchasable();
        java.lang.String str8 = magazine6.getPrice();
        java.lang.String str9 = magazine6.getTitle();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false" + "'", str8, "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=1928, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=1928, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getPrice();
        boolean boolean68 = magazine6.isRented();
        double double69 = magazine6.calculateOverduePenalty();
        double double70 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        double double11 = magazine6.calculateOverduePenalty();
        java.lang.String str12 = magazine6.getAuthor();
        boolean boolean13 = magazine6.isOverdue();
        boolean boolean14 = magazine6.isPurchasable();
        magazine6.returnItem();
        double double16 = magazine6.calculateOverduePenalty();
        java.lang.String str17 = magazine6.getBorrowerEmail();
        java.lang.String str18 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15622 + "'", int9 == 15622);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Magazine" + "'", str18, "Magazine");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        double double10 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("hi!");
        boolean boolean13 = magazine6.isPurchasable();
        boolean boolean14 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15624 + "'", int9 == 15624);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        items.Magazine magazine6 = new items.Magazine("Magazine: LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", "LibraryItem [itemId=4305, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=15606, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=12181, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=918, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1547, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=854, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1103, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPublisher();
        java.lang.String str8 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=1103, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=1103, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine" + "'", str8, "Magazine");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean7 = magazine6.isRented();
        java.lang.String str8 = magazine6.getItemType();
        java.lang.String str9 = magazine6.toString();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getBorrowerEmail();
        int int12 = magazine6.getItemId();
        boolean boolean13 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3067, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double16 = magazine6.calculateOverduePenalty();
        boolean boolean17 = magazine6.isOverdue();
        java.lang.String str18 = magazine6.getBorrowerEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine" + "'", str8, "Magazine");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15627, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15627, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15627 + "'", int12 == 15627);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LibraryItem [itemId=3067, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str18, "LibraryItem [itemId=3067, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1044, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1986, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=981, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPublisher();
        magazine6.setLocation("LibraryItem [itemId=3784, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str10 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=981, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=981, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine" + "'", str10, "Magazine");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        double double11 = magazine6.calculateOverduePenalty();
        java.lang.String str12 = magazine6.getAuthor();
        java.lang.String str13 = magazine6.getPrice();
        double double14 = magazine6.calculateOverduePenalty();
        java.lang.String str15 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15629 + "'", int9 == 15629);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getBorrowerEmail();
        boolean boolean13 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getItemType();
        magazine6.setIsPurchasable(true);
        boolean boolean69 = magazine6.isRented();
        java.lang.String str70 = magazine6.toString();
        java.lang.String str71 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Magazine" + "'", str66, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "LibraryItem [itemId=15631, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str70, "LibraryItem [itemId=15631, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setLocation("Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        java.lang.String str13 = magazine6.getDetails();
        java.lang.String str14 = magazine6.getItemType();
        magazine6.returnItem();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15638 + "'", int9 == 15638);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false" + "'", str13, "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Magazine" + "'", str14, "Magazine");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("");
        boolean boolean11 = magazine6.isRented();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1677, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Magazine magazine20 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str21 = magazine20.getPublisher();
        boolean boolean22 = magazine20.isRented();
        int int23 = magazine20.getItemId();
        java.lang.String str24 = magazine20.getTitle();
        items.Magazine magazine31 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str32 = magazine31.getPublisher();
        double double33 = magazine31.calculateOverduePenalty();
        int int34 = magazine31.getItemId();
        boolean boolean35 = magazine31.isRented();
        double double36 = magazine31.calculateOverduePenalty();
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str51 = magazine50.getPublisher();
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str59 = magazine58.getPublisher();
        items.Magazine magazine66 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str67 = magazine66.getPublisher();
        double double68 = magazine66.calculateOverduePenalty();
        items.Magazine magazine75 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray76 = new items.LibraryItem[] { magazine50, magazine58, magazine66, magazine75 };
        java.util.ArrayList<items.LibraryItem> libraryItemList77 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList77, libraryItemArray76);
        boolean boolean79 = magazine43.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean80 = magazine31.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean81 = magazine20.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList77);
        boolean boolean82 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList77);
        magazine6.setIsPurchasable(false);
        magazine6.setBorrowerEmail("LibraryItem [itemId=15631, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15640 + "'", int23 == 15640);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15641 + "'", int34 == 15641);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getDetails();
        java.lang.String str68 = magazine6.toString();
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str67, "Magazine: . Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "LibraryItem [itemId=15647, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str68, "LibraryItem [itemId=15647, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2264, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2436, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3416, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=2264, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=2264, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        java.lang.String str7 = magazine6.toString();
        magazine6.setLocation("");
        java.lang.String str10 = magazine6.toString();
        java.lang.String str11 = magazine6.getTitle();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=15655, itemType=Magazine, location=LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=15655, itemType=Magazine, location=LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=15655, itemType=Magazine, location=, purchasable=false, title=LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=15655, itemType=Magazine, location=, purchasable=false, title=LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        magazine6.setIsPurchasable(false);
        java.lang.String str67 = magazine6.getDetails();
        boolean boolean68 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str67, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getPublisher();
        int int12 = magazine6.getItemId();
        magazine6.setLocation("LibraryItem [itemId=12180, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15663 + "'", int12 == 15663);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("");
        java.time.LocalDate localDate11 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate11, (int) '#', "LibraryItem [itemId=10331, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        java.lang.String str55 = magazine6.getLocation();
        java.lang.String str56 = magazine6.getPrice();
        java.lang.String str57 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        java.lang.String str54 = magazine6.getBorrowerEmail();
        double double55 = magazine6.calculateOverduePenalty();
        java.lang.String str56 = magazine6.getBorrowerEmail();
        java.lang.String str57 = magazine6.getAuthor();
        java.lang.String str58 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        boolean boolean11 = magazine6.isRented();
        java.lang.String str12 = magazine6.getPublisher();
        magazine6.setBorrowerEmail("LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean15 = magazine6.isOverdue();
        magazine6.returnItem();
        java.lang.String str17 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15677 + "'", int9 == 15677);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Magazine" + "'", str17, "Magazine");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        items.Magazine magazine6 = new items.Magazine("", "", true, true, "LibraryItem [itemId=11541, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1677, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        double double10 = magazine6.calculateOverduePenalty();
        java.lang.String str11 = magazine6.getPublisher();
        java.lang.String str12 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15679 + "'", int9 == 15679);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str12, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.toString();
        java.lang.String str13 = magazine6.getPublisher();
        items.Magazine magazine20 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str21 = magazine20.getTitle();
        int int22 = magazine20.getItemId();
        magazine20.setBorrowerEmail("");
        java.lang.String str25 = magazine20.getPublisher();
        double double26 = magazine20.calculateOverduePenalty();
        magazine20.setLocation("Magazine: . Location: . Purchasable: false");
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getTitle();
        java.lang.String str37 = magazine35.getTitle();
        java.lang.String str38 = magazine35.toString();
        magazine35.setIsPurchasable(false);
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str48 = magazine47.getPublisher();
        double double49 = magazine47.calculateOverduePenalty();
        int int50 = magazine47.getItemId();
        boolean boolean51 = magazine47.isRented();
        double double52 = magazine47.calculateOverduePenalty();
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine66 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str67 = magazine66.getPublisher();
        items.Magazine magazine74 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str75 = magazine74.getPublisher();
        items.Magazine magazine82 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str83 = magazine82.getPublisher();
        double double84 = magazine82.calculateOverduePenalty();
        items.Magazine magazine91 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray92 = new items.LibraryItem[] { magazine66, magazine74, magazine82, magazine91 };
        java.util.ArrayList<items.LibraryItem> libraryItemList93 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList93, libraryItemArray92);
        boolean boolean95 = magazine59.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList93);
        boolean boolean96 = magazine47.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList93);
        boolean boolean97 = magazine35.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList93);
        boolean boolean98 = magazine20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList93);
        boolean boolean99 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList93);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=15680, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=15680, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15681 + "'", int22 == 15681);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "LibraryItem [itemId=15682, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str38, "LibraryItem [itemId=15682, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 15683 + "'", int50 == 15683);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        boolean boolean11 = magazine6.isRented();
        boolean boolean12 = magazine6.isPurchasable();
        magazine6.setBorrowerEmail("LibraryItem [itemId=3944, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str15 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15689 + "'", int9 == 15689);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        boolean boolean8 = magazine6.isRented();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isPurchasable();
        java.lang.String str11 = magazine6.getItemType();
        java.lang.String str12 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15690 + "'", int9 == 15690);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Magazine" + "'", str11, "Magazine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        int int12 = magazine6.getItemId();
        double double13 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("LibraryItem [itemId=10330, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15691 + "'", int12 == 15691);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        boolean boolean11 = magazine6.isOverdue();
        boolean boolean12 = magazine6.isOverdue();
        int int13 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15693 + "'", int9 == 15693);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15693 + "'", int13 == 15693);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.toString();
        java.lang.String str13 = magazine6.getPublisher();
        java.lang.String str14 = magazine6.getBorrowerEmail();
        magazine6.setBorrowerEmail("LibraryItem [itemId=2204, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=15694, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=15694, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=3590, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2564, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=Magazine: . Location: . Purchasable: true, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=10893, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=9489, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        double double65 = magazine6.calculateOverduePenalty();
        java.lang.String str66 = magazine6.toString();
        java.lang.String str67 = magazine6.getAuthor();
        boolean boolean68 = magazine6.isPurchasable();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "LibraryItem [itemId=15696, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str66, "LibraryItem [itemId=15696, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getPublisher();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getPublisher();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getPublisher();
        double double31 = magazine29.calculateOverduePenalty();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { magazine13, magazine21, magazine29, magazine38 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        java.lang.String str43 = magazine6.getPublisher();
        double double44 = magazine6.calculateOverduePenalty();
        java.time.LocalDate localDate45 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate45, 14698, "LibraryItem [itemId=13318, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("");
        int int71 = magazine6.getItemId();
        magazine6.returnItem();
        boolean boolean73 = magazine6.isOverdue();
        magazine6.returnItem();
        java.lang.String str75 = magazine6.getAuthor();
        java.lang.String str76 = magazine6.getPublisher();
        magazine6.setIsPurchasable(false);
        java.lang.Class<?> wildcardClass79 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 15708 + "'", int71 == 15708);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        java.lang.String str12 = magazine6.getItemType();
        boolean boolean13 = magazine6.isOverdue();
        boolean boolean14 = magazine6.isRented();
        boolean boolean15 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1056, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6442, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=5138, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3301, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Magazine" + "'", str7, "Magazine");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        java.lang.String str55 = magazine6.getLocation();
        java.lang.String str56 = magazine6.getPrice();
        boolean boolean57 = magazine6.isPurchasable();
        java.lang.String str58 = magazine6.toString();
        java.time.LocalDate localDate59 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate59, 1230, "LibraryItem [itemId=8810, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "LibraryItem [itemId=15717, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str58, "LibraryItem [itemId=15717, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        boolean boolean55 = magazine6.isOverdue();
        double double56 = magazine6.calculateOverduePenalty();
        java.lang.String str57 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        items.Magazine magazine6 = new items.Magazine("Magazine", "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "Magazine", "Magazine");
        java.lang.String str7 = magazine6.getDetails();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getTitle();
        int int16 = magazine14.getItemId();
        java.lang.String str17 = magazine14.getPrice();
        items.Magazine magazine24 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str25 = magazine24.getTitle();
        int int26 = magazine24.getItemId();
        magazine24.returnItem();
        items.Magazine magazine34 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str35 = magazine34.getTitle();
        java.lang.String str36 = magazine34.getTitle();
        boolean boolean37 = magazine34.isOverdue();
        items.Magazine magazine44 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str45 = magazine44.getTitle();
        java.lang.String str46 = magazine44.getTitle();
        items.Magazine magazine53 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine60 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str61 = magazine60.getPublisher();
        items.Magazine magazine68 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str69 = magazine68.getPublisher();
        items.Magazine magazine76 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str77 = magazine76.getPublisher();
        double double78 = magazine76.calculateOverduePenalty();
        items.Magazine magazine85 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray86 = new items.LibraryItem[] { magazine60, magazine68, magazine76, magazine85 };
        java.util.ArrayList<items.LibraryItem> libraryItemList87 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList87, libraryItemArray86);
        boolean boolean89 = magazine53.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean90 = magazine44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean91 = magazine34.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean92 = magazine24.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean93 = magazine14.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        boolean boolean94 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList87);
        java.lang.String str95 = magazine6.getDetails();
        double double96 = magazine6.calculateOverduePenalty();
        magazine6.setLocation("LibraryItem [itemId=7560, itemType=Magazine, location=Magazine, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Magazine: Magazine. Location: Magazine. Purchasable: true" + "'", str7, "Magazine: Magazine. Location: Magazine. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15730 + "'", int16 == 15730);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15731 + "'", int26 == 15731);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Magazine: Magazine. Location: Magazine. Purchasable: true" + "'", str95, "Magazine: Magazine. Location: Magazine. Purchasable: true");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("Magazine: . Location: . Purchasable: false");
        magazine6.setLocation("hi!");
        magazine6.setLocation("LibraryItem [itemId=1587, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str17 = magazine6.getLocation();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LibraryItem [itemId=1587, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str17, "LibraryItem [itemId=1587, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getAuthor();
        items.Magazine magazine14 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str15 = magazine14.getPublisher();
        double double16 = magazine14.calculateOverduePenalty();
        int int17 = magazine14.getItemId();
        boolean boolean18 = magazine14.isRented();
        double double19 = magazine14.calculateOverduePenalty();
        items.Magazine magazine26 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine33 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str34 = magazine33.getPublisher();
        items.Magazine magazine41 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str42 = magazine41.getPublisher();
        items.Magazine magazine49 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str50 = magazine49.getPublisher();
        double double51 = magazine49.calculateOverduePenalty();
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray59 = new items.LibraryItem[] { magazine33, magazine41, magazine49, magazine58 };
        java.util.ArrayList<items.LibraryItem> libraryItemList60 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList60, libraryItemArray59);
        boolean boolean62 = magazine26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList60);
        boolean boolean63 = magazine14.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList60);
        boolean boolean64 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList60);
        boolean boolean65 = magazine6.isPurchasable();
        int int66 = magazine6.getItemId();
        magazine6.setLocation("Magazine: LibraryItem [itemId=996, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15741 + "'", int17 == 15741);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int66 + "' != '" + 15740 + "'", int66 == 15740);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getPrice();
        java.lang.String str14 = magazine6.getItemType();
        java.lang.String str15 = magazine6.getDetails();
        double double16 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Magazine" + "'", str14, "Magazine");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str15, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getTitle();
        magazine6.setBorrowerEmail("Magazine: . Location: LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        java.lang.String str69 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getPrice();
        boolean boolean68 = magazine6.isRented();
        magazine6.setIsPurchasable(false);
        java.lang.String str71 = magazine6.getAuthor();
        double double72 = magazine6.calculateOverduePenalty();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        magazine6.setBorrowerEmail("Magazine");
        java.lang.String str9 = magazine6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=12250, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2685, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "Magazine: . Location: LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", "LibraryItem [itemId=9763, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        java.lang.String str64 = magazine6.getDetails();
        boolean boolean65 = magazine6.isRented();
        boolean boolean66 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str64, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("Magazine: Magazine. Location: Magazine. Purchasable: true");
        java.lang.String str9 = magazine6.getPublisher();
        magazine6.returnItem();
        boolean boolean11 = magazine6.isPurchasable();
        magazine6.setLocation("LibraryItem [itemId=3208, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        double double10 = magazine6.calculateOverduePenalty();
        java.lang.String str11 = magazine6.getPublisher();
        java.lang.String str12 = magazine6.getPublisher();
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15772 + "'", int9 == 15772);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.toString();
        java.lang.String str9 = magazine6.getPublisher();
        int int10 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=15773, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=15773, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15773 + "'", int10 == 15773);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        items.Magazine magazine6 = new items.Magazine("Magazine: LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", "LibraryItem [itemId=7878, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=6092, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=15337, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=8444, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=7305, itemType=Magazine, location=LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=13197, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=12778, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        boolean boolean14 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getPublisher();
        double double10 = magazine6.calculateOverduePenalty();
        magazine6.setIsPurchasable(true);
        int int13 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15777 + "'", int13 == 15777);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        boolean boolean55 = magazine6.isRented();
        java.lang.String str56 = magazine6.getDetails();
        java.lang.String str57 = magazine6.getPublisher();
        boolean boolean58 = magazine6.isPurchasable();
        java.lang.String str59 = magazine6.getDetails();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str56, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str59, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean7 = magazine6.isRented();
        java.lang.String str8 = magazine6.getItemType();
        java.lang.String str9 = magazine6.toString();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getBorrowerEmail();
        int int12 = magazine6.getItemId();
        boolean boolean13 = magazine6.isPurchasable();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine" + "'", str8, "Magazine");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15784, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15784, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15784 + "'", int12 == 15784);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setLocation("");
        java.lang.String str16 = magazine6.getItemType();
        double double17 = magazine6.calculateOverduePenalty();
        java.lang.String str18 = magazine6.getAuthor();
        java.lang.Class<?> wildcardClass19 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Magazine" + "'", str16, "Magazine");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPrice();
        java.lang.String str8 = magazine6.getBorrowerEmail();
        java.lang.String str9 = magazine6.getPublisher();
        java.lang.String str10 = magazine6.getTitle();
        boolean boolean11 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getPublisher();
        java.lang.String str10 = magazine6.getDetails();
        java.lang.String str11 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setIsPurchasable(true);
        double double15 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str10, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=5557, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5217, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=13640, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2697, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        java.lang.String str7 = magazine6.getLocation();
        java.lang.String str8 = magazine6.getItemType();
        java.lang.String str9 = magazine6.toString();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine" + "'", str8, "Magazine");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15789, itemType=Magazine, location=LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15789, itemType=Magazine, location=LibraryItem [itemId=1041, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean64 = magazine6.isPurchasable();
        magazine6.setLocation("Magazine: . Location: . Purchasable: false");
        int int67 = magazine6.getItemId();
        java.lang.String str68 = magazine6.toString();
        int int69 = magazine6.getItemId();
        java.lang.String str70 = magazine6.getDetails();
        java.lang.String str71 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 15790 + "'", int67 == 15790);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "LibraryItem [itemId=15790, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str68, "LibraryItem [itemId=15790, itemType=Magazine, location=Magazine: . Location: . Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int69 + "' != '" + 15790 + "'", int69 == 15790);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Magazine: . Location: Magazine: . Location: . Purchasable: false. Purchasable: false" + "'", str70, "Magazine: . Location: Magazine: . Location: . Purchasable: false. Purchasable: false");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getPrice();
        java.lang.String str14 = magazine6.getAuthor();
        java.lang.String str15 = magazine6.getPublisher();
        java.lang.String str16 = magazine6.getAuthor();
        java.lang.String str17 = magazine6.getBorrowerEmail();
        java.lang.String str18 = magazine6.getPrice();
        java.lang.String str19 = magazine6.getItemType();
        items.Magazine magazine26 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str27 = magazine26.getTitle();
        int int28 = magazine26.getItemId();
        boolean boolean29 = magazine26.isPurchasable();
        int int30 = magazine26.getItemId();
        java.lang.String str31 = magazine26.getDetails();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getTitle();
        java.lang.String str40 = magazine38.getTitle();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine54 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str55 = magazine54.getPublisher();
        items.Magazine magazine62 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str63 = magazine62.getPublisher();
        items.Magazine magazine70 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str71 = magazine70.getPublisher();
        double double72 = magazine70.calculateOverduePenalty();
        items.Magazine magazine79 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray80 = new items.LibraryItem[] { magazine54, magazine62, magazine70, magazine79 };
        java.util.ArrayList<items.LibraryItem> libraryItemList81 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList81, libraryItemArray80);
        boolean boolean83 = magazine47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean84 = magazine38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean85 = magazine26.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean86 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList81);
        double double87 = magazine6.calculateOverduePenalty();
        magazine6.setLocation("LibraryItem [itemId=14879, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Magazine" + "'", str19, "Magazine");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15798 + "'", int28 == 15798);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15798 + "'", int30 == 15798);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str31, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        boolean boolean11 = magazine6.isRented();
        java.lang.String str12 = magazine6.getPublisher();
        magazine6.setLocation("LibraryItem [itemId=15054, itemType=Magazine, location=Magazine: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15805 + "'", int9 == 15805);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        java.lang.String str9 = magazine6.getPrice();
        boolean boolean10 = magazine6.isRented();
        java.lang.String str11 = magazine6.toString();
        magazine6.setBorrowerEmail("LibraryItem [itemId=606, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean14 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LibraryItem [itemId=15806, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str11, "LibraryItem [itemId=15806, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        magazine6.returnItem();
        java.lang.String str13 = magazine6.getPrice();
        java.lang.String str14 = magazine6.getItemType();
        java.lang.String str15 = magazine6.getDetails();
        java.lang.String str16 = magazine6.getLocation();
        boolean boolean17 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Magazine" + "'", str14, "Magazine");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str15, "Magazine: . Location: . Purchasable: true");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        magazine6.setIsPurchasable(false);
        boolean boolean12 = magazine6.isOverdue();
        java.lang.String str13 = magazine6.getTitle();
        items.Magazine magazine20 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str21 = magazine20.getPublisher();
        java.lang.String str22 = magazine20.getBorrowerEmail();
        java.lang.String str23 = magazine20.getPrice();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getTitle();
        java.lang.String str40 = magazine38.getTitle();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine54 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str55 = magazine54.getPublisher();
        items.Magazine magazine62 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str63 = magazine62.getPublisher();
        items.Magazine magazine70 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str71 = magazine70.getPublisher();
        double double72 = magazine70.calculateOverduePenalty();
        items.Magazine magazine79 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray80 = new items.LibraryItem[] { magazine54, magazine62, magazine70, magazine79 };
        java.util.ArrayList<items.LibraryItem> libraryItemList81 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList81, libraryItemArray80);
        boolean boolean83 = magazine47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean84 = magazine38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean85 = magazine30.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean86 = magazine20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean87 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        java.lang.String str88 = magazine6.getLocation();
        int int89 = magazine6.getItemId();
        java.time.LocalDate localDate90 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate90, 7406, "LibraryItem [itemId=11368, itemType=Magazine, location=, purchasable=false, title=LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
// flaky:         org.junit.Assert.assertTrue("'" + int89 + "' != '" + 15808 + "'", int89 == 15808);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getTitle();
        java.lang.String str15 = magazine13.getTitle();
        magazine13.setIsPurchasable(true);
        boolean boolean18 = magazine13.isOverdue();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str26 = magazine25.getPublisher();
        boolean boolean27 = magazine25.isRented();
        items.Magazine magazine34 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str35 = magazine34.getPublisher();
        items.Magazine magazine42 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str43 = magazine42.getTitle();
        java.lang.String str44 = magazine42.getTitle();
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine58 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str59 = magazine58.getPublisher();
        items.Magazine magazine66 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str67 = magazine66.getPublisher();
        items.Magazine magazine74 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str75 = magazine74.getPublisher();
        double double76 = magazine74.calculateOverduePenalty();
        items.Magazine magazine83 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray84 = new items.LibraryItem[] { magazine58, magazine66, magazine74, magazine83 };
        java.util.ArrayList<items.LibraryItem> libraryItemList85 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList85, libraryItemArray84);
        boolean boolean87 = magazine51.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean88 = magazine42.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean89 = magazine34.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean90 = magazine25.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean91 = magazine13.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        boolean boolean92 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList85);
        java.lang.String str93 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "LibraryItem [itemId=15817, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str93, "LibraryItem [itemId=15817, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getItemType();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("Magazine: . Location: . Purchasable: false");
        magazine6.setLocation("hi!");
        int int15 = magazine6.getItemId();
        java.lang.String str16 = magazine6.toString();
        magazine6.setLocation("LibraryItem [itemId=12081, itemType=Magazine, location=Magazine, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine" + "'", str9, "Magazine");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15827 + "'", int15 == 15827);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "LibraryItem [itemId=15827, itemType=Magazine, location=hi!, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str16, "LibraryItem [itemId=15827, itemType=Magazine, location=hi!, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2142, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "", "LibraryItem [itemId=1587, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getAuthor();
        java.lang.String str8 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=1587, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=1587, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getTitle();
        double double10 = magazine6.calculateOverduePenalty();
        boolean boolean11 = magazine6.isRented();
        java.lang.String str12 = magazine6.getLocation();
        java.lang.String str13 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        java.lang.String str67 = magazine6.getTitle();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("");
        java.lang.String str71 = magazine6.getTitle();
        double double72 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, true, "Magazine: . Location: . Purchasable: true", "LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.toString();
        magazine6.setIsPurchasable(false);
        java.lang.String str10 = magazine6.getItemType();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=15837, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=Magazine: . Location: . Purchasable: true, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=15837, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=Magazine: . Location: . Purchasable: true, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine" + "'", str10, "Magazine");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=12139, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2141, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "Magazine: LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Magazine: Magazine. Location: Magazine. Purchasable: true. Purchasable: false", "LibraryItem [itemId=12466, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getPublisher();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getPublisher();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getPublisher();
        double double31 = magazine29.calculateOverduePenalty();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { magazine13, magazine21, magazine29, magazine38 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        java.lang.String str43 = magazine6.getPublisher();
        double double44 = magazine6.calculateOverduePenalty();
        java.lang.String str45 = magazine6.getItemType();
        int int46 = magazine6.getItemId();
        magazine6.setLocation("LibraryItem [itemId=4758, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=4251, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Magazine" + "'", str45, "Magazine");
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15839 + "'", int46 == 15839);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getPublisher();
        java.lang.String str10 = magazine6.getDetails();
        java.lang.String str11 = magazine6.getTitle();
        magazine6.returnItem();
        double double13 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("LibraryItem [itemId=7167, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean16 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str10, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toString();
        magazine6.setIsPurchasable(false);
        items.Magazine magazine18 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str19 = magazine18.getPublisher();
        double double20 = magazine18.calculateOverduePenalty();
        int int21 = magazine18.getItemId();
        boolean boolean22 = magazine18.isRented();
        double double23 = magazine18.calculateOverduePenalty();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine37 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str38 = magazine37.getPublisher();
        items.Magazine magazine45 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str46 = magazine45.getPublisher();
        items.Magazine magazine53 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str54 = magazine53.getPublisher();
        double double55 = magazine53.calculateOverduePenalty();
        items.Magazine magazine62 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray63 = new items.LibraryItem[] { magazine37, magazine45, magazine53, magazine62 };
        java.util.ArrayList<items.LibraryItem> libraryItemList64 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList64, libraryItemArray63);
        boolean boolean66 = magazine30.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList64);
        boolean boolean67 = magazine18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList64);
        boolean boolean68 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList64);
        boolean boolean69 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15845, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15845, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15846 + "'", int21 == 15846);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        boolean boolean11 = magazine6.isOverdue();
        items.Magazine magazine18 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str19 = magazine18.getPublisher();
        boolean boolean20 = magazine18.isRented();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getPublisher();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getTitle();
        java.lang.String str37 = magazine35.getTitle();
        items.Magazine magazine44 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str52 = magazine51.getPublisher();
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str60 = magazine59.getPublisher();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str68 = magazine67.getPublisher();
        double double69 = magazine67.calculateOverduePenalty();
        items.Magazine magazine76 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { magazine51, magazine59, magazine67, magazine76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = magazine44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean81 = magazine35.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean82 = magazine27.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean83 = magazine18.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean84 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        java.lang.String str85 = magazine6.getLocation();
        magazine6.setLocation("Magazine: . Location: . Purchasable: true");
        java.time.LocalDate localDate88 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate88, 6923, "LibraryItem [itemId=8047, itemType=Magazine, location=LibraryItem [itemId=2685, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=LibraryItem [itemId=2305, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getPrice();
        java.lang.String str11 = magazine6.getLocation();
        java.lang.String str12 = magazine6.toString();
        magazine6.setBorrowerEmail("LibraryItem [itemId=6903, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean15 = magazine6.isOverdue();
        java.lang.String str16 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=15861, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=15861, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getBorrowerEmail();
        boolean boolean13 = magazine6.isPurchasable();
        boolean boolean14 = magazine6.isPurchasable();
        java.lang.String str15 = magazine6.getTitle();
        boolean boolean16 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        double double10 = magazine6.calculateOverduePenalty();
        magazine6.setBorrowerEmail("hi!");
        java.lang.String str13 = magazine6.getTitle();
        items.Magazine magazine20 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine20.setLocation("LibraryItem [itemId=1409, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getPublisher();
        java.lang.String str31 = magazine29.getBorrowerEmail();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getTitle();
        java.lang.String str40 = magazine38.getTitle();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine54 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str55 = magazine54.getPublisher();
        items.Magazine magazine62 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str63 = magazine62.getPublisher();
        items.Magazine magazine70 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str71 = magazine70.getPublisher();
        double double72 = magazine70.calculateOverduePenalty();
        items.Magazine magazine79 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray80 = new items.LibraryItem[] { magazine54, magazine62, magazine70, magazine79 };
        java.util.ArrayList<items.LibraryItem> libraryItemList81 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList81, libraryItemArray80);
        boolean boolean83 = magazine47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean84 = magazine38.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean85 = magazine29.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean86 = magazine20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList81);
        boolean boolean87 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList81);
        magazine6.setBorrowerEmail("LibraryItem [itemId=12331, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15863 + "'", int9 == 15863);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getPrice();
        double double11 = magazine6.calculateOverduePenalty();
        magazine6.returnItem();
        magazine6.returnItem();
        java.lang.String str14 = magazine6.getPrice();
        java.lang.String str15 = magazine6.getTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=4957, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=1056, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=4023, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5738, itemType=Magazine, location=Magazine: Magazine. Location: Magazine. Purchasable: true, purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.returnItem();
        java.lang.String str8 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=5738, itemType=Magazine, location=Magazine: Magazine. Location: Magazine. Purchasable: true, purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=5738, itemType=Magazine, location=Magazine: Magazine. Location: Magazine. Purchasable: true, purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=5044, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6771, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, false, "LibraryItem [itemId=6771, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5334, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getLocation();
        magazine6.setBorrowerEmail("LibraryItem [itemId=6092, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str10 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=5044, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=5044, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=5334, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=5334, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        java.lang.String str55 = magazine6.getLocation();
        java.lang.String str56 = magazine6.getPrice();
        boolean boolean57 = magazine6.isOverdue();
        java.lang.String str58 = magazine6.getPublisher();
        double double59 = magazine6.calculateOverduePenalty();
        int int60 = magazine6.getItemId();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 15875 + "'", int60 == 15875);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        boolean boolean10 = magazine6.isRented();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1228, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str13 = magazine6.getDetails();
        magazine6.setIsPurchasable(true);
        java.lang.String str16 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str13, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str16, "Magazine: . Location: . Purchasable: true");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getBorrowerEmail();
        java.lang.String str12 = magazine6.getItemType();
        java.lang.String str13 = magazine6.getDetails();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine" + "'", str12, "Magazine");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine: . Location: . Purchasable: true" + "'", str13, "Magazine: . Location: . Purchasable: true");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getBorrowerEmail();
        java.lang.String str11 = magazine6.getBorrowerEmail();
        java.lang.String str12 = magazine6.getDetails();
        magazine6.setBorrowerEmail("LibraryItem [itemId=2787, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setIsPurchasable(true);
        double double17 = magazine6.calculateOverduePenalty();
        java.lang.String str18 = magazine6.getItemType();
        java.lang.String str19 = magazine6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str12, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Magazine" + "'", str18, "Magazine");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LibraryItem [itemId=15885, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str19, "LibraryItem [itemId=15885, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getTitle();
        java.lang.String str67 = magazine6.toString();
        boolean boolean68 = magazine6.isOverdue();
        java.lang.Class<?> wildcardClass69 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "LibraryItem [itemId=15886, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str67, "LibraryItem [itemId=15886, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=1765, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "", false, false, "", "LibraryItem [itemId=2669, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        double double7 = magazine6.calculateOverduePenalty();
        magazine6.returnItem();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str16 = magazine15.getTitle();
        java.lang.String str17 = magazine15.getTitle();
        java.lang.String str18 = magazine15.getItemType();
        java.lang.String str19 = magazine15.getAuthor();
        magazine15.setBorrowerEmail("Magazine: . Location: . Purchasable: false");
        items.Magazine magazine28 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str29 = magazine28.getPublisher();
        double double30 = magazine28.calculateOverduePenalty();
        items.Magazine magazine37 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str38 = magazine37.getTitle();
        java.lang.String str39 = magazine37.getTitle();
        boolean boolean40 = magazine37.isOverdue();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str48 = magazine47.getTitle();
        java.lang.String str49 = magazine47.getTitle();
        items.Magazine magazine56 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine63 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str64 = magazine63.getPublisher();
        items.Magazine magazine71 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str72 = magazine71.getPublisher();
        items.Magazine magazine79 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str80 = magazine79.getPublisher();
        double double81 = magazine79.calculateOverduePenalty();
        items.Magazine magazine88 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray89 = new items.LibraryItem[] { magazine63, magazine71, magazine79, magazine88 };
        java.util.ArrayList<items.LibraryItem> libraryItemList90 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList90, libraryItemArray89);
        boolean boolean92 = magazine56.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList90);
        boolean boolean93 = magazine47.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList90);
        boolean boolean94 = magazine37.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList90);
        boolean boolean95 = magazine28.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList90);
        boolean boolean96 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList90);
        boolean boolean97 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList90);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Magazine" + "'", str18, "Magazine");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getItemType();
        boolean boolean67 = magazine6.isRented();
        java.lang.String str68 = magazine6.getDetails();
        double double69 = magazine6.calculateOverduePenalty();
        boolean boolean70 = magazine6.isOverdue();
        boolean boolean71 = magazine6.isOverdue();
        java.lang.String str72 = magazine6.getAuthor();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Magazine" + "'", str66, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str68, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getItemType();
        magazine6.setLocation("");
        magazine6.setBorrowerEmail("");
        java.lang.String str15 = magazine6.getAuthor();
        java.lang.String str16 = magazine6.getDetails();
        boolean boolean17 = magazine6.isOverdue();
        java.lang.String str18 = magazine6.getTitle();
        java.lang.String str19 = magazine6.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Magazine" + "'", str10, "Magazine");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str16, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        boolean boolean55 = magazine6.isRented();
        magazine6.setLocation("LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str58 = magazine6.getDetails();
        magazine6.setLocation("LibraryItem [itemId=3416, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean61 = magazine6.isOverdue();
        magazine6.setLocation("LibraryItem [itemId=3082, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false" + "'", str58, "Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=3318, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=2325, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", true, true, "LibraryItem [itemId=1103, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true");
        magazine6.setLocation("LibraryItem [itemId=13075, itemType=Magazine, location=LibraryItem [itemId=997, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        boolean boolean10 = magazine6.isRented();
        double double11 = magazine6.calculateOverduePenalty();
        items.Magazine magazine18 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str26 = magazine25.getPublisher();
        items.Magazine magazine33 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str34 = magazine33.getPublisher();
        items.Magazine magazine41 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str42 = magazine41.getPublisher();
        double double43 = magazine41.calculateOverduePenalty();
        items.Magazine magazine50 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray51 = new items.LibraryItem[] { magazine25, magazine33, magazine41, magazine50 };
        java.util.ArrayList<items.LibraryItem> libraryItemList52 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList52, libraryItemArray51);
        boolean boolean54 = magazine18.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList52);
        boolean boolean55 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList52);
        java.lang.String str56 = magazine6.getPublisher();
        boolean boolean57 = magazine6.isPurchasable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15918 + "'", int9 == 15918);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        boolean boolean10 = magazine6.isOverdue();
        java.lang.String str11 = magazine6.getTitle();
        magazine6.returnItem();
        boolean boolean13 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getPublisher();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        magazine6.setBorrowerEmail("");
        java.lang.String str55 = magazine6.getTitle();
        java.lang.String str56 = magazine6.getItemType();
        boolean boolean57 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Magazine" + "'", str56, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=7604, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=8046, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=2669, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=11504, itemType=Magazine, location=Magazine, purchasable=true, title=Magazine, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean7 = magazine6.isOverdue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        java.lang.String str66 = magazine6.getItemType();
        boolean boolean67 = magazine6.isRented();
        boolean boolean68 = magazine6.isOverdue();
        boolean boolean69 = magazine6.isPurchasable();
        double double70 = magazine6.calculateOverduePenalty();
        magazine6.setLocation("LibraryItem [itemId=10828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Magazine" + "'", str66, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2831, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=979, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3433, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=8046, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean9 = magazine6.isPurchasable();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean7 = magazine6.isRented();
        java.lang.String str8 = magazine6.toString();
        java.lang.String str9 = magazine6.getPublisher();
        magazine6.returnItem();
        items.Magazine magazine17 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str18 = magazine17.getPublisher();
        java.lang.String str19 = magazine17.getBorrowerEmail();
        java.lang.String str20 = magazine17.getPrice();
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getPublisher();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getTitle();
        java.lang.String str37 = magazine35.getTitle();
        items.Magazine magazine44 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str52 = magazine51.getPublisher();
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str60 = magazine59.getPublisher();
        items.Magazine magazine67 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str68 = magazine67.getPublisher();
        double double69 = magazine67.calculateOverduePenalty();
        items.Magazine magazine76 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray77 = new items.LibraryItem[] { magazine51, magazine59, magazine67, magazine76 };
        java.util.ArrayList<items.LibraryItem> libraryItemList78 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList78, libraryItemArray77);
        boolean boolean80 = magazine44.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean81 = magazine35.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean82 = magazine27.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean83 = magazine17.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        boolean boolean84 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList78);
        java.lang.String str85 = magazine6.getPrice();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=15941, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=15941, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        java.lang.String str10 = magazine6.getAuthor();
        boolean boolean11 = magazine6.isOverdue();
        java.lang.String str12 = magazine6.getBorrowerEmail();
        boolean boolean13 = magazine6.isPurchasable();
        boolean boolean14 = magazine6.isPurchasable();
        java.lang.String str15 = magazine6.getItemType();
        java.lang.String str16 = magazine6.getPrice();
        boolean boolean17 = magazine6.isPurchasable();
        java.time.LocalDate localDate18 = null;
        // The following exception was thrown during execution in test generation
        try {
            magazine6.rentItem(localDate18, 8914, "LibraryItem [itemId=1359, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDate.plusDays(long)\" because \"startDate\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine" + "'", str15, "Magazine");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine", true, false, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setLocation("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getBorrowerEmail();
        java.lang.String str11 = magazine6.getBorrowerEmail();
        boolean boolean12 = magazine6.isOverdue();
        java.lang.String str13 = magazine6.getPublisher();
        magazine6.returnItem();
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15951 + "'", int9 == 15951);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str13, "LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getPrice();
        magazine6.returnItem();
        magazine6.setLocation("LibraryItem [itemId=2215, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str14 = magazine6.getPrice();
        boolean boolean15 = magazine6.isOverdue();
        java.lang.String str16 = magazine6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15952 + "'", int9 == 15952);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getPrice();
        magazine6.returnItem();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1677, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15953 + "'", int9 == 15953);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPrice();
        java.lang.String str8 = magazine6.getBorrowerEmail();
        java.lang.String str9 = magazine6.getPublisher();
        magazine6.setBorrowerEmail("LibraryItem [itemId=6299, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean12 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setLocation("");
        boolean boolean11 = magazine6.isRented();
        java.lang.String str12 = magazine6.toString();
        boolean boolean13 = magazine6.isOverdue();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LibraryItem [itemId=15955, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str12, "LibraryItem [itemId=15955, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getPublisher();
        double double12 = magazine6.calculateOverduePenalty();
        magazine6.setLocation("Magazine: . Location: . Purchasable: false");
        java.lang.String str15 = magazine6.getItemType();
        boolean boolean16 = magazine6.isRented();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15956 + "'", int8 == 15956);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Magazine" + "'", str15, "Magazine");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        boolean boolean54 = magazine6.isOverdue();
        java.lang.String str55 = magazine6.getLocation();
        java.lang.String str56 = magazine6.getPrice();
        magazine6.returnItem();
        magazine6.setLocation("LibraryItem [itemId=1186, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str60 = magazine6.getPrice();
        magazine6.setLocation("LibraryItem [itemId=2673, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean63 = magazine6.isOverdue();
        java.lang.String str64 = magazine6.getItemType();
        magazine6.setIsPurchasable(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Magazine" + "'", str64, "Magazine");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        items.Magazine magazine6 = new items.Magazine("Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false", "", false, true, "LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=6648, itemType=Magazine, location=LibraryItem [itemId=1502, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getDetails();
        double double8 = magazine6.calculateOverduePenalty();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Magazine: LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false" + "'", str7, "Magazine: LibraryItem [itemId=5776, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: Magazine: . Location: LibraryItem [itemId=828, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        magazine6.setLocation("");
        boolean boolean13 = magazine6.isRented();
        java.lang.String str14 = magazine6.toString();
        items.Magazine magazine21 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean22 = magazine21.isRented();
        java.lang.String str23 = magazine21.getItemType();
        java.lang.String str24 = magazine21.toString();
        java.lang.String str25 = magazine21.getLocation();
        java.lang.String str26 = magazine21.getBorrowerEmail();
        int int27 = magazine21.getItemId();
        int int28 = magazine21.getItemId();
        magazine21.returnItem();
        items.Magazine magazine36 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str44 = magazine43.getPublisher();
        items.Magazine magazine51 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str52 = magazine51.getPublisher();
        items.Magazine magazine59 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str60 = magazine59.getPublisher();
        double double61 = magazine59.calculateOverduePenalty();
        items.Magazine magazine68 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray69 = new items.LibraryItem[] { magazine43, magazine51, magazine59, magazine68 };
        java.util.ArrayList<items.LibraryItem> libraryItemList70 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList70, libraryItemArray69);
        boolean boolean72 = magazine36.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList70);
        boolean boolean73 = magazine21.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList70);
        boolean boolean74 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList70);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15964 + "'", int8 == 15964);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LibraryItem [itemId=15964, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str14, "LibraryItem [itemId=15964, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Magazine" + "'", str23, "Magazine");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "LibraryItem [itemId=15965, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str24, "LibraryItem [itemId=15965, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str25, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15965 + "'", int27 == 15965);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15965 + "'", int28 == 15965);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        items.Magazine magazine6 = new items.Magazine("", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        java.lang.String str7 = magazine6.getBorrowerEmail();
        boolean boolean8 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        int int9 = magazine6.getItemId();
        java.lang.String str10 = magazine6.getLocation();
        magazine6.setLocation("Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false");
        java.lang.String str13 = magazine6.getDetails();
        magazine6.setBorrowerEmail("LibraryItem [itemId=1359, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        int int16 = magazine6.getItemId();
        magazine6.setIsPurchasable(true);
        magazine6.setBorrowerEmail("Magazine: LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15972 + "'", int9 == 15972);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false" + "'", str13, "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15972 + "'", int16 == 15972);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str16 = magazine15.getTitle();
        java.lang.String str17 = magazine15.getTitle();
        boolean boolean18 = magazine15.isOverdue();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str26 = magazine25.getTitle();
        java.lang.String str27 = magazine25.getTitle();
        items.Magazine magazine34 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine41 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str42 = magazine41.getPublisher();
        items.Magazine magazine49 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str50 = magazine49.getPublisher();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str58 = magazine57.getPublisher();
        double double59 = magazine57.calculateOverduePenalty();
        items.Magazine magazine66 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray67 = new items.LibraryItem[] { magazine41, magazine49, magazine57, magazine66 };
        java.util.ArrayList<items.LibraryItem> libraryItemList68 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList68, libraryItemArray67);
        boolean boolean70 = magazine34.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList68);
        boolean boolean71 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList68);
        boolean boolean72 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList68);
        boolean boolean73 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList68);
        java.lang.String str74 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Magazine" + "'", str74, "Magazine");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=338, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, true, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.getPrice();
        java.lang.String str8 = magazine6.getBorrowerEmail();
        java.lang.String str9 = magazine6.getPublisher();
        java.lang.String str10 = magazine6.getTitle();
        int int11 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15981 + "'", int11 == 15981);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        int int8 = magazine6.getItemId();
        magazine6.setBorrowerEmail("");
        java.lang.String str11 = magazine6.getPublisher();
        double double12 = magazine6.calculateOverduePenalty();
        java.lang.String str13 = magazine6.getLocation();
        magazine6.setBorrowerEmail("LibraryItem [itemId=980, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean16 = magazine6.isOverdue();
        magazine6.setLocation("LibraryItem [itemId=2366, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        boolean boolean19 = magazine6.isPurchasable();
        java.lang.String str20 = magazine6.getAuthor();
        java.lang.String str21 = magazine6.getLocation();
        java.lang.Class<?> wildcardClass22 = magazine6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15982 + "'", int8 == 15982);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "LibraryItem [itemId=2366, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str21, "LibraryItem [itemId=2366, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getBorrowerEmail();
        java.lang.String str11 = magazine6.getBorrowerEmail();
        java.lang.String str12 = magazine6.getDetails();
        magazine6.setBorrowerEmail("LibraryItem [itemId=2787, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.setIsPurchasable(true);
        magazine6.setLocation("LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str19 = magazine6.toString();
        magazine6.setIsPurchasable(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str12, "Magazine: . Location: . Purchasable: false");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LibraryItem [itemId=15983, itemType=Magazine, location=LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str19, "LibraryItem [itemId=15983, itemType=Magazine, location=LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "hi!", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "");
        boolean boolean7 = magazine6.isRented();
        java.lang.String str8 = magazine6.getItemType();
        java.lang.String str9 = magazine6.toString();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getBorrowerEmail();
        int int12 = magazine6.getItemId();
        boolean boolean13 = magazine6.isPurchasable();
        boolean boolean14 = magazine6.isOverdue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Magazine" + "'", str8, "Magazine");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15984, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15984, itemType=Magazine, location=LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15984 + "'", int12 == 15984);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.toString();
        java.lang.String str10 = magazine6.getLocation();
        java.lang.String str11 = magazine6.getPublisher();
        java.lang.String str12 = magazine6.getPrice();
        boolean boolean13 = magazine6.isRented();
        items.Magazine magazine20 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine27 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str28 = magazine27.getPublisher();
        items.Magazine magazine35 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str36 = magazine35.getPublisher();
        items.Magazine magazine43 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str44 = magazine43.getPublisher();
        double double45 = magazine43.calculateOverduePenalty();
        items.Magazine magazine52 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray53 = new items.LibraryItem[] { magazine27, magazine35, magazine43, magazine52 };
        java.util.ArrayList<items.LibraryItem> libraryItemList54 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList54, libraryItemArray53);
        boolean boolean56 = magazine20.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList54);
        boolean boolean57 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList54);
        magazine6.setBorrowerEmail("LibraryItem [itemId=2938, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        magazine6.returnItem();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=15985, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=15985, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2451, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=3661, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=5634, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.Class<?> wildcardClass7 = magazine6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=2436, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: LibraryItem [itemId=144, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=405, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: true", false, false, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
        double double7 = magazine6.calculateOverduePenalty();
        java.lang.String str8 = magazine6.getTitle();
        java.lang.String str9 = magazine6.getPublisher();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str8, "LibraryItem [itemId=667, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false" + "'", str9, "Magazine: . Location: Magazine: LibraryItem [itemId=20, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Location: LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]. Purchasable: false. Purchasable: false");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        magazine6.setIsPurchasable(true);
        java.lang.String str11 = magazine6.getAuthor();
        java.lang.String str12 = magazine6.getAuthor();
        magazine6.setBorrowerEmail("LibraryItem [itemId=12138, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine13 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str14 = magazine13.getPublisher();
        items.Magazine magazine21 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str22 = magazine21.getPublisher();
        items.Magazine magazine29 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str30 = magazine29.getPublisher();
        double double31 = magazine29.calculateOverduePenalty();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray39 = new items.LibraryItem[] { magazine13, magazine21, magazine29, magazine38 };
        java.util.ArrayList<items.LibraryItem> libraryItemList40 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList40, libraryItemArray39);
        boolean boolean42 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList40);
        java.lang.String str43 = magazine6.getPublisher();
        double double44 = magazine6.calculateOverduePenalty();
        java.lang.String str45 = magazine6.getItemType();
        magazine6.returnItem();
        java.lang.String str47 = magazine6.getDetails();
        java.lang.String str48 = magazine6.getBorrowerEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Magazine" + "'", str45, "Magazine");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str47, "Magazine: . Location: . Purchasable: false");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        magazine6.returnItem();
        magazine6.setBorrowerEmail("LibraryItem [itemId=5415, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        double double8 = magazine6.calculateOverduePenalty();
        boolean boolean9 = magazine6.isPurchasable();
        java.lang.String str10 = magazine6.getAuthor();
        magazine6.setLocation("Magazine: Magazine. Location: Magazine. Purchasable: true");
        boolean boolean13 = magazine6.isRented();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getPublisher();
        boolean boolean8 = magazine6.isRented();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str16 = magazine15.getPublisher();
        items.Magazine magazine23 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str24 = magazine23.getTitle();
        java.lang.String str25 = magazine23.getTitle();
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine39 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str40 = magazine39.getPublisher();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str48 = magazine47.getPublisher();
        items.Magazine magazine55 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str56 = magazine55.getPublisher();
        double double57 = magazine55.calculateOverduePenalty();
        items.Magazine magazine64 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray65 = new items.LibraryItem[] { magazine39, magazine47, magazine55, magazine64 };
        java.util.ArrayList<items.LibraryItem> libraryItemList66 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList66, libraryItemArray65);
        boolean boolean68 = magazine32.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean69 = magazine23.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean70 = magazine15.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        boolean boolean71 = magazine6.hasBorrowingPrivileges((java.util.List<items.LibraryItem>) libraryItemList66);
        double double72 = magazine6.calculateOverduePenalty();
        boolean boolean73 = magazine6.isRented();
        boolean boolean74 = magazine6.isOverdue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        java.lang.String str7 = magazine6.toString();
        boolean boolean8 = magazine6.isPurchasable();
        java.lang.String str9 = magazine6.getTitle();
        java.lang.String str10 = magazine6.getAuthor();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LibraryItem [itemId=16015, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str7, "LibraryItem [itemId=16015, itemType=Magazine, location=LibraryItem [itemId=122, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], purchasable=false, title=LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null], isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str9, "LibraryItem [itemId=1391, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str10, "LibraryItem [itemId=423, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        items.Magazine magazine15 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine22 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str23 = magazine22.getPublisher();
        items.Magazine magazine30 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str31 = magazine30.getPublisher();
        items.Magazine magazine38 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str39 = magazine38.getPublisher();
        double double40 = magazine38.calculateOverduePenalty();
        items.Magazine magazine47 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray48 = new items.LibraryItem[] { magazine22, magazine30, magazine38, magazine47 };
        java.util.ArrayList<items.LibraryItem> libraryItemList49 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList49, libraryItemArray48);
        boolean boolean51 = magazine15.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean52 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList49);
        boolean boolean53 = magazine6.isRented();
        java.lang.String str54 = magazine6.toString();
        java.lang.String str55 = magazine6.getDetails();
        magazine6.setLocation("LibraryItem [itemId=10794, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "LibraryItem [itemId=16016, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]" + "'", str54, "LibraryItem [itemId=16016, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Magazine: . Location: . Purchasable: false" + "'", str55, "Magazine: . Location: . Purchasable: false");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        items.Magazine magazine6 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str7 = magazine6.getTitle();
        java.lang.String str8 = magazine6.getTitle();
        boolean boolean9 = magazine6.isOverdue();
        items.Magazine magazine16 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str17 = magazine16.getTitle();
        java.lang.String str18 = magazine16.getTitle();
        items.Magazine magazine25 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.Magazine magazine32 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str33 = magazine32.getPublisher();
        items.Magazine magazine40 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str41 = magazine40.getPublisher();
        items.Magazine magazine48 = new items.Magazine("", "hi!", false, true, "", "hi!");
        java.lang.String str49 = magazine48.getPublisher();
        double double50 = magazine48.calculateOverduePenalty();
        items.Magazine magazine57 = new items.Magazine("", "hi!", false, true, "", "hi!");
        items.LibraryItem[] libraryItemArray58 = new items.LibraryItem[] { magazine32, magazine40, magazine48, magazine57 };
        java.util.ArrayList<items.LibraryItem> libraryItemList59 = new java.util.ArrayList<items.LibraryItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<items.LibraryItem>) libraryItemList59, libraryItemArray58);
        boolean boolean61 = magazine25.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean62 = magazine16.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        boolean boolean63 = magazine6.hasExceededBorrowingLimit((java.util.List<items.LibraryItem>) libraryItemList59);
        magazine6.setLocation("");
        boolean boolean66 = magazine6.isRented();
        int int67 = magazine6.getItemId();
        java.lang.String str68 = magazine6.getBorrowerEmail();
        java.lang.String str69 = magazine6.getItemType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(libraryItemArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 16022 + "'", int67 == 16022);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Magazine" + "'", str69, "Magazine");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        items.Magazine magazine6 = new items.Magazine("LibraryItem [itemId=341, itemType=Magazine, location=, purchasable=false, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", "LibraryItem [itemId=654, itemType=Magazine, location=, purchasable=true, title=, isRented=false, rentalDate=null, dueDate=null, rentedBy=null]", false, false, "Magazine: . Location: . Purchasable: false", "hi!");
        java.lang.String str7 = magazine6.getAuthor();
        int int8 = magazine6.getItemId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16029 + "'", int8 == 16029);
    }
}
