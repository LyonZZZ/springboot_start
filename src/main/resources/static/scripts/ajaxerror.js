$.ajax({
	url:"/err/getAjaxError",
	type:"POST",
	async:false,
	success:function(data){
		debugger;
		if(data=="ok"){
			alert("成功");
		}else if(data=="exception"){
			alert("发生异常");
		}else if(data=="isAjax"){
			alert("ajax请求的异常");
		}
	},
	error:function(response,ajaxOptions,thrownError){
		alert("error");
	}
});