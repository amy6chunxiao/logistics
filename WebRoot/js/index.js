$(function(){
	$('#log-out').click(function(){
		$.ajax({
			type:"post",
			url:"./user/logout.action",
			data: $('#log-out').data('name'),
			complete:function(){
				window.location.assign('./index.jsp');
			}
		})/*.success(function(res){
			alert(1);
			window.location.assign('./index.jsp');
		})*/
	})


	$('#log-btn').click(function(){
		if(!$('#user-name').val()){
			$('#user-name').parent().addClass('has-error');
			return false;
		}
		if(!$('#user-password').val()){
			$('#user-password').parent().addClass('has-error');
			return false;
		}
		return true;
	})

	$('#user-name').click(function(){
		if($(this).parent().hasClass('has-error')){
			$(this).parent().removeClass('has-error');
		}
	})
	$('#user-password').click(function(){
		if($(this).parent().hasClass('has-error')){
			$(this).parent().removeClass('has-error');
		}
	})
})