
<html>
<head>

<title>Contact form</title>

</head>
<body>
<h1>User Contact Form</h1>

<form method="post" action="savecontact">

<label for="name" >Name:</label>
<input type="text" name="firstname">
<input type="text" name="lastname">
<br>
<br>

<label for="email">Email:</label>
<input type="email" name="email" >
<br>
<br>

<label for="Department">Department:</label>

<input type="radio" name="rd_1" value="sales" />
<label for="Department">Sales</label><br>

<input type="radio" name="rd_1" value="marketing" />
<label for="Department">Marketing</label><br>

<input type="radio" name="rd_1" value="customersupport">
<label for="Department">Customer Support</label><br>

<input type="radio" name="rd_1" value="others" >
<label for="Department">Others</label>
<br>
<br>
<label for="Message">Message:</label>
<input type="text" name="message">
<br><br>
<input type="submit" name="submit" value="submit" class="submit-button" >

</form>

</body>
</html>