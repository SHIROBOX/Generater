package com.mycompany.generater.model;

import java.util.Objects;

/**
 *
 * @author mbk_i
 */
public class Student {

    private String id;
    private int score;

    public Student() {
    }

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        if (score >= 80) {
            return "A";
        } else if (score >= 70 && score < 80) {
            return "B";
        } else if (score >= 60 && score < 70) {
            return "C";
        } else if (score >= 50 && score < 60) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equals(this.id, other.id);
    }

}
