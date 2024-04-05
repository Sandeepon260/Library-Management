package courseAutoTest;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.lang.String str25 = course1.getCourseId();
        java.lang.String str26 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.lang.String str23 = course1.getCourseId();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        java.lang.Class<?> wildcardClass27 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.lang.String str24 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = textbookList16.getClass();
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(textbookList26);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.lang.String str22 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.lang.String str26 = course1.getCourseId();
        java.lang.String str27 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass21 = textbookList20.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.lang.Class<?> wildcardClass8 = facultyClientList7.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.Class<?> wildcardClass15 = facultyClientList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = facultyClientList19.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        java.lang.String str26 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList26);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass23 = textbookList22.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.lang.String str25 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.lang.String str25 = course1.getCourseId();
        java.lang.String str26 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList27 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList27);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.lang.String str19 = course1.getCourseId();
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass20 = textbookList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        items.Textbook textbook27 = null;
        course1.addTextbook(textbook27);
        login.FacultyClient facultyClient29 = null;
        course1.addFaculty(facultyClient29);
        java.util.List<items.Textbook> textbookList31 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList32 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(textbookList31);
        org.junit.Assert.assertNotNull(facultyClientList32);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass22 = textbookList21.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.String str25 = course1.getCourseId();
        java.lang.Class<?> wildcardClass26 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass21 = textbookList20.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.String str22 = course1.getCourseId();
        java.lang.String str23 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = textbookList12.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = textbookList12.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList27 = course1.getFaculties();
        java.lang.String str28 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList26);
        org.junit.Assert.assertNotNull(facultyClientList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass21 = textbookList20.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.Class<?> wildcardClass23 = facultyClientList22.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        java.lang.String str20 = course1.getCourseId();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        java.lang.String str27 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList25);
        org.junit.Assert.assertNotNull(facultyClientList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        items.Textbook textbook27 = null;
        course1.addTextbook(textbook27);
        java.lang.Class<?> wildcardClass29 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(facultyClientList25);
        org.junit.Assert.assertNotNull(facultyClientList26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.lang.String str22 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = facultyClientList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.Class<?> wildcardClass21 = facultyClientList20.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList25);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.lang.String str8 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = textbookList16.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.lang.String str24 = course1.getCourseId();
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = facultyClientList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList26);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        java.lang.String str27 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList28 = course1.getFaculties();
        java.lang.Class<?> wildcardClass29 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        java.lang.Class<?> wildcardClass28 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.String str22 = course1.getCourseId();
        java.lang.String str23 = course1.getCourseId();
        java.lang.String str24 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass24 = textbookList23.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.Class<?> wildcardClass19 = facultyClientList18.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.lang.String str25 = course1.getCourseId();
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.lang.String str4 = course1.getCourseId();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.lang.String str23 = course1.getCourseId();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(textbookList26);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass9 = textbookList8.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        java.lang.String str23 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.lang.String str26 = course1.getCourseId();
        login.FacultyClient facultyClient27 = null;
        course1.addFaculty(facultyClient27);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.lang.Class<?> wildcardClass8 = facultyClientList7.getClass();
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.lang.String str24 = course1.getCourseId();
        java.lang.String str25 = course1.getCourseId();
        java.lang.Class<?> wildcardClass26 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = facultyClientList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = facultyClientList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.lang.String str25 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        java.lang.Class<?> wildcardClass27 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass23 = textbookList22.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.lang.String str24 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = facultyClientList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.Class<?> wildcardClass19 = facultyClientList18.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
        items.Textbook textbook28 = null;
        course1.addTextbook(textbook28);
        login.FacultyClient facultyClient30 = null;
        course1.addFaculty(facultyClient30);
        java.util.List<items.Textbook> textbookList32 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(facultyClientList25);
        org.junit.Assert.assertNotNull(textbookList32);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.String str23 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = textbookList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass14 = textbookList13.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        java.lang.String str27 = course1.getCourseId();
        java.lang.Class<?> wildcardClass28 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass26 = textbookList25.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

