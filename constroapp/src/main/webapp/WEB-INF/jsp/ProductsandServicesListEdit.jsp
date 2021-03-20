<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Construction Bazaar - Contact</title>
<meta content="" name="descriptison">
<meta content="" name="keywords">

<!-- Favicons -->
<link href="assets/img/favicon.png" rel="icon">
<link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
<link href="assets/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet">
<link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
<link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
<link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="assets/vendor/aos/aos.css" rel="stylesheet">
<link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">

<!-- Template Main CSS File -->
<link href="assets/js/main.js" rel="mainjs">

<link href="assets/css/style.css" rel="stylesheet">

<!-- =======================================================
  * Template Name: Company - v2.1.0
  * Template URL: https://bootstrapmade.com/company-free-html-bootstrap-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

	<!-- ======= Header ======= -->
	<header id="header" class="fixed-top">
		<div class="container d-flex align-items-center">

			<h1 class="logo mr-auto">
				<a href=""><span>Construction Bazaar</span></a>
			</h1>


		</div>
	</header>
	<!-- End Header -->

	<main id="main">


		<!-- ======= Contact Section ======= -->
		<br><br>

				<div class="row mt-5 justify-content-center" data-aos="fade-up">
					<div class="col-lg-10">
						<div id="error"></div>
						<div class="section-title">
							<h2>
								<strong>EDIT DETAILS</strong>
							</h2>
						</div>
						
<!-- 						<div class="form-group"> -->
<!-- 							<label for="email"><strong></strong></label> <input -->
<!-- 								type="hidden" class="form-control" name="Products" -->
<!-- 								id="Products"  value="CementProduct"></input> -->
<!-- 							<div class="validate"></div> -->
<!-- 						</div> -->
<!-- 						<div class="form-row"> -->
<!-- 							<div class="col-md-6 form-group"> -->
<!-- 								<label for="email"><strong>Name:</strong></label> <input -->
<%-- 									type="text" name="CustomerName" class="form-control" value="${res.customerName }" --%>
<!-- 									id ="CustomerName" data-rule="required" -->
<!-- 									data-msg="Please write your name" placeholder="Your Name" ></input> -->
<!-- 								<div class="validate"></div> -->
<!-- 							</div> -->
<!-- 							<div class="col-md-6 form-group"> -->
<!-- 								<label for="email"><strong>MobileNo:</strong></label> <input -->
<%-- 									type="text" class="form-control" name="CustomerMobileNo"  value="${res.customerMobileNo }" --%>
<!-- 									id="CustomerMobileNo" placeholder="Your MobileNo"></input> -->
<!-- 								<div class="validate"></div> -->
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						<div class="form-row"> -->
<!-- 							<div class="col-md-6 form-group"> -->
<!-- 								<label for="email"><strong>Address:</strong></label> <input -->
<%-- 									type="text" name="CustomerAddress" class="form-control"  value="${res.customerAddress }" --%>
<!-- 									id="CustomerAddress" placeholder="Your Address" -->
<!-- 									data-rule="required" data-msg="Please write your address"></input> -->
<!-- 								<div class="validate"></div> -->
<!-- 							</div> -->
<!-- 							<div class="col-md-6 form-group"> -->
<!-- 								<label for="email"><strong>PinCode:</strong></label> <input -->
<%-- 									type="text" class="form-control" name="CustomerPincode"  value="${res.customerPincode }" --%>
<!-- 									id="CustomerPincode" placeholder="Your PinCode" -->
<!-- 									data-rule="required" data-msg="Please write your pincode"></input> -->
<!-- 								<div class="validate"></div> -->
<!-- 							</div> -->
<!-- 						</div> -->


<!-- 						<div class="form-group"> -->
<!-- 							<label for="email"><strong>Subject:</strong></label> <input -->
<%-- 								type="text" class="form-control" name="CustomerSubject"  value="${res.customerSubject }" --%>
<!-- 								id="CustomerSubject" placeholder="Subject" data-rule="required" -->
<!-- 								data-msg="Please write something for uss"></input> -->
<!-- 							<div class="validate"></div> -->
<!-- 						</div> -->
						
						
						
						
<!-- 						<div class="form-group"> -->
<!-- 							<label for="email"><strong>Message:</strong></label> -->
<%-- 							<textarea class="form-control" name="CustomerMessage"  value="${res.customerMessage }" --%>
<!-- 								id="CustomerMessage" rows="5" data-rule="required" -->
<!-- 								data-msg="Please write something for us" placeholder="Message"></textarea> -->
<!-- 							<div class="validate"></div> -->
<!-- 						</div> -->




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

