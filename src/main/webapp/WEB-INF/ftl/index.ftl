<html>
<head>
	<title>Subset Sum by Rick S</title>
	<link rel="stylesheet" type="text/css" 	href="resources/css/subsetsum.css" />	
</head>
<body>
<div id="header">
<h2>
	Subset Sum
	</h2>
</div>

<div id="content">
   
  <fieldset>
  	<legend>Input data</legend>
    <@s.form action="runSubsetSum" method="post">
        <@s.textfield label="Input integers" name="data.input"/>
        <@s.submit value="Run Subset Sum"/>
    </@s.form>
  </fieldset>
  <br/>

  <table class="datatable">
  	<tr>
  		<th>Results</th>
  	</tr>
  	<tr>
  		<td>${subsetSumResults}</td>
  	</tr>
  </table>

</div>  
<div id="footer">
<p>For project info see <a href="http://ricks7.github.com/SubsetSum/">Subset Sum Project</a>
</div>

</body>
</html>  