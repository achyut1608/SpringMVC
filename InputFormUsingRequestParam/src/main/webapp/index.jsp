<html>
<head>
	<script type="text/javascript">
		function clearText(){
			var name = document.getElementById("txtName").value='';
			var password = document.getElementById("txtPassword").value='';
		}
	</script>
</head>
	<body>
		<h2>Hello World!</h2>
		<form action="controller">
			<table>
				<tr>
					<td>
						<input type="text" id="txtName" name="txtName" placeholder="enter username"/>
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" id="txtPassword" name="txtPassword" placeholder="Enter Password"/>
					</td>
				</tr>
				<tr>
					<td>
						<table>
							<tr>
								<td>
									<input type="submit" name="btnSubmit" value="btnSubmit"/>
								</td>
								<td>
									<input type="button" name="btnClear" value="Clear" onclick="clearText();" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
