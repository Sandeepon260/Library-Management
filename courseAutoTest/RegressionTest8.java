package courseAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
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
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
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
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
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
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        login.Course course1 = new login.Course("");
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
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass11 = textbookList10.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
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
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass23 = textbookList22.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
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
        java.util.List<login.FacultyClient> facultyClientList27 = course1.getFaculties();
        items.Textbook textbook28 = null;
        course1.addTextbook(textbook28);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList27);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
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
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        java.lang.Class<?> wildcardClass34 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(textbookList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        java.lang.Class<?> wildcardClass27 = course1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = facultyClientList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        java.lang.Class<?> wildcardClass17 = textbookList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
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
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.Class<?> wildcardClass23 = facultyClientList22.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass24 = textbookList23.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        java.util.List<items.Textbook> textbookList27 = course1.getTextbooks();
        login.FacultyClient facultyClient28 = null;
        course1.addFaculty(facultyClient28);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(textbookList27);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        java.lang.String str23 = course1.getCourseId();
        java.lang.String str24 = course1.getCourseId();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass9 = textbookList8.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
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
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.String str23 = course1.getCourseId();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass27 = textbookList26.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(textbookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = textbookList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.Class<?> wildcardClass9 = facultyClientList8.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass9 = textbookList8.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        login.Course course1 = new login.Course("");
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
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
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
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        java.lang.String str5 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.Class<?> wildcardClass11 = facultyClientList10.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
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
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        java.lang.String str21 = course1.getCourseId();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
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
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        login.FacultyClient facultyClient27 = null;
        course1.addFaculty(facultyClient27);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
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
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
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
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = facultyClientList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = textbookList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
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
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass25 = textbookList24.getClass();
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
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = textbookList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
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
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass9 = textbookList8.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.Class<?> wildcardClass25 = facultyClientList24.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
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
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(facultyClientList25);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        login.Course course1 = new login.Course("hi!");
        java.lang.String str2 = course1.getCourseId();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
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
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.String str23 = course1.getCourseId();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList7);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.String str23 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
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
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
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
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = textbookList17.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        java.lang.Class<?> wildcardClass21 = textbookList20.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        java.lang.Class<?> wildcardClass5 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        java.lang.String str22 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        java.lang.String str13 = course1.getCourseId();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.lang.String str25 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        java.lang.Class<?> wildcardClass19 = facultyClientList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
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
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
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
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        java.lang.Class<?> wildcardClass20 = textbookList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        java.lang.String str18 = course1.getCourseId();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        login.Course course1 = new login.Course("hi!");
        java.lang.String str2 = course1.getCourseId();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        java.lang.String str15 = course1.getCourseId();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = facultyClientList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        java.lang.String str15 = course1.getCourseId();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        login.FacultyClient facultyClient31 = null;
        course1.addFaculty(facultyClient31);
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
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = facultyClientList17.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.lang.String str23 = course1.getCourseId();
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.Class<?> wildcardClass10 = facultyClientList9.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
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
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
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
        java.lang.String str11 = course1.getCourseId();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.Class<?> wildcardClass13 = facultyClientList12.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.lang.String str24 = course1.getCourseId();
        java.lang.String str25 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = textbookList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
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
        java.lang.String str20 = course1.getCourseId();
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass21 = textbookList20.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = facultyClientList16.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = facultyClientList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
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
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        java.lang.String str26 = course1.getCourseId();
        items.Textbook textbook27 = null;
        course1.addTextbook(textbook27);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass20 = textbookList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
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
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
        java.lang.Class<?> wildcardClass15 = facultyClientList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
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
        java.lang.String str18 = course1.getCourseId();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass23 = textbookList22.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
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
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
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
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
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
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
        java.lang.String str11 = course1.getCourseId();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass15 = textbookList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
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
        java.lang.String str14 = course1.getCourseId();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = facultyClientList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.String str20 = course1.getCourseId();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
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
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
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
        java.lang.String str23 = course1.getCourseId();
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
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
        login.FacultyClient facultyClient29 = null;
        course1.addFaculty(facultyClient29);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList25);
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
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
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
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
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass10 = textbookList9.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass15 = textbookList14.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
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
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
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
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass13 = textbookList12.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.String str22 = course1.getCourseId();
        java.lang.String str23 = course1.getCourseId();
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass17 = textbookList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.Class<?> wildcardClass23 = facultyClientList22.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.lang.String str8 = course1.getCourseId();
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
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
        java.util.List<items.Textbook> textbookList28 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList29 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(textbookList28);
        org.junit.Assert.assertNotNull(textbookList29);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        items.Textbook textbook25 = null;
        course1.addTextbook(textbook25);
        java.lang.Class<?> wildcardClass27 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
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
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
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
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
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
        java.lang.Class<?> wildcardClass23 = course1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
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
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
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
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = textbookList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
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
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(textbookList25);
        org.junit.Assert.assertNotNull(facultyClientList26);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
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
        java.lang.String str17 = course1.getCourseId();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
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
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
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
        java.lang.String str12 = course1.getCourseId();
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
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
        java.lang.String str24 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.String str10 = course1.getCourseId();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
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
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }
}