<form action="updateProductsandServicesDetails" method="post">
<div class="container">
  <h2>PRODUCTS AND SERVICES DETAILS</h2>
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
				
      </tr>
    </thead>
    <tbody>
     
				<tr><input type="hidden" name="id" value="${res.id}">
				
					<td>${res.customerName}</td>
					<td>${res.customerMobileNo }</td>
					<td>${res.customerAddress }</td>
					<td>${res.customerPincode }</td>
					
					<td>${res.customerSubject}</td>
					<td>${res.customerMessage }</td>
<%-- 					<td>${re.status }</td> --%>
					
					
					
<%-- 					<td><input type="text" name="item1" size=50 value="${res.status}"></td> --%>
    <td><center><select name=status>
                
                 <option value="No">No</option>
                 <option value="Going">Going</option>
                 <option value="Completed">Completed</option>
                 </select>
                 </center>
                 
                
    </td>
					<td>${res.customerContactCreateDate }</td>
<%-- 					<td><a href="get_updateList?status=${re.status } ">View</a></td> --%>
<%-- 					<td><a href="get_update_doctors_data_byid/{status}?status=${re.status }">Delete</a></td> --%>
				</tr>
    </tbody>
  </table>
  
  	<div align="center">
							<button type="submit" 
								class="btn btn-success" style="align-content: center;">Update Details
								</button>
						</div>
</div>
</form>
</body>
</html>










						<div class="mb-3">
							<div class="loading" align="center">


								<div class="loader" id="loader"></div>
							</div>
							<strong>
								<div align="center" id="successdemo" style="color: green;">
								</div>
							</strong> <strong>
								<div align="center" id="demo" style="color: red;"></div>
							</strong>
						</div>
						
						
						
						
<!-- 						<div align="center"> -->
<!-- 							<button type="submit"  -->
<!-- 								class="btn btn-success" style="align-content: center;">Update Details -->
<!-- 								</button> -->
<!-- 						</div> -->
						<div class="modal-footer">

							<!-- 													<button  onclick="enterContact()" -->
							<!-- 														class="btn btn-primary">Reschedule</button> -->
							<!-- 												</div> -->
						</div>

					</div>

				</div>
		</section>
		<!-- End Contact Section -->

	</main>


	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

	<!-- Vendor JS Files -->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
	<script src="assets/vendor/php-email-form/validate.js"></script>
	<script src="assets/vendor/jquery-sticky/jquery.sticky.js"></script>
	<script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script src="assets/vendor/venobox/venobox.min.js"></script>
	<script src="assets/vendor/waypoints/jquery.waypoints.min.js"></script>
	<script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
	<script src="assets/vendor/aos/aos.js"></script>

	<!-- Template Main JS File -->
	<script src="assets/js/main.js"></script>

</body>


<script>
	$('#loader').hide();

	function updatedDetailss(res) {
		
		alert("function");
		alert(res);
		var data = {
				
				product : $("#Products").val(),
			customerName : $("#CustomerName").val(),
			customerMobileNo : $("#CustomerMobileNo").val(),
			customerAddress : $("#CustomerAddress").val(),
			customerPincode : $("#CustomerPincode").val(),
			customerSubject : $("#CustomerSubject").val(),
			customerMessage : $("#CustomerMessage").val(),

		}
		$('#loader').show();
		var data2 = JSON.stringify()
		
		
		
		$
				.ajax({
					url : './updatedDetails',
					type : 'post',
					contentType : 'application/json',
					data : data2,

					success : function(data) {

						
						if (data == "success") {
							$('#demo').hide();
							$('#loader').hide();

							$('#successdemo').show();
							var txt = "Successfully Submited";

							document.getElementById("successdemo").innerHTML = txt;
							window.open("/constroapp/contact", "_self");
						} else {
							
							$('#demo').show();
							$('#loader').hide();
							$('#successdemo').hide();
							alert("Somthing Went To Wrong Please Try Again Once...");
							var txt = "Somthing Went To Wrong Please Try Again Once...";
							document.getElementById("demo").innerHTML = txt;

							//$('#demo').hide();
// 													window.open("/constroapp/contact", "_self");
						}
					}
				});
	}
</script>

</html>