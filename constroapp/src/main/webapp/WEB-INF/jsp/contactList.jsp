<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
	<h1 align="center">Customer List</h1>
	<form action="">
		<table border="1" align="center">
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
			<c:forEach var="re" items="${res}">
				<tr>
					<td>${re.customerName}</td>
					<td>${re.customerMobileNo }</td>
					<td>${re.customerAddress }</td>
					<td>${re.customerPincode }</td>
					
					<td>${re.customerSubject}</td>
					<td>${re.customerMessage }</td>
					<td>${re.status }</td>
					<td>${re.customerContactCreateDate }</td>
					<td><a href="get_doctors_data_byid/{status}?status=${re.status } ">View</a></td>
					<td><a href="get_update_doctors_data_byid/{status}?status=${re.status }">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>
