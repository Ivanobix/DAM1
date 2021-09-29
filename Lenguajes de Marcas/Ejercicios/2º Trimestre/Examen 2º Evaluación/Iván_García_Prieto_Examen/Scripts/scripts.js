function avance_slide(){
	var tiempo = 5000;
	var arrayImagenes = ['./Imagenes/Slide/macizo_oriental.png','./Imagenes/Slide/cares.png','./Imagenes/Slide/vega_liordes.png','./Imagenes/Slide/tombo.png'];
	
	_img = document.getElementById('slide');
	_a = document.getElementById('slide_enlaces');
	
	_img.src = arrayImagenes[0];
	_a.href = arrayImagenes[0];
	
	var i=1;
	//var j=1;
	setInterval(function(){
		_img.src = arrayImagenes[i];
		_a.href = arrayImagenes[i];
		
		i = (i == arrayImagenes.length-1)? 0 : (i+1);
	}, tiempo);
}
	