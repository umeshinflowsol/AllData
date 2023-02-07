  function add(){
var getData=location.search.slice(1);
var userData = getData.split("&");
let values=[];
   var table=document.getElementById("table");
   var tr=document.createElement("tr");
    for(var u in userData){
     values=userData[u].split("=")[1];
     var td=document.createElement("td");
     var CellText=document.createTextNode(values);
     td.appendChild(CellText);
    tr.appendChild(td);
    table.appendChild(tr);
}
}
function Remove(){
   var table = document.getElementById("table");
      var rowCount = table.rows.length;
      for (var i = 0; i < rowCount; i++) {
          table.deleteRow(rowCount[0]);

      }
}