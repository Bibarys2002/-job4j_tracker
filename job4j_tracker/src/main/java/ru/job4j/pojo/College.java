package ru.job4j.pojo;
import java.util.Date;
import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Petr Arsentev");
        student.setGroup(1);
        student.setEnterDate(new Date());

        System.out.println(student.getName() + " belongs to group - " + student.getGroup() + " and entered the date " + student.getEnterDate());
    }
}
