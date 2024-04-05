package courseAutoTest;


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
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
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
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList25);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass21 = textbookList20.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
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
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
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
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
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
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
        java.lang.Class<?> wildcardClass28 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
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
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
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
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
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
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
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
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        items.Textbook textbook28 = null;
        course1.addTextbook(textbook28);
        login.FacultyClient facultyClient30 = null;
        course1.addFaculty(facultyClient30);
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
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
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
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
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
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
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
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
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
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.lang.String str4 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.Class<?> wildcardClass8 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
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
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
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
        java.lang.String str20 = course1.getCourseId();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
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
        java.lang.String str20 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        java.lang.String str24 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList25);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = facultyClientList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
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
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
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
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
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
        java.lang.String str22 = course1.getCourseId();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(facultyClientList7);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.lang.String str25 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
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
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        java.util.List<items.Textbook> textbookList27 = course1.getTextbooks();
        java.lang.String str28 = course1.getCourseId();
        login.FacultyClient facultyClient29 = null;
        course1.addFaculty(facultyClient29);
        java.util.List<login.FacultyClient> facultyClientList31 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList31);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass14 = textbookList13.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass22 = textbookList21.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.Class<?> wildcardClass23 = facultyClientList22.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
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
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.Class<?> wildcardClass19 = facultyClientList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        items.Textbook textbook27 = null;
        course1.addTextbook(textbook27);
        java.util.List<items.Textbook> textbookList29 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList25);
        org.junit.Assert.assertNotNull(facultyClientList26);
        org.junit.Assert.assertNotNull(textbookList29);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
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
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
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
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
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
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
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
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.lang.String str24 = course1.getCourseId();
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
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
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.lang.String str23 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.Class<?> wildcardClass25 = facultyClientList24.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
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
        java.lang.Class<?> wildcardClass22 = course1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
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
        java.lang.String str25 = course1.getCourseId();
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
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
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.lang.String str4 = course1.getCourseId();
        java.lang.Class<?> wildcardClass5 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        items.Textbook textbook27 = null;
        course1.addTextbook(textbook27);
        login.FacultyClient facultyClient29 = null;
        course1.addFaculty(facultyClient29);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.lang.String str4 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
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
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
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
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.Class<?> wildcardClass7 = facultyClientList6.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
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
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
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
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
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
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        java.lang.String str26 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(textbookList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
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
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
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
        java.lang.Class<?> wildcardClass20 = facultyClientList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.lang.String str8 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
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
        java.lang.String str23 = course1.getCourseId();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        java.lang.String str27 = course1.getCourseId();
        items.Textbook textbook28 = null;
        course1.addTextbook(textbook28);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
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
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
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
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
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
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
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
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
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
        java.lang.String str29 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
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
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
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
        org.junit.Assert.assertNotNull(facultyClientList27);
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
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
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
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
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.lang.String str26 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
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
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
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
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
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
        java.lang.String str14 = course1.getCourseId();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
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
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass8 = textbookList7.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.Class<?> wildcardClass19 = facultyClientList18.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.lang.String str20 = course1.getCourseId();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
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
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.lang.String str23 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
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
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        java.lang.String str27 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
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
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
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
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
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
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
        login.FacultyClient facultyClient28 = null;
        course1.addFaculty(facultyClient28);
        java.util.List<login.FacultyClient> facultyClientList30 = course1.getFaculties();
        login.FacultyClient facultyClient31 = null;
        course1.addFaculty(facultyClient31);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(facultyClientList30);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.String str25 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.lang.String str23 = course1.getCourseId();
        java.lang.String str24 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList25);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.Class<?> wildcardClass7 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = textbookList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.String str22 = course1.getCourseId();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        items.Textbook textbook27 = null;
        course1.addTextbook(textbook27);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList6);
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
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
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
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
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass22 = textbookList21.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
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
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
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
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass24 = textbookList23.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
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
        items.Textbook textbook30 = null;
        course1.addTextbook(textbook30);
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
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
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
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
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
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
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
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass26 = course1.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(textbookList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
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
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.String str25 = course1.getCourseId();
        java.lang.Class<?> wildcardClass26 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
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
        java.lang.String str21 = course1.getCourseId();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
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
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
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
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
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
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
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
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
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
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
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
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList26);
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
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
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
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
        java.lang.String str20 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.lang.String str24 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
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
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
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
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        java.util.List<items.Textbook> textbookList27 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList27);
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
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
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
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
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
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
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
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
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
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
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
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
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
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
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
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
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
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
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
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
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
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
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.String str25 = course1.getCourseId();
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
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
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
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
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
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
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
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
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
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
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
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
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
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
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        java.lang.String str27 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(textbookList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
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
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
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
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(textbookList26);
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = textbookList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
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
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
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
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
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
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass24 = textbookList23.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
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
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
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
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
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
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = textbookList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
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
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
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
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
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
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList25);
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
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
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
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
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
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
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
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
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.lang.String str26 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList27 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass28 = textbookList27.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(textbookList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
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
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
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
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test7993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7993");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7994");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test7995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7995");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test7996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7996");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test7997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7997");
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
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7998");
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
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7999");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test8000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test8000");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

