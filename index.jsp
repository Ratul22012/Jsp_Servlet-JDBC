<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Submission</title>
</head>
<body>
<h2>Fill out the form</h2>
<form action="hello-servlet" method="post">
    Name: <input type="text" name="name"><br><br>
    Father's Name: <input type="text" name="fatherName"><br><br>
    Mother's Name: <input type="text" name="motherName"><br><br>
    Address: <input type="text" name="address"><br><br>
    Age: <input type="number" name="age"><br><br>
    Marital Status:
    <select name="maritalStatus">
        <option>Single</option>
        <option>Married</option>
    </select><br><br>
    Blood Group:
    <select name="bloodGroup">
        <option>A+</option>
        <option>A-</option>
        <option>B+</option>
        <option>B-</option>
        <option>O+</option>
        <option>O-</option>
        <option>AB+</option>
        <option>AB-</option>
    </select><br><br>
    Religion: <input type="text" name="religion"><br><br>
    Nationality: <input type="text" name="nationality"><br><br>
    Educational Qualification: <input type="text" name="education"><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
