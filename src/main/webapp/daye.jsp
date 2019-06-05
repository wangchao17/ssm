<%@ page pageEncoding="utf-8"%>
<html>
<!-- <head>
	<meta name="content-type" content="text/html; charset=UTF-8">
	<meta charset="utf-8">
</head> -->
<body>
<h2>Hello World!<br><b>我李白贼六</b></h2>
<br><br><button id="shanglu">走上路</button>
<br><br><button id="xialu">走下路</button>
<br><br><button id="shijiao">第一视角</button>
</body>
<script type="text/javascript">
	var shanglu = document.getElementById("shanglu");
	shanglu.onclick = function(){
	    window.location.href = "/libai/shanglu";
	};
	
	var xialu = document.getElementById("xialu");
	xialu.onclick = function(){
	    window.location.href = "/libai/xialu";
	};
	
	var shijiao = document.getElementById("shijiao");
	shijiao.onclick = function(){
	    window.location.href = "/libai/libai";
	};
</script>
</html>
