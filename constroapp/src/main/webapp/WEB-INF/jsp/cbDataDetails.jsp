
<!-- <!DOCTYPE html> -->  
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBE Details</title>
<h4 style="color: red">Welcome Mr. ${userName}</h4>

<br>
<br>





</head>
<form action="getContactDetails" method="get">
<table>
<td><center><select name="st">
                 <option value="No">No</option>
                 <option value="Going">Going</option>
                 <option value="Completed">Completed</option>
                 </select>
                 </center>
    </td>
      <div class="table-responsive">
									<p id="demo"></p>
								</div>
<div align="center">
							<button type="submit" onclick="getContactDetails()"
								class="btn btn-success" style="align-content: center;">Send
								Message</button>
						</div>
						</table> 
</form>
<body>









</html>