function validate(){
    var name=document.getElementById("name").value;
    var passwords=document.getElementById("password").value;
    var age=document.getElementById("age").value;
    var mail=document.getElementById("mail").value;
    var select=document.getElementById("select");

/*
var email=document.getElementById("email").value;
*/

    var agex=/^[1-9]?\d$/
    var regex=/[A-Za-z]/;
    var reg=/[0-9]{10}/;
    var gmail=/^[a-z0-9]+@[a-z]+\.[a-z]{2,3}/;
    if(age==""){
        prompt("age can't be empty ");
        return false;
   }
    else if(agex.test(age)==false){
        alert("age must be between 2 digits");
        return false;
   }
    if(select.value==""){
        alert("select the city ");
        return false;
    }
    if(name==""){
        alert("enter a name");
        return false;
   }
    else if(regex.test(name)==false){
        window.confirm("user name must contain alphabets");
        return false;
    }
    if(passwords==""){
        alert("password cant be empty");
        return false;
    }
   else if(reg.test(passwords)==false){
        alert("it must contain number and length should be 10 digits")
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





