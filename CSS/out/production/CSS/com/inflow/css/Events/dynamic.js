let newCat=document.createElement("div");

newCat.classList.add('cat')
let myImg=document.createElement("img");
myImg.src="https://picsum.photos/id/237/500/500";
myImg.alt="photo";
let newDiv=document.createElement("div");
newDiv.classList.add('horse')

 document.body.appendChild(newCat)
  newCat.appendChild(newDiv)
document.body.appendChild(myImg);
