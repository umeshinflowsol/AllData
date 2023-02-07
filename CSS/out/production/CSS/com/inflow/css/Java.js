function validate(){
var name=document.getElementById("name").value;
var passwords=document.getElementById("password").value;
var age=document.getElementById("age").value;
var mail=document.getElementById("mail").value;
/*
var email=document.getElementById("email").value;
*/
var regex=/[A-Za-z]/;
var reg=/[0-9]{9}/;
var gmail=/^[a-z0-9]+@[a-z]+\.[a-z]{2,3}/;
if(name==""){
alert("enter a name");
return false;
}
else if(regex.test(name)==false){
alert("user name must contain alphabets");
return false;
}
if(passwords==""){
alert("password cant be empty");
return false;
}
else if(reg.test(passwords)==false){
alert("password must contain number")
return false;
}
if(mail==""){
alert("email can't be empty");
return false;
}
else if(gmail.test(mail)==false){
 alert("email is wrong");
 return false;
 }
 }


