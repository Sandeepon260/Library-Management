package courseAutoTest;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

    public static boolean debug = false;

    @Test
    public void test9501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9501");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9502");
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
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test9503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9503");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = textbookList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9504");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test9505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9505");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test9506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9506");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test9507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9507");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9508");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test9509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9509");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass11 = textbookList10.getClass();
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test9510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9510");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test9511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9511");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9512");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test9513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9513");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test9514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9514");
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
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test9515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9515");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9516");
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
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.lang.String str25 = course1.getCourseId();
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test9517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9517");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test9518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9518");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test9519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9519");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test9520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9520");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
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
    public void test9521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9521");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9522");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test9523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9523");
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
        java.lang.String str13 = course1.getCourseId();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test9524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9524");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9525");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9526");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
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
    public void test9527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9527");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test9528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9528");
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
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9529");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9530");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test9531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9531");
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
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test9532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9532");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.String str22 = course1.getCourseId();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.lang.String str25 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test9533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9533");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test9534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9534");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test9535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9535");
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
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test9536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9536");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9537");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9538");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test9539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9539");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test9540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9540");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test9541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9541");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test9542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9542");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test9543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9543");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test9544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9544");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.Class<?> wildcardClass23 = facultyClientList22.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9545");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9546");
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
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test9547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9547");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9548");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test9549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9549");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test9550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9550");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test9551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9551");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9552");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test9553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9553");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test9554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9554");
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
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test9555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9555");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9556");
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
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test9557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9557");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test9558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9558");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test9559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9559");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test9560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9560");
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
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9561");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9562");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test9563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9563");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test9564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9564");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9565");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test9566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9566");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        login.FacultyClient facultyClient27 = null;
        course1.addFaculty(facultyClient27);
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
    }

    @Test
    public void test9567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9567");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test9568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9568");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test9569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9569");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test9570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9570");
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
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test9571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9571");
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
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test9572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9572");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test9573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9573");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.Class<?> wildcardClass8 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test9574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9574");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9575");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
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
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test9576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9576");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test9577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9577");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test9578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9578");
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
        java.lang.String str24 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test9579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9579");
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
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        login.FacultyClient facultyClient27 = null;
        course1.addFaculty(facultyClient27);
        java.util.List<login.FacultyClient> facultyClientList29 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(facultyClientList29);
    }

    @Test
    public void test9580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9580");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test9581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9581");
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
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        items.Textbook textbook27 = null;
        course1.addTextbook(textbook27);
        items.Textbook textbook29 = null;
        course1.addTextbook(textbook29);
        java.lang.Class<?> wildcardClass31 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test9582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9582");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test9583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9583");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test9584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9584");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.lang.String str8 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test9585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9585");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9586");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = facultyClientList11.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9587");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9588");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test9589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9589");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test9590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9590");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9591");
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
        java.lang.String str22 = course1.getCourseId();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test9592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9592");
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
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test9593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9593");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test9594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9594");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test9595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9595");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9596");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test9597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9597");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test9598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9598");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9599");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test9600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9600");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test9601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9601");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test9602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9602");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test9603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9603");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test9604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9604");
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
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test9605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9605");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test9606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9606");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test9607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9607");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test9608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9608");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test9609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9609");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9610");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test9611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9611");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test9612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9612");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test9613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9613");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9614");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test9615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9615");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test9616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9616");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test9617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9617");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test9618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9618");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9619");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test9620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9620");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test9621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9621");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test9622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9622");
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
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test9623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9623");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test9624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9624");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test9625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9625");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(facultyClientList7);
    }

    @Test
    public void test9626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9626");
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
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        java.util.List<login.FacultyClient> facultyClientList27 = course1.getFaculties();
        java.lang.Class<?> wildcardClass28 = facultyClientList27.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test9627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9627");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test9628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9628");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test9629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9629");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.lang.String str23 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test9630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9630");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test9631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9631");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        login.FacultyClient facultyClient27 = null;
        course1.addFaculty(facultyClient27);
        login.FacultyClient facultyClient29 = null;
        course1.addFaculty(facultyClient29);
        items.Textbook textbook31 = null;
        course1.addTextbook(textbook31);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test9632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9632");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test9633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9633");
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
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.lang.String str24 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test9634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9634");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test9635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9635");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9636");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test9637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9637");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test9638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9638");
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
        java.lang.String str20 = course1.getCourseId();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test9639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9639");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9640");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        java.lang.String str28 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList29 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass30 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(textbookList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test9641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9641");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test9642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9642");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
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
    }

    @Test
    public void test9643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9643");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test9644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9644");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test9645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9645");
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
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
        items.Textbook textbook28 = null;
        course1.addTextbook(textbook28);
        java.lang.String str30 = course1.getCourseId();
        login.FacultyClient facultyClient31 = null;
        course1.addFaculty(facultyClient31);
        java.util.List<items.Textbook> textbookList33 = course1.getTextbooks();
        login.FacultyClient facultyClient34 = null;
        course1.addFaculty(facultyClient34);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(textbookList33);
    }

    @Test
    public void test9646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9646");
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
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test9647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9647");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test9648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9648");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test9649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9649");
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
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9650");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test9651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9651");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = facultyClientList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9652");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
    }

    @Test
    public void test9653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9653");
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
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test9654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9654");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test9655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9655");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test9656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9656");
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
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test9657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9657");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test9658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9658");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(facultyClientList25);
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test9659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9659");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test9660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9660");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test9661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9661");
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
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9662");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test9663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9663");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test9664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9664");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass10 = textbookList9.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test9665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9665");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test9666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9666");
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
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test9667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9667");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9668");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.Class<?> wildcardClass8 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test9669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9669");
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
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test9670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9670");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test9671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9671");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test9672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9672");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test9673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9673");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test9674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9674");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test9675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9675");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test9676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9676");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9677");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test9678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9678");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test9679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9679");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9680");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test9681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9681");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test9682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9682");
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
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test9683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9683");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
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
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test9684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9684");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test9685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9685");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9686");
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
        java.lang.String str19 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test9687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9687");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test9688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9688");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test9689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9689");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test9690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9690");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test9691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9691");
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
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test9692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9692");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test9693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9693");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test9694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9694");
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
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9695");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test9696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9696");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = facultyClientList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9697");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test9698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9698");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test9699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9699");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9700");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test9701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9701");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test9702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9702");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9703");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test9704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9704");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9705");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test9706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9706");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        java.util.List<items.Textbook> textbookList27 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(textbookList27);
    }

    @Test
    public void test9707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9707");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test9708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9708");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9709");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test9710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9710");
        login.Course course1 = new login.Course("");
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
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test9711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9711");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test9712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9712");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test9713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9713");
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
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9714");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test9715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9715");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test9716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9716");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9717");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9718");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9719");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test9720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9720");
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
        java.lang.String str19 = course1.getCourseId();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test9721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9721");
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
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test9722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9722");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test9723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9723");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test9724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9724");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9725");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test9726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9726");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test9727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9727");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test9728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9728");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test9729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9729");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9730");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9731");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test9732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9732");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test9733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9733");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test9734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9734");
        login.Course course1 = new login.Course("");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.lang.String str3 = course1.getCourseId();
        java.lang.String str4 = course1.getCourseId();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test9735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9735");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9736");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test9737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9737");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.lang.String str24 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test9738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9738");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test9739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9739");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = textbookList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9740");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test9741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9741");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test9742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9742");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test9743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9743");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test9744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9744");
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
        java.lang.String str20 = course1.getCourseId();
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test9745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9745");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.lang.String str23 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(facultyClientList25);
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test9746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9746");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test9747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9747");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test9748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9748");
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
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9749");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test9750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9750");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test9751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9751");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test9752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9752");
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
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test9753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9753");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test9754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9754");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test9755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9755");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = textbookList15.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test9756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9756");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test9757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9757");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test9758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9758");
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
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test9759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9759");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test9760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9760");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
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
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test9761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9761");
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
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9762");
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
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        java.util.List<items.Textbook> textbookList27 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(textbookList27);
    }

    @Test
    public void test9763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9763");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9764");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test9765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9765");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test9766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9766");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test9767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9767");
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
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test9768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9768");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test9769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9769");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test9770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9770");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test9771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9771");
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
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test9772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9772");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test9773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9773");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test9774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9774");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test9775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9775");
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
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test9776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9776");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.lang.String str25 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList27 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(textbookList26);
        org.junit.Assert.assertNotNull(textbookList27);
    }

    @Test
    public void test9777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9777");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test9778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9778");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test9779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9779");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test9780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9780");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test9781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9781");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test9782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9782");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test9783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9783");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test9784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9784");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test9785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9785");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test9786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9786");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
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
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test9787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9787");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test9788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9788");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test9789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9789");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test9790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9790");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.Class<?> wildcardClass11 = facultyClientList10.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test9791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9791");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        java.lang.String str27 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test9792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9792");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test9793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9793");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test9794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9794");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test9795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9795");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test9796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9796");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test9797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9797");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test9798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9798");
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
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.lang.String str24 = course1.getCourseId();
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        java.util.List<login.FacultyClient> facultyClientList27 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList27);
    }

    @Test
    public void test9799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9799");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test9800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9800");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test9801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9801");
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
        java.lang.Class<?> wildcardClass15 = facultyClientList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test9802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9802");
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
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test9803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9803");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test9804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test9804");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }
}

