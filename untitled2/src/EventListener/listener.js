
/*
function load() {

    console.log(yes);
    yes.addEventListener("mouseover",mouseOver);
    event.addEventListener("click",mouseClick);
}
*/
   /*document.getElementById("yes");
   document.getElementById("no");
function mouseOver(){
console.log("asa", yes);
 if(yes.style.color=="white"){
   yes.style.color="red";
 }else{
  yes.style.color="blue";
 }
}
function mouseClick(){
if(event.target.id==yes){
   event.style.color="red";
 }else if(yes.target.id==no){
  event.style.color="blue";
 }else{
   event.style.color="";
 }

}*/
   var level1 =document.getElementById("d1");
   var level2 =document.getElementById("d2");
   var level3 =document.getElementById("d3");
   var level4 =document.getElementById("d4");

    level1.addEventListener("click",onClick1,false);
    level2.addEventListener("click",onClick2,true);
    /*level3.addEventListener("click",onClick3,false);
    level4.addEventListener("click",onClick4,false);*/

 function onClick1(){
  level1.style.backgroundColor="red";
  console.log(level1);
 }
 function onClick2(){
  level2.style.backgroundColor="green";
     console.log(level2);

 }
 /*function onClick3(){
  level3.style.backgroundColor="white";
    console.log(level3);
 }
 function onClick4(){
  level4.style.backgroundColor="blue";
    console.log(level4);

 }*/



