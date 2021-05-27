
//funcao para capturar as meta tags
$("#linkPromocao").on('change', function(){
	
	var url = $(this).val();
	
	if(url.length > 7){
		
		$.ajax({
			method:"POST",
			url: "/meta/info?url=" + url,
			cache: false,
			beforeSend: function(){
				$("#alert").removeClass("alert alert-danger").text('');
				$("#titulo").val("");
				$("#site").text("");
				$("#linkImagem").attr("src", "http://localhost:8080/images/promo-dark.png");
			},
			success: function( data ){
				console.log(data);
				
											
				$("#titulo").val(data.title);
				$("#site").text(data.site.replace("@", ));
				$("#linkImagem").attr("src", data.image);// 1 parametro qual atributo da tag , 2 valor a adicionar				
			},
			statusCode:{				
				404: function(){
					$("#alert").addClass("alert alert-danger")
						.text("Nenhuma informação pode ser recuperada dessa URL");
				}
			},
			error: function(){
					$("#alert").addClass("alert alert-danger")
						.text("Ops... algo deu errado, tente mais tarde");
				}			
		});
		
	}
})