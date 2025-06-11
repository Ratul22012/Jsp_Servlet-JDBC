<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Submission</title>
</head>
<body>
<h2>Fill out the form</h2>
<form action="hello-servlet" method="post">
    Name: <input type="text" name="name" required><br><br>
    Father's Name: <input type="text" name="fatherName" required><br><br>
    Mother's Name: <input type="text" name="motherName" required><br><br>
    Address: <input type="text" name="address" required><br><br>
    Age: <input type="number" name="age" min="1" required><br><br>

    Marital Status:
    <select name="maritalStatus" required>
        <option value="">--Select--</option>
        <option>Single</option>
        <option>Married</option>
    </select><br><br>

    Blood Group:
    <select name="bloodGroup" required>
        <option value="">--Select--</option>
        <option>A+</option>
        <option>A-</option>
        <option>B+</option>
        <option>B-</option>
        <option>O+</option>
        <option>O-</option>
        <option>AB+</option>
        <option>AB-</option>
    </select><br><br>

    Religion: <input type="text" name="religion" required><br><br>
    Nationality: <input type="text" name="nationality" required><br><br>
    Educational Qualification: <input type="text" name="education" required><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
