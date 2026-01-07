let spoilerCounter = 0;

function wrapper(elementID){
	return function (){
			spoiler(elementID)
	}
}

function spoiler(elementID){
	let element = document.getElementById(elementID);
	if(element.style.display==="block"){
		element.style.display = "none";
		element.previousElementSibling.innerHTML = "[+] Lösung anzeigen";
	}else{
		element.style.display = "block";
		element.previousElementSibling.innerHTML = "[-] Lösung verbergen";
	}
}

function setSpoiler(){
	let hides = document.body.getElementsByClassName("hide");
	for(let i=0;i<hides.length;i++){
    addPre(hides[i]);
  }
}

function addPre(item){
  var a = document.createElement("a");
	item.id = "spoiler"+spoilerCounter;
  a.innerHTML = "[+] Lösung anzeigen";
	a.onclick=wrapper(item.id);
	a.style="background-color: rgb(100,100,100,0.5); width:100; display: block;";
  spoilerCounter++;
  item.parentElement.insertBefore(a,item);
}
