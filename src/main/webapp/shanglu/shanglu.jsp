<%@ page pageEncoding="utf-8"%>
<html>
<!-- <head>
	<meta name="content-type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
</head> -->
<body>
<h2>Hello World!<br><b>我李白贼六走上路</b></h2>
<br><button id="huiqu">回去</button>
</body>
<script type="text/javascript">
	var huiqu = document.getElementById("huiqu");
	huiqu.onclick = function(){
	    window.location.href = "/libai/daye";
	};
</script>
</html>
