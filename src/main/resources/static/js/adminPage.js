$(function () {
	
	
	
	$(".themeInsertBtn").on("click", function() {
		
		var themeName = $(".themeName").val();
		
	$.ajax({
			type: "post",
			url: "/admin/themeInsert",
			data: {"themeName":themeName},
			dataType: "text",
			success: function() {
				alert("insert완료");
			}
		})
		alert("등록완료");
	}) 
	
	let themeNo = $(this).closest(tr).find(".themedeleteBtn").val();
	
	$(".themedeleteBtn").on("click", function() {
		
		alert(themeNo);
		
	})
	
})



