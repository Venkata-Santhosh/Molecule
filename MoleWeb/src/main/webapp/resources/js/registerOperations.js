/**
 * 
 */


var register = function() {
	
	var registerForm  = $("#registerForm");
	
	var _registerFormValidateAndSubmit = function (){
		
		registerForm.validate({
			errorClass : "has-error",
			validClass : "has-success",

			rules : {
				userName : {
					required : true,
					minlength : 6,
					maxlength : 16
				},
				email:{
					required : true,
					minlength : 6,
					maxlength : 16
				}
		
			},
			errorPlacement : function(error, element) {
				console.log("error palacement");
			},
			showErrors : function(errorMap, errorList) {
				
				this.defaultShowErrors();

			},
			messages : {
				userName : {
					requried : "Please enter Password",
					minlength : "Password should not be less than 6 charactures!",
					maxlength : "Password should not be more than 16 charactures"
				},
				email: {
					requried : "Please enter Password",
					minlength : "Password should not be less than 6 charactures!",
					maxlength : "Password should not be more than 16 charactures"
				}
				
			},
			highlight : function(element, errorClass, validClass) {
				
				if ($(element).closest('.form-group').hasClass(errorClass)) {
					$(element).closest('.form-group').removeClass(errorClass);
				}
				setTimeout(function() {
					$(element).closest('.form-group').addClass(errorClass);
				}, 10);
			},
			unhighlight : function(element, errorClass, validClass) {
				$(element).closest('.form-group').removeClass(errorClass);
			},
			submitHandler : function() {
				
				var str = $("#registerForm").serialize();
				var userNameValue = $("#userName").val();
				var emailValue = $("#email").val();
				$.ajax({
					url:"register",
					  dataType: "json",

					type: "POST",
					data:str,
					success :function(data){
						//$.isLoading("hide");
						console.log("data" + data.message);
					},
					error: function(data){
						
					}
					
					
				});
			}
			
		});
	}
	return {
		
		init : function () {
			_registerFormValidateAndSubmit();
		}
	}
	
}();

$(document).ready(register.init());