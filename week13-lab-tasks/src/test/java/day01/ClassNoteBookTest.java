package day01;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ClassNoteBookTest {

    @Test
    void testAddStudent() {
        ClassNoteBook classNoteBook = new ClassNoteBook();

        Student s = new Student(1,"John");
        classNoteBook.addStudent(s);

        assertTrue(classNoteBook.getNotebook().keySet().contains(s));
        assertEquals(0,classNoteBook.getNotebook().get(s).size());
    }

    @Test
    void testAddStudentInOrder(){
        ClassNoteBook classNoteBook = new ClassNoteBook();

        Student s = new Student(1,"John");
        Student s2 = new Student(3,"John");
        Student s3 = new Student(2,"John");
        classNoteBook.addStudent(s);
        classNoteBook.addStudent(s2);
        classNoteBook.addStudent(s3);

        int i = 1;
        for(Map.Entry<Student, List<Integer>> actual: classNoteBook.getNotebook().entrySet()){
            assertEquals(i,actual.getKey().getId());
            i++;
        }
    }

    @Test
    void testAddMark(){
        ClassNoteBook classNoteBook = new ClassNoteBook();

        Student s = new Student(1,"John");
        Student s2 = new Student(3,"John");
        Student s3 = new Student(2,"John");
        classNoteBook.addStudent(s);
        classNoteBook.addStudent(s2);
        classNoteBook.addStudent(s3);

        classNoteBook.addMark(2,5);
        assertEquals(5,classNoteBook.getNotebook().get(s3).get(0));
    }
}