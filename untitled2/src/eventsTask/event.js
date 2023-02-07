function myFunLoad(){
     alert("your in the web page");
}
function onInput(){
    var myInput=document.getElementById("myInput");
    myInput.style.color="white";
    if(myInput.style.color==""){
     confirm("do you want to change the text color");
         myInput.style.color="red";
    }else{
        myInput.style.color="blue";
    }
}

function  onFocus(){
    var text=document.getElementById("text");
    text.style.backgroundColor="";
    if(text.style.backgroundColor=="red"){
         text.style.backgroundColor="red";
    }else{
        text.style.backgroundColor="yellow";
    }
}

function onBlur(){
    var blur=document.getElementById("blur");
    blur.style.color="blue";
}
function onChange(){
    var change=document.getElementById("onchange");
    change.style.width="";
    if( change.style.width==""){
           change.style.color="red";
      }else{
          change.style.backgroundColor="yellow";
      }
}
//Mouse Events Onclick//
function onClick(){
    var div=document.getElementById("div");
    div.style.width="300px";
    if(div.style.width==""){
        div.style.width="400px";
    }else{
        div.style.margin="40px";
    }
}

function mouseLeave(){
    var div=document.getElementById("div");
    div.style.backgroundColor="blue";
}

function mouseOver(){
    var para=document.getElementById("para");
    para.style.color="red";
}

function doubleClick(){
      var img=document.getElementById("img");
      var body=document.getElementById("body");
      img.style.border="2px solid black";
      img.style.width="500px";
/*
      body.style.backgroundColor="lightBlue";
*/
}
function mouseMove(){
     var div=document.getElementById("div2");
     div.style.backgroundColor="yellow";
}
function mouseUp(){
     var div=document.getElementById("div2");
     div.style.height="500px";
}
function mouseDown(){
     var div=document.getElementById("div2");
     div.style.border="5px solid green";
}
function mouseEnter(){
    var btn=document.getElementById("btn");
    btn.style.backgroundColor="yellow";
}
// keyboard Evnets //

function pressKey(){
      var name=document.getElementById("name");
      name.style.backgroundColor="green";
     if(name.style.backgroundColor=""){
         name.style.backgroundColor="lightblue";
    }else{
           name.style.backgroundColor="blue";
       }
}

function keyDown(){
     var pass=document.getElementById("pass");
     pass.value=pass.value.toUpperCase();

}
function upKey(){
      var mail=document.getElementById("mail");
      confirm("onkeyUp to change the Color of text");
      mail.style.color="yellow";

}





