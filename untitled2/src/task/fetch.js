/*function execute(){
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
}
table.appendChild(tr)
}*/
var rIndex;
function selectRow(){
    var table=document.getElementById("table");
    var name=document.getElementById("name");
    var pass=document.getElementById("password");
    var num=document.getElementById("age");
    var mail=document.getElementById("mail");
    var sel=document.getElementById("select");
    var  date=document.getElementById("date");
    var  gen1=document.getElementById("gender");
    var  gen2=document.getElementById("genders");

    for(i=0;i<table.rows.length;i++){
         table.rows[i].onclick=function(){
        rIndex=this.id;
        console.log(rIndex);
        name.value=this.cells[0].innerHTML;
        pass.value=this.cells[1].innerHTML;
        num.value=this.cells[2].innerHTML;
        mail.value=this.cells[3].innerHTML;
        sel.value=this.cells[4].innerHTML;
        date.value=this.cells[5].innerHTML;
              };
      }
}

 /*function edit(){
         table.rows[rIndex].cell[0].innerHTML=name.value;
         table.rows[rIndex].cell[1].innerHTML=pass.value;
         table.rows[rIndex].cell[2].innerHTML=num.value;
         table.rows[rIndex].cell[3].innerHTML=mail.value;
         table.rows[rIndex].cell[4].innerHTML=sel.value;
         table.rows[rIndex].cell[5].innerHTML=date.value;
 }*/

function addRow(){
      var table=document.getElementById("table");
      var name=document.getElementById("name");
      var pass=document.getElementById("password");
      var num=document.getElementById("age");
      var mail=document.getElementById("mail");
      var sel=document.getElementById("select");
      var  date=document.getElementById("date");



        var newData=table.insertRow(-1);
        newData.id = new Date().getTime();
        console.log(newData);
        var cell0=newData.insertCell(0);
        var cell1=newData.insertCell(1);
        var cell2=newData.insertCell(2);
        var cell3=newData.insertCell(3);
        var cell4=newData.insertCell(4);
        var cell5=newData.insertCell(5);
        var cell6=newData.insertCell(6);

        cell0.innerHTML=name.value;
        cell1.innerHTML=pass.value;
        cell2.innerHTML=num.value;
        cell3.innerHTML=mail.value;
        cell4.innerHTML=sel.value;
        cell5.innerHTML=date.value;


        cell6.innerHTML = "<input id='remove' type='button' onclick='remove(" + newData.id + ")' value='Remove' />" +"<br>"+
        "<input id='edit' type='button' onclick='selectRow(" + newData.id + ")' value='Edit' />";

       cell0.onmouseover=mouseover;
       cell1.onmouseover=mouseover;
       cell2.onmouseover=mouseover;
       cell3.onmouseover=mouseover;
       cell4.onmouseover=mouseover;
       cell5.onmouseover=mouseover;
   }


  function remove(rowId){
    var row = document.getElementById(rowId);
    row.remove();
  }

  function edit(rowId){
      var row = document.getElementById(rowId);
       var table=document.getElementById("table");
                        var name=document.getElementById("name");
                        var pass=document.getElementById("password");
                        var num=document.getElementById("age");
                        var mail=document.getElementById("mail");
                        var sel=document.getElementById("select");
                        var  date=document.getElementById("date");
              for(var i=1;i<=table.rows.length;i++){
                  table.rows[i].onclick=function(){
                  var rIndex=this.rowIndex;
                  console.log(rIndex);
                      name.value=this.cells[0].innerHTML;
                      pass.value=this.cells[1].innerHTML;
                      num.value=this.cells[2].innerHTML;
                      mail.value=this.cells[3].innerHTML;
                      sel.value=this.cells[4].innerHTML;
                       date.value=this.cells[5].innerHTML;
                       }
              }
    }
function save(rowId) {
        var row = document.getElementById(rIndex);
        var table=document.getElementById("table");
        var name=document.getElementById("name");
        var pass=document.getElementById("password");
        var num=document.getElementById("age");
        var mail=document.getElementById("mail");
        var sel=document.getElementById("select");
        var  date=document.getElementById("date");

                       row.cells[0].innerHTML=name.value;
                       row.cells[1].innerHTML=pass.value;
                       row.cells[2].innerHTML=num.value;
                       row.cells[3].innerHTML=mail.value;
                       row.cells[4].innerHTML=sel.value;
                       row.cells[5].innerHTML=date.value;

}

function mouseover(event){
console.log(event.target.innerText);
document.getElementById("result").innerHTML=event.target.innerText;

}


