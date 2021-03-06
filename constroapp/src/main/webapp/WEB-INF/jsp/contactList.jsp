<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Construction Bazaar - CustomerDetails</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>CUSTOMER DETAILS</h2>
  <table class="table">
    <thead>
      <tr>
        <th>Name</th>
				<th>MobileNo</th>  
				<th>Address</th>
				<th>Pincode</th>
				
				<th>Subject</th>
				<th>Message</th>
				<th>Status</th>
				<th>Submited Date</th>
				<th>View</th>
				<th>Edit</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach var="re" items="${res}">
				<tr  class="success">
					<td>${re.customerName}</td>
					<td>${re.customerMobileNo }</td>
					<td>${re.customerAddress }</td>
					<td>${re.customerPincode }</td>
					
					<td>${re.customerSubject}</td>
					<td>${re.customerMessage }</td>
					<td>${re.status }</td>
					<td>${re.customerContactCreateDate }</td>
					<td><a href="get_updateList?id=${re.id } ">View</a></td>
					<td><a href="delete_customer?id=${re.id }">Delete</a></td>
				</tr>
			</c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>

