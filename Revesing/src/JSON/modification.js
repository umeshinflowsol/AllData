  function add(){
var getData=location.search.slice(1);
var userInfo=getData.split("&");
let table=document.getElementById("table");
 var rowCount = table.rows.length;
  var row = table.insertRow(rowCount);
  var userDetails=[];
    for(let i in userInfo){
   userDetails.push(userInfo[i].split("=")[1])
  var cell1 = row.insertCell(0);
    let newText= document.createTextNode(userDetails[i]);
     cell1.appendChild(newText);
}
}
function remove(){
   var table = document.getElementById("table");
      var rowCount = table.rows.length;
      for (var i = 0; i < rowCount; i++) {
          table.deleteRow(rowCount[i]);
          rowCount--;
          i--;
      }
}