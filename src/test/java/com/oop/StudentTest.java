package com.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void testUpdateGrade() {

        // Arrange
        Student student = new Student();
        student.grade = 50;

        // Act
        student.updateGrade(80);

        // Assert
        assertEquals(80, student.grade);
    }

    @Test
    void testInvalidGrade() {

        // Arrange
        Student student = new Student();
        student.grade = 50;

        // Act
        student.updateGrade(120);

        // Assert
        assertEquals(50, student.grade);
    }
}