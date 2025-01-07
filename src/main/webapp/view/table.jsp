<%@ page import="java.util.List"%>
<%@ page import="com.studentapp.model.Student"%>
<table border="1">
    <thead>
        <tr>
            <th>S.No</th>
            <th>Name</th>
            <th>English</th>
            <th>Maths</th>
            <th>Science</th>
            <th>Social Science</th>
        </tr>
    </thead>
    <tbody>
    <%
        List<Student> students = (List<Student>) request.getAttribute("students");
        for (Student student : students) {
    %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getName() %></td>
            <td><%= student.getEnglish() %></td>
            <td><%= student.getMaths() %></td>
            <td><%= student.getScience() %></td>
            <td><%= student.getSocialScience() %></td>
        </tr>
    <%
        }
    %>
    </tbody>
</table>
