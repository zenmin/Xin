$(function() {
	$.each($(".onelist"),function(){
		var pid = $(this).attr("pid");
		var that =  $(this);
		$.ajax({
				url:"getChilds",
				data:{id:pid},
				method:"post",
				dataType:"json",
				success:function(result){
					$.each(result.map.list,function(index,item){
						that.append("<li style='text-align:center'><a href='item/" +
								item.id +
								"' class='form_sub'>" +
								item.name +
								"</a></li>")
					});
				}
		});
	});
	
	
	var imgurl = $("#imgurl").text();
	
	var img = imgurl.split(",");
	$("#showimg").empty();
	$.each(img,function(inedx,item){
		$("#showimg").append("<img alt='' src='" +
				item + 
				"' style='width: 400px; height: 711px;'><br>");
	})
	
});