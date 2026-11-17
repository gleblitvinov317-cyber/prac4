package prac19.SortStudentTask;

import java.util.Comparator;

public final class StudentComparator {
    public static Comparator<Student> byScoreDesc(){
        return Comparator.comparingInt(Student::getScore).reversed();
    }
    public static Comparator<Student> byScore(){
        return Comparator.comparingInt(Student::getScore);
    }
    public static Comparator<Student> byName(){
        return Comparator.comparing(Student::getName);
    }
    public static Comparator<Student> bySurname(){
        return Comparator.comparing(Student::getSurname);
    }
    public static Comparator<Student> byGroup(){
        return Comparator.comparing(Student::getGroup);
    }
    public static Comparator<Student> bySpeciality(){
        return Comparator.comparing(Student::getSpeciality);
    }
    public static Comparator<Student> byCourse(){
        return Comparator.comparingInt(Student::getWell);
    }
}
