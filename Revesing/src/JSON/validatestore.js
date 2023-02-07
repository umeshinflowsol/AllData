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
        table.appendChild(tr)
    }
}

function remove(){
   var table = document.getElementById("table");
      var rowCount = table.rows.length;
      for (var i = 0; i < rowCount-1; i++) {
          table.deleteRow(rowCount[i]);
          rowCount--;
          i--;

      }
}