package courseAutoTest;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = textbookList15.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        java.lang.Class<?> wildcardClass12 = facultyClientList11.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        login.FacultyClient facultyClient26 = null;
        course1.addFaculty(facultyClient26);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(textbookList25);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        java.util.List<login.FacultyClient> facultyClientList27 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList28 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(facultyClientList27);
        org.junit.Assert.assertNotNull(textbookList28);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        java.lang.String str13 = course1.getCourseId();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        java.lang.String str26 = course1.getCourseId();
        java.lang.String str27 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.Class<?> wildcardClass9 = facultyClientList8.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        java.lang.String str17 = course1.getCourseId();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.lang.String str5 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        java.util.List<items.Textbook> textbookList27 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass28 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(textbookList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
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
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
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
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.String str11 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
        java.lang.Class<?> wildcardClass25 = course1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.lang.String str19 = course1.getCourseId();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass10 = textbookList9.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = textbookList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        java.lang.Class<?> wildcardClass16 = textbookList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
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
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        java.lang.String str27 = course1.getCourseId();
        java.lang.String str28 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList25);
        org.junit.Assert.assertNotNull(facultyClientList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.Class<?> wildcardClass13 = facultyClientList12.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        java.lang.Class<?> wildcardClass15 = textbookList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        java.lang.Class<?> wildcardClass20 = textbookList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.String str23 = course1.getCourseId();
        items.Textbook textbook24 = null;
        course1.addTextbook(textbook24);
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
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass15 = textbookList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        java.lang.String str17 = course1.getCourseId();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        java.lang.String str16 = course1.getCourseId();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
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
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
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
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass14 = textbookList13.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
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
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
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
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.lang.String str12 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        java.lang.String str12 = course1.getCourseId();
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.Class<?> wildcardClass13 = facultyClientList12.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.lang.String str8 = course1.getCourseId();
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.Class<?> wildcardClass13 = facultyClientList12.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        java.lang.String str25 = course1.getCourseId();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        java.lang.String str12 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = facultyClientList11.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        java.lang.String str19 = course1.getCourseId();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass15 = textbookList14.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.Class<?> wildcardClass15 = facultyClientList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
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
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        java.lang.String str22 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
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
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.Class<?> wildcardClass9 = facultyClientList8.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass20 = textbookList19.getClass();
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
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.String str16 = course1.getCourseId();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        java.lang.Class<?> wildcardClass12 = facultyClientList11.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        java.lang.String str22 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.Class<?> wildcardClass22 = facultyClientList21.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
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
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        java.lang.String str23 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.Class<?> wildcardClass22 = facultyClientList21.getClass();
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
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.Class<?> wildcardClass9 = facultyClientList8.getClass();
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass20 = textbookList19.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.lang.String str22 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        login.FacultyClient facultyClient32 = null;
        course1.addFaculty(facultyClient32);
        items.Textbook textbook34 = null;
        course1.addTextbook(textbook34);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(textbookList24);
        org.junit.Assert.assertNotNull(facultyClientList25);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
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
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        java.lang.Class<?> wildcardClass12 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        java.lang.Class<?> wildcardClass10 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.lang.String str6 = course1.getCourseId();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.Class<?> wildcardClass15 = facultyClientList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.lang.String str10 = course1.getCourseId();
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.lang.String str18 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.lang.String str13 = course1.getCourseId();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.lang.String str24 = course1.getCourseId();
        java.lang.String str25 = course1.getCourseId();
        java.lang.Class<?> wildcardClass26 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
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
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.lang.Class<?> wildcardClass8 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass5 = textbookList4.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        java.lang.String str27 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        java.lang.String str11 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        java.util.List<items.Textbook> textbookList24 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList24);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.lang.Class<?> wildcardClass10 = facultyClientList9.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        java.lang.String str24 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
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
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        items.Textbook textbook23 = null;
        course1.addTextbook(textbook23);
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
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = facultyClientList13.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        java.lang.String str20 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
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
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.String str12 = course1.getCourseId();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList4);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        java.lang.String str17 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        java.lang.String str19 = course1.getCourseId();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.lang.String str24 = course1.getCourseId();
        login.FacultyClient facultyClient25 = null;
        course1.addFaculty(facultyClient25);
        java.lang.String str27 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(textbookList22);
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        java.lang.Class<?> wildcardClass13 = textbookList12.getClass();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        java.lang.Class<?> wildcardClass25 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        java.lang.String str15 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.lang.String str6 = course1.getCourseId();
        java.lang.Class<?> wildcardClass7 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        java.lang.Class<?> wildcardClass22 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        java.lang.String str13 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        login.Course course1 = new login.Course("");
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
        java.lang.String str14 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        java.util.List<items.Textbook> textbookList14 = course1.getTextbooks();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        java.lang.String str16 = course1.getCourseId();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        login.Course course1 = new login.Course("");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.lang.String str7 = course1.getCourseId();
        login.FacultyClient facultyClient8 = null;
        course1.addFaculty(facultyClient8);
        java.util.List<items.Textbook> textbookList10 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList11 = course1.getFaculties();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        java.lang.Class<?> wildcardClass15 = facultyClientList14.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
        java.lang.Class<?> wildcardClass13 = facultyClientList12.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.Class<?> wildcardClass9 = facultyClientList8.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.util.List<login.FacultyClient> facultyClientList24 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList24);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.lang.String str4 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList5 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.lang.String str8 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.lang.String str17 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
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
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList23);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.lang.String str6 = course1.getCourseId();
        java.lang.String str7 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(facultyClientList8);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
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
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.util.List<items.Textbook> textbookList20 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList20);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        java.lang.String str17 = course1.getCourseId();
        java.lang.String str18 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        java.lang.String str20 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        java.lang.String str14 = course1.getCourseId();
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        login.FacultyClient facultyClient17 = null;
        course1.addFaculty(facultyClient17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList7);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        java.lang.String str11 = course1.getCourseId();
        items.Textbook textbook12 = null;
        course1.addTextbook(textbook12);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.Class<?> wildcardClass17 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        java.lang.String str10 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList22 = course1.getFaculties();
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
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(facultyClientList22);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        java.lang.Class<?> wildcardClass18 = textbookList17.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass12 = textbookList11.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        items.Textbook textbook21 = null;
        course1.addTextbook(textbook21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        java.util.List<login.FacultyClient> facultyClientList25 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList25);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.lang.String str17 = course1.getCourseId();
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
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        java.lang.String str22 = course1.getCourseId();
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        login.FacultyClient facultyClient23 = null;
        course1.addFaculty(facultyClient23);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        java.lang.String str20 = course1.getCourseId();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(facultyClientList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        login.FacultyClient facultyClient7 = null;
        course1.addFaculty(facultyClient7);
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        java.lang.Class<?> wildcardClass21 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList9);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.lang.String str14 = course1.getCourseId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        java.lang.Class<?> wildcardClass17 = textbookList16.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.lang.String str6 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass8 = textbookList7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        java.lang.String str18 = course1.getCourseId();
        items.Textbook textbook19 = null;
        course1.addTextbook(textbook19);
        java.util.List<items.Textbook> textbookList21 = course1.getTextbooks();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.lang.String str10 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(textbookList11);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        login.FacultyClient facultyClient12 = null;
        course1.addFaculty(facultyClient12);
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.lang.String str21 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.String str15 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        java.lang.String str21 = course1.getCourseId();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        items.Textbook textbook14 = null;
        course1.addTextbook(textbook14);
        java.lang.Class<?> wildcardClass16 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        java.lang.Class<?> wildcardClass15 = textbookList14.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
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
        java.lang.String str25 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList26 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList27 = course1.getFaculties();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList26);
        org.junit.Assert.assertNotNull(facultyClientList27);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        java.lang.Class<?> wildcardClass20 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        login.FacultyClient facultyClient24 = null;
        course1.addFaculty(facultyClient24);
        items.Textbook textbook26 = null;
        course1.addTextbook(textbook26);
        login.FacultyClient facultyClient28 = null;
        course1.addFaculty(facultyClient28);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(textbookList21);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        items.Textbook textbook10 = null;
        course1.addTextbook(textbook10);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList9 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        items.Textbook textbook11 = null;
        course1.addTextbook(textbook11);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        java.lang.String str13 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        login.FacultyClient facultyClient19 = null;
        course1.addFaculty(facultyClient19);
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        login.Course course1 = new login.Course("hi!");
        java.lang.String str2 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(textbookList3);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        login.Course course1 = new login.Course("hi!");
        java.util.List<items.Textbook> textbookList2 = course1.getTextbooks();
        login.FacultyClient facultyClient3 = null;
        course1.addFaculty(facultyClient3);
        items.Textbook textbook5 = null;
        course1.addTextbook(textbook5);
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        java.util.List<items.Textbook> textbookList13 = course1.getTextbooks();
        java.lang.String str14 = course1.getCourseId();
        java.lang.String str15 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        items.Textbook textbook22 = null;
        course1.addTextbook(textbook22);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        java.lang.String str19 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList22 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList21);
        org.junit.Assert.assertNotNull(textbookList22);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.lang.String str18 = course1.getCourseId();
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        login.FacultyClient facultyClient15 = null;
        course1.addFaculty(facultyClient15);
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        java.lang.String str18 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList19 = course1.getTextbooks();
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(textbookList19);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        login.FacultyClient facultyClient5 = null;
        course1.addFaculty(facultyClient5);
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        items.Textbook textbook8 = null;
        course1.addTextbook(textbook8);
        java.util.List<login.FacultyClient> facultyClientList10 = course1.getFaculties();
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        items.Textbook textbook15 = null;
        course1.addTextbook(textbook15);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
        java.lang.String str18 = course1.getCourseId();
        java.lang.String str19 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        java.lang.String str15 = course1.getCourseId();
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.lang.String str8 = course1.getCourseId();
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        java.lang.String str13 = course1.getCourseId();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        java.lang.Class<?> wildcardClass13 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        java.lang.String str13 = course1.getCourseId();
        java.lang.Class<?> wildcardClass14 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        java.util.List<login.FacultyClient> facultyClientList21 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList21);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        java.util.List<login.FacultyClient> facultyClientList19 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(facultyClientList19);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList14 = course1.getFaculties();
        java.lang.String str15 = course1.getCourseId();
        java.lang.String str16 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(facultyClientList5);
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
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
        java.util.List<login.FacultyClient> facultyClientList20 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        java.util.List<items.Textbook> textbookList15 = course1.getTextbooks();
        java.lang.String str16 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        login.Course course1 = new login.Course("hi!");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        login.FacultyClient facultyClient4 = null;
        course1.addFaculty(facultyClient4);
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList7 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.util.List<items.Textbook> textbookList11 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList16);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList13);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        java.util.List<items.Textbook> textbookList16 = course1.getTextbooks();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList16);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        items.Textbook textbook16 = null;
        course1.addTextbook(textbook16);
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        items.Textbook textbook13 = null;
        course1.addTextbook(textbook13);
        java.lang.Class<?> wildcardClass15 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        java.lang.Class<?> wildcardClass18 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(facultyClientList17);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(textbookList15);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        login.FacultyClient facultyClient16 = null;
        course1.addFaculty(facultyClient16);
        java.util.List<items.Textbook> textbookList18 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        login.Course course1 = new login.Course("hi!");
        java.lang.String str2 = course1.getCourseId();
        items.Textbook textbook3 = null;
        course1.addTextbook(textbook3);
        java.lang.String str5 = course1.getCourseId();
        java.lang.String str6 = course1.getCourseId();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.lang.Class<?> wildcardClass8 = course1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        java.lang.Class<?> wildcardClass19 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        java.util.List<items.Textbook> textbookList17 = course1.getTextbooks();
        items.Textbook textbook18 = null;
        course1.addTextbook(textbook18);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList13);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(textbookList17);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        java.lang.Class<?> wildcardClass16 = facultyClientList15.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(textbookList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        java.lang.String str24 = course1.getCourseId();
        java.util.List<items.Textbook> textbookList25 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList26 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(textbookList25);
        org.junit.Assert.assertNotNull(textbookList26);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        login.Course course1 = new login.Course("hi!");
        items.Textbook textbook2 = null;
        course1.addTextbook(textbook2);
        java.util.List<login.FacultyClient> facultyClientList4 = course1.getFaculties();
        java.lang.String str5 = course1.getCourseId();
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        java.lang.Class<?> wildcardClass9 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList9 = course1.getFaculties();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        java.util.List<items.Textbook> textbookList12 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertNotNull(textbookList12);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        login.FacultyClient facultyClient21 = null;
        course1.addFaculty(facultyClient21);
        java.lang.Class<?> wildcardClass23 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertNotNull(textbookList16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        login.FacultyClient facultyClient20 = null;
        course1.addFaculty(facultyClient20);
        login.FacultyClient facultyClient22 = null;
        course1.addFaculty(facultyClient22);
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
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
        login.FacultyClient facultyClient18 = null;
        course1.addFaculty(facultyClient18);
        items.Textbook textbook20 = null;
        course1.addTextbook(textbook20);
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
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        login.FacultyClient facultyClient11 = null;
        course1.addFaculty(facultyClient11);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList10);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        java.lang.Class<?> wildcardClass19 = textbookList18.getClass();
        org.junit.Assert.assertNotNull(facultyClientList4);
        org.junit.Assert.assertNotNull(facultyClientList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        java.util.List<login.FacultyClient> facultyClientList13 = course1.getFaculties();
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        org.junit.Assert.assertNotNull(textbookList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList13);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        java.util.List<login.FacultyClient> facultyClientList23 = course1.getFaculties();
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(textbookList12);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(textbookList18);
        org.junit.Assert.assertNotNull(textbookList19);
        org.junit.Assert.assertNotNull(textbookList20);
        org.junit.Assert.assertNotNull(facultyClientList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<items.Textbook> textbookList3 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        java.util.List<login.FacultyClient> facultyClientList6 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList7 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList8 = course1.getFaculties();
        java.lang.String str9 = course1.getCourseId();
        login.FacultyClient facultyClient10 = null;
        course1.addFaculty(facultyClient10);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        login.FacultyClient facultyClient14 = null;
        course1.addFaculty(facultyClient14);
        java.lang.String str16 = course1.getCourseId();
        items.Textbook textbook17 = null;
        course1.addTextbook(textbook17);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textbookList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        java.util.List<login.FacultyClient> facultyClientList12 = course1.getFaculties();
        login.FacultyClient facultyClient13 = null;
        course1.addFaculty(facultyClient13);
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList12);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        java.util.List<login.FacultyClient> facultyClientList15 = course1.getFaculties();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(facultyClientList6);
        org.junit.Assert.assertNotNull(facultyClientList7);
        org.junit.Assert.assertNotNull(facultyClientList10);
        org.junit.Assert.assertNotNull(facultyClientList15);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        java.util.List<items.Textbook> textbookList6 = course1.getTextbooks();
        items.Textbook textbook7 = null;
        course1.addTextbook(textbook7);
        login.FacultyClient facultyClient9 = null;
        course1.addFaculty(facultyClient9);
        java.lang.String str11 = course1.getCourseId();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertNotNull(textbookList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        login.Course course1 = new login.Course("hi!");
        java.util.List<login.FacultyClient> facultyClientList2 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList3 = course1.getFaculties();
        items.Textbook textbook4 = null;
        course1.addTextbook(textbook4);
        items.Textbook textbook6 = null;
        course1.addTextbook(textbook6);
        java.lang.String str8 = course1.getCourseId();
        items.Textbook textbook9 = null;
        course1.addTextbook(textbook9);
        java.lang.Class<?> wildcardClass11 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(facultyClientList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        login.Course course1 = new login.Course("");
        login.FacultyClient facultyClient2 = null;
        course1.addFaculty(facultyClient2);
        java.util.List<items.Textbook> textbookList4 = course1.getTextbooks();
        java.util.List<items.Textbook> textbookList5 = course1.getTextbooks();
        login.FacultyClient facultyClient6 = null;
        course1.addFaculty(facultyClient6);
        java.util.List<items.Textbook> textbookList8 = course1.getTextbooks();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList5);
        org.junit.Assert.assertNotNull(textbookList8);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        java.util.List<items.Textbook> textbookList23 = course1.getTextbooks();
        java.lang.Class<?> wildcardClass24 = course1.getClass();
        org.junit.Assert.assertNotNull(facultyClientList2);
        org.junit.Assert.assertNotNull(textbookList3);
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(facultyClientList11);
        org.junit.Assert.assertNotNull(facultyClientList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(facultyClientList20);
        org.junit.Assert.assertNotNull(textbookList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(textbookList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
        java.util.List<login.FacultyClient> facultyClientList16 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList17 = course1.getFaculties();
        java.util.List<login.FacultyClient> facultyClientList18 = course1.getFaculties();
        org.junit.Assert.assertNotNull(textbookList4);
        org.junit.Assert.assertNotNull(textbookList7);
        org.junit.Assert.assertNotNull(facultyClientList8);
        org.junit.Assert.assertNotNull(textbookList11);
        org.junit.Assert.assertNotNull(facultyClientList14);
        org.junit.Assert.assertNotNull(facultyClientList15);
        org.junit.Assert.assertNotNull(facultyClientList16);
        org.junit.Assert.assertNotNull(facultyClientList17);
        org.junit.Assert.assertNotNull(facultyClientList18);
    }
}

