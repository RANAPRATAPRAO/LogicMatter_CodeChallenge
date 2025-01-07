<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/styles.css">
    <script src="../js/main.js" defer></script>
    <title>Student Scores</title>
</head>
<body>
    <h1>Student Scores</h1>
    <form id="filter-form">
        <label for="subject">Select Subject:</label>
        <select id="subject" name="subject">
            <option value="English">English</option>
            <option value="Maths">Maths</option>
            <option value="Science">Science</option>
            <option value="SocialScience">Social Science</option>
        </select>

        <label>
            <input type="radio" name="condition" value="Above"> Above
        </label>
        <label>
            <input type="radio" name="condition" value="Below"> Below
        </label>
        <label>
            <input type="radio" name="condition" value="Between"> Between
        </label>

        <input type="text" id="filter-value-1" placeholder="Value 1">
        <input type="text" id="filter-value-2" placeholder="Value 2 (if between)">
        <button type="button" id="filter-btn">Filter</button>
        <button type="reset" id="clear-btn">Clear</button>
    </form>

    <div id="table-container"></div>
</body>
</html>
