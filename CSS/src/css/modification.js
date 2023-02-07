  function adddata(){
var getData=location.search.slice(1);
var userInfo=getData.split("&");
let table=document.getElementById("table");
 var rowCount = table.rows.length;
  var row = table.insertRow(rowCount);
    for(let i in userInfo){
  var userDetails=userInfo[i].split("=")[1];
  var cell1 = row.insertCell(0);
      var cell2 = row.insertCell(1);

    let newText= document.createTextNode(userDetails);
    let newText1= document.createTextNode(userDetails);
     cell1.appendChild(newText);
     cell2.appendChild(newText);
}
}