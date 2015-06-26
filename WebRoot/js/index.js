$(function(){
	$('#log-out').click(function(){
		$.ajax({
			type:"post",
			url:"./user/logout.action",
			data: $('#log-out').data('name')
		}).success(function(){
			window.location.assign(location);
		})
	})
})