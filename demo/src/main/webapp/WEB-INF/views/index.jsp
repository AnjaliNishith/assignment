<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./searchByZipCode" id="demoForm">
Enter Zip Code : <input type="text" name="zip"><br><br>
<input type="submit" value="Search">
</form>
<div id="displayDiv" style="display:none"><h3>JSON Data returned from Server after processing</h3>
		<div id="processedData"></div>
	</div>
<script>
	jQuery(document).ready(function($) {
 
		$("#submit").click(function(){
			
			
			
			$.ajax({
				type : "GET",
				contentType : "application/json",
				url : "searchByZipCode",
				
				dataType : 'json',				
				success : function(data) {
					$('#processedData').html(JSON.stringify(data));
					$('#displayDiv').show();
				}
			});
		});
 
	});
</script>	
 

</body>
</html>