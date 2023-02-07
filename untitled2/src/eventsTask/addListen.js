
    var input=document.getElementById("myInput");
    var change=document.getElementById("change");
    var blur=document.getElementById("blur");
    var enter=document.getElementById("input");
    //Mouse Events elements
    var name1=document.getElementById("myName");
    var email=document.getElementById("mail");
    var pass=document.getElementById("pass");
    console.log(name1, input);
    //form Elements
    input.addEventListener("focus",example);
    input.addEventListener("focusout",example2);
    change.addEventListener("change",onChange);
    blur.addEventListener("blur",onBlur);
    enter.addEventListener("input",onInput);
    //Mouse Events elements
    name1.addEventListener("keypress",onKeyPress);
    email.addEventListener("keydown",onKeyDown);
    pass.addEventListener("keyup",onKeyUp);
function example(){
        console.log(input);
        input.style.backgroundColor="red";
  }
function example2(){
    console.log(input);
    input.style.backgroundColor="blue";
}
function onChange() {
    change.style.color="none";
    if(change.style.color=="none"){
       change.style.color="blue";
    }else{
           change.value=change.value.toUpperCase();
    }
}
function onBlur(){
       blur.style.backgroundColor="none";
    if(blur.style.backgroundColor=="red"){
       blur.style.backgroundColor="blue";
    }else{
           blur.value=blur.value.toLowerCase();
    }
}

function onInput(){
       enter.style.color="yellow";
}
//Mouse Events
function onKeyPress(){
        name1.style.color="red";
      if(name1.style.color=="none"){
         name1.style.backgroundColor="blue";
      }else{
             name1.value=name1.value.toUpperCase();
      }
}
function onKeyDown(){
           email.style.backgroundColor="yellow";
}
function onKeyUp(){
           pass.style.color="green";
}
//mouse Evnets Elements
     var div2=document.getElementById("div");
     var btn=document.getElementById("btn");
     btn.addEventListener("click",onClick);
     div2.addEventListener("mouseenter",mouseEnter);
     div2.addEventListener("mouseleave",mouseLeave);
     var para=document.getElementById("para");
     para.addEventListener("mouseover",mouseOver);
     var img=document.getElementById("img");
     img.addEventListener("dblclick",doubleClick);
     var div1=document.getElementById("div2");
     div1.addEventListener("mousemove",mouseMove);
     var div=document.getElementById("div2");
     div1.addEventListener("mouseup",mouseUp);
     var div=document.getElementById("div2");
     div1.addEventListener("mousedown",mouseDown);



//mouse Events
function onClick(){
    div2.style.width="300px";
    if(div2.style.width==""){
        div2.style.width="400px";
    }else{
        div2.style.margin="40px";
    }

}
function mouseEnter(){
    btn.style.backgroundColor="yellow";
}

function mouseLeave(){
    div2.style.backgroundColor="blue";
}
function mouseOver(){

    para.style.color="red";
}

function doubleClick(){
      img.style.border="2px solid black";
      img.style.width="500px";
/*
      body.style.backgroundColor="lightBlue";
*/
}
function mouseMove(){

     div1.style.backgroundColor="yellow";
}
function mouseUp(){
     div1.style.height="500px";
}
function mouseDown(){
     div1.style.border="5px solid green";
}