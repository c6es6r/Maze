function toc(){
  var chapters = document.body.getElementsByTagName("h2");
  for(let i=0;i<chapters.length;i++){
    addTOC(chapters[i]);
  }
  var p = document.createElement("p");
  var i = document.createElement("i");
}

let counter = 0;
function addTOC(item){
  //var p = document.createElement("p");
  var node = document.createElement("a");
  node.innerHTML = item.innerHTML;
  item.id = "TOC"+counter;
  node.href = "#"+item.id;
  counter++;
  //p.appendChild(node)
  document.getElementById("navcontent").appendChild(node);
}
