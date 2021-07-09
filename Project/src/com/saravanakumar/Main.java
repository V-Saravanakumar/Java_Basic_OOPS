package com.saravanakumar;

import java.time.Year;
import java.util.Scanner;

public class Main {
    int StudentID,YearofEngg;
    String Name; char residential_status;
    float qualifyingExamMarks;

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public void getStudentID() {
        System.out.println("Student ID: " + StudentID);
    }

    public void setName(String name) {
        Name = name;
    }

    public void getName() {
        System.out.println("Student Name: " + Name);
    }

    public void setQualifyingExamMarks(float QualifyingExamMarks) {
        qualifyingExamMarks = QualifyingExamMarks;
    }

    public void getQualifyingExamMarks() {
        System.out.println("Qualifying Exam Marks: " + qualifyingExamMarks);
    }

    public void setResidential_status(char Residential_status) {
        residential_status = Residential_status;
    }

    public void getResidential_status() {
        System.out.println("Residential status: " + residential_status);
    }

    public void setYearofEngg(int yearofEngg) {
        YearofEngg = yearofEngg;
    }

    public void getYearofEngg() {
        System.out.println("Year of Engineering: " + YearofEngg);
    }

    public static void main(String[] args) {
        Main S = new Main();
        S.setStudentID(1001);
        S.setName("Jacob");
        S.setQualifyingExamMarks(80);
        S.setYearofEngg(3);
        S.setResidential_status('H');
        S.getName();
        S.getStudentID();
        S.getQualifyingExamMarks();
        S.getResidential_status();
        S.getYearofEngg();
    }
}
