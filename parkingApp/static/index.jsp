<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vehicle Register Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>

    <h2>
        Register Form
    </h2>

    <form action="register" method="post">
        <label for="name">Name : </label>
        <input type="text" placeholder="Enter your name" name="name" id="name">
        <br><br>

        <label for="surname">SurName : </label>
        <input type="text" placeholder="Enter your surname" name="surname" id="surname">
        <br><br>

        <label for="email">Email : </label>
        <input type="email" placeholder="Enter your email" name="email" id="email">
        <br><br>

        <label for="phoneNumber">PhoneNumber : </label>
        <input type="number" placeholder="Enter your phoneNumber" name="phoneNumber" id="phoneNumber">
        <br><br>

        <label for="vehicleNumber">vehicleNumber : </label>
        <input type="text" placeholder="Enter your vehicleNumber" name="vehicleNumber" id="vehicleNumber">
        <br><br>

        <button type="submit">Submit</button>
    </form>

</body>
</html>