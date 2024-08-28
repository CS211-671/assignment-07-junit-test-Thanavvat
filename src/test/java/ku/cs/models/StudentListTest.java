package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void addNewStudent() {
        StudentList list = new StudentList();
        list.addNewStudent("61xxxxx1", "One");

        Student std = list.findStudentById("61xxxxx1");
        assertEquals("One", std.getName());
    }

    @Test
    void findStudentById() {
        StudentList list = new StudentList();
        list.addNewStudent("61xxxxx1", "One");
        list.addNewStudent("61xxxxx2", "Two");
        list.addNewStudent("61xxxxx3", "Three");

        Student std = list.findStudentById("61xxxxx3");
        assertEquals("Three", std.getName());
    }

    @Test
    void giveScoreToId() {
        StudentList list = new StudentList();
        list.addNewStudent("61xxxxx1", "One");
        list.addNewStudent("61xxxxx2", "Two");
        list.addNewStudent("61xxxxx3", "Three");

        // GiveScore
        list.giveScoreToId("61xxxxx2", 55.25);

        Student std = list.findStudentById("61xxxxx2");
        assertEquals(55.25, std.getScore());
    }

    @Test
    void viewGradeOfId() {
        StudentList list = new StudentList();
        list.addNewStudent("61xxxxx1", "One", 80);
        list.addNewStudent("61xxxxx2", "Two", 70);
        list.addNewStudent("61xxxxx3", "Three", 55);

        String grade = list.viewGradeOfId("61xxxxx2");
        assertEquals("B", grade);
    }
}