package com.hibernatetry.hibernatepractice.relations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Course {

    @Id
    private int courseId;

    private String name;

    @ManyToMany(mappedBy = "courses")
     private List<ClgStudent> students;

    public Course() {
        super();
    }

    public Course(int courseId, String name, List<ClgStudent> students) {
        super();
        this.courseId = courseId;
        this.name = name;
        this.students = students;
    }

    public Course(int courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClgStudent> getStudents() {
        return students;
    }

    public void setStudents(List<ClgStudent> students) {
        this.students = students;
    }
}
