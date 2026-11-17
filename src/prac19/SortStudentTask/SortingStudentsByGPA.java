package prac19.SortStudentTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA {
    private ArrayList<Student> iDNumber = new ArrayList();
    public static void main(String[] args) {
        SortingStudentsByGPA ss = new SortingStudentsByGPA();
        ss.setArray(new ArrayList<>(List.of(
                new Student("Иван", "Иванов", "Информатика", 1, "ИВТ-1", 78),
                new Student("Пётр", "Петров", "Математика", 2, "МАТ-2", 91),
                new Student("Анна", "Смирнова", "Физика", 3, "ФИЗ-1", 65),
                new Student("Мария", "Кузнецова", "Химия", 1, "ХИМ-3", 88),
                new Student("Алексей", "Попов", "Биология", 4, "БИО-2", 54),
                new Student("Дарья", "Васильева", "Экономика", 2, "ЭКО-1", 72),
                new Student("Сергей", "Соколов", "Юриспруденция", 3, "ЮРД-4", 95),
                new Student("Екатерина", "Михайлова", "История", 1, "ИСТ-2", 81),
                new Student("Николай", "Новиков", "Философия", 4, "ФИЛ-1", 60),
                new Student("Ольга", "Фёдорова", "Лингвистика", 2, "ЛИН-3", 47),
                new Student("Дмитрий", "Морозов", "Психология", 3, "ПСИ-2", 83),
                new Student("Татьяна", "Волкова", "Социология", 1, "СОЦ-1", 69),
                new Student("Андрей", "Лебедев", "Журналистика", 4, "ЖУР-4", 90),
                new Student("Елена", "Семёнова", "Искусство", 2, "ИСК-2", 58),
                new Student("Максим", "Егоров", "Инженерия", 3, "ИНЖ-3", 76),
                new Student("Светлана", "Павлова", "Медицина", 1, "МЕД-1", 64),
                new Student("Артём", "Козлов", "Архитектура", 4, "АРХ-2", 87),
                new Student("Юлия", "Степанова", "Дизайн", 2, "ДИЗ-3", 52),
                new Student("Роман", "Орлов", "Программирование", 3, "ПРО-1", 99),
                new Student("Ксения", "Никитина", "Бухгалтерия", 1, "БУХ-4", 70)
        )));
        System.out.println(ss.quicksort(ss.getiDNumber(), StudentComparator.byScoreDesc()));
        System.out.println(ss.mergeSort(ss.getiDNumber(), StudentComparator.byGroup()));
        ArrayList<Student> group1 = new ArrayList<>(List.of(
                new Student("Иван", "Иванов", "Информатика", 1, "ИВТ-1", 78),
                new Student("Пётр", "Петров", "Математика", 2, "МАТ-2", 91),
                new Student("Анна", "Смирнова", "Физика", 3, "ФИЗ-1", 65),
                new Student("Мария", "Кузнецова", "Химия", 1, "ХИМ-3", 88),
                new Student("Алексей", "Попов", "Биология", 4, "БИО-2", 54),
                new Student("Дарья", "Васильева", "Экономика", 2, "ЭКО-1", 72),
                new Student("Сергей", "Соколов", "Юриспруденция", 3, "ЮРД-4", 95),
                new Student("Екатерина", "Михайлова", "История", 1, "ИСТ-2", 81),
                new Student("Николай", "Новиков", "Философия", 4, "ФИЛ-1", 60),
                new Student("Ольга", "Фёдорова", "Лингвистика", 2, "ЛИН-3", 47)
        ));

        ArrayList<Student> group2 = new ArrayList<>(List.of(
                new Student("Дмитрий", "Морозов", "Психология", 3, "ПСИ-2", 83),
                new Student("Татьяна", "Волкова", "Социология", 1, "СОЦ-1", 69),
                new Student("Андрей", "Лебедев", "Журналистика", 4, "ЖУР-4", 90),
                new Student("Елена", "Семёнова", "Искусство", 2, "ИСК-2", 58),
                new Student("Максим", "Егоров", "Инженерия", 3, "ИНЖ-3", 76),
                new Student("Светлана", "Павлова", "Медицина", 1, "МЕД-1", 64),
                new Student("Артём", "Козлов", "Архитектура", 4, "АРХ-2", 87),
                new Student("Юлия", "Степанова", "Дизайн", 2, "ДИЗ-3", 52),
                new Student("Роман", "Орлов", "Программирование", 3, "ПРО-1", 99),
                new Student("Ксения", "Никитина", "Бухгалтерия", 1, "БУХ-4", 70)
        ));

        System.out.println("Список 1");
        System.out.println(group1);
        System.out.println("Список 2");
        System.out.println(group2);

        ArrayList<Student> merged = ss.mergeList(group1, group2, StudentComparator.byScoreDesc());
        System.out.println("Объединённый список");
        System.out.println(merged);
        try {
            System.out.println(ss.findStudent("Дмитрий", "Морозов", merged));
            System.out.println("Поиск успешно совершён");
        }catch (StudentNotFoundException e){
            System.out.println("Произошла ошибка " + e.getMessage());
        }
    }
    public ArrayList<Student> getiDNumber() {
        return iDNumber;
    }

    public void setArray(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }
    public void addElement(Student s){
        iDNumber.add(s);
    }
    public ArrayList<Student> quicksort(ArrayList<Student> list, Comparator<Student> cmp){
        if(list.size() <= 1){
            return list;
        }
        Student pivot = list.get(list.size() / 2);
        ArrayList<Student> big = new ArrayList<Student>();
        ArrayList<Student> small = new ArrayList<Student>();
        ArrayList<Student> equal = new ArrayList<Student>();
        for(Student s: list){
            if (cmp.compare(s, pivot) > 0){
                big.add(s);
            }else if (cmp.compare(s, pivot) < 0){
                small.add(s);
            }else{
                equal.add(s);
            }
        }
        ArrayList<Student> result = new ArrayList<Student>();
        result.addAll(quicksort(small, cmp));
        result.addAll(equal);
        result.addAll(quicksort(big, cmp));
        return result;
    }
    public ArrayList<Student> mergeSort(ArrayList<Student> list, Comparator<Student> cmp) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        ArrayList<Student> left = new ArrayList<Student>(list.subList(0, mid));
        ArrayList<Student> right = new ArrayList<Student>(list.subList(mid, list.size()));
        ArrayList<Student> leftSorted = mergeSort(left, cmp);
        ArrayList<Student> rightSorted = mergeSort(right, cmp);
        return merge(leftSorted, rightSorted, cmp);
    }
    public ArrayList<Student> merge(ArrayList<Student> leftSorted, ArrayList<Student> rightSorted, Comparator<Student> cmp){
        int i = 0;
        int j = 0;
        ArrayList<Student> result = new ArrayList<Student>();
        while (i < leftSorted.size() && j < rightSorted.size()) {
            if (cmp.compare(leftSorted.get(i), rightSorted.get(j)) <= 0) {
                result.add(leftSorted.get(i));
                i++;
            } else {
                result.add(rightSorted.get(j));
                j++;
            }
        }
        while (i < leftSorted.size()){
            result.add(leftSorted.get(i));
            i++;
        }
        while (j < rightSorted.size()){
            result.add(rightSorted.get(j));
            j++;
        }
        return result;
    }
    public void outArray(){
        System.out.println(iDNumber);
    }
    public ArrayList<Student> mergeList(ArrayList<Student> s1, ArrayList<Student> s2, Comparator<Student> cmp){
        ArrayList<Student> result = new ArrayList<Student>(s1.size() +s2.size());
        result.addAll(s1);
        result.addAll(s2);
        return quicksort(result, cmp);
    }
    public List<Student> findStudent(String name, String surname, List<Student> list){
        Student findStudent = new Student(name, surname);
        ArrayList<Student> findStudents = new ArrayList<Student>();
        for (Student s: list){
            if(s.equals(findStudent)){
                findStudents.add(s);
            }
        }
        if(findStudents.isEmpty()) {
            throw new StudentNotFoundException("Студент в списке не найденн");
        }
        return findStudents;
    }
}
