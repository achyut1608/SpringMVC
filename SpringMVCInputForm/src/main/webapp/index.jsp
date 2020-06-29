<html>
	<head>
		<title>Index page</title>
		<script type="text/javascript">
		
			function clearButton(){
				
				var name = document.getElementById("txtName").value='';
				var pass = document.getElementById("txtPassword").value='';
				
				
			}
		</script>
	</head>
	<body>
		<h2>Hello World!</h2>
		<form action="controller">
			<table cellpadding=1 cellspacing=1" align="center">
				<input type="text" id="txtName" name="txtName" placeholder="Enter name"/>
				<input type="text" id="txtPassword" name="txtPassword" placeholder="Enter Password"/>
				<input type="submit" id="btnSubmit" name="btnSubmit" value="Submit"/>
				<input type="button" id="btnClear" name="btnClear" value="Clear" onclick="clearButton();"/>
			</table>
		</form>
	</body>
</html>
