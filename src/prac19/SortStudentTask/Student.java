package prac19.SortStudentTask;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private String speciality;
    private int well;
    private String group;
    private int score;

    public Student(String name, String surname, String speciality, int well, String group, int score) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.well = well;
        this.group = group;
        this.score = score;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getWell() {
        return well;
    }

    public void setWell(int well) {
        this.well = well;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    @Override
    public String toString(){
        return "Студент " + name + " " + surname + " Специальность " + speciality + " Курс " + well + " группа " + group + " балл " + score + " ";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName())
                && Objects.equals(getSurname(), student.getSurname());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getGroup(), getName(), getScore(), getSpeciality(), getSurname(), getWell());
    }
}
