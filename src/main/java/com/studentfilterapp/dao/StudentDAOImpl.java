package com.studentfilterapp.dao;

import com.studentfilterapp.model.Student;
import com.studentfilterapp.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM students";

        try (Connection connection = DBConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setEnglish(rs.getInt("english"));
                student.setMaths(rs.getInt("maths"));
                student.setScience(rs.getInt("science"));
                student.setSocialScience(rs.getInt("socialScience"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}
