/*------------------------------------
 * FileName: startMove.js
 *------------------------------------
 * Param: 
 *		   obj: The object of element.
 * 		  json: The data of json.
 *            	For example: {width:100,height:200,opacity:80}
 *      second: the millisecond of time.
 *          fn: the function of callback.
 */
 
 
function startMove(obj,json,second,fn){
	clearInterval(obj.timer);
	var stop = true;
        obj.timer=setInterval(function(){									   
		var stopx = {};
		for (var attr in json){	
			stopx[attr] = true;
			if(attr=='opacity'){
				var iCur=parseInt(Math.floor(parseFloat(getStyle(obj,attr))*100));
			}else{
				var iCur=parseInt(getStyle(obj,attr));
			}
			
			var speed=(json[attr]-iCur)/10;
			speed = speed >0 ? Math.ceil(speed) : Math.floor(speed);
			if(json[attr]!=iCur){
					stopx[attr] = false;
					stop=false;
					if(attr=='opacity'){			           
						obj.style.filter='alhpa(opacity:'+(iCur+speed)+')';
						obj.style.opacity=(iCur+speed)/100;					
					}else{
						obj.style[attr]=iCur+speed+'px';
					}			
			}else{
					stopx[attr] = true;
					stop=true;
			}			
		}
		
		for(var j in stopx){
			if(stopx[j] == false)
				stop = false;
		}
		if(stop){
			for (var attr in json){
				if(attr=='opacity'){
					var iCur=parseInt(Math.floor(parseFloat(getStyle(obj,attr))*100));
				}else{
					var iCur=parseInt(getStyle(obj,attr));
				}
			}
			clearInterval(obj.timer);
			if(fn){ 	fn();	}
		}

	},second);
}

function getStyle(obj,attr){
	if(document.currentStyle){
		return obj.currentStyle[attr];
	}else{
		return window.getComputedStyle(obj,false)[attr];
	}

}
