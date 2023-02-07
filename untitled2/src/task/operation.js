



//function selectRow(){
//                  var table=document.getElementById("table");
//                  var name=document.getElementById("name");
//                  var pass=document.getElementById("password");
//                  var num=document.getElementById("age");
//                  var mail=document.getElementById("mail");
//                  var sel=document.getElementById("select");
//                  var  date=document.getElementById("date");
//        for(var i=1;i<=table.rows.length;i++){
//        table.rows[i].onclick=function(){
//        var rIndex=this.rowIndex;
//        console.log(rIndex);
//                name.value=this.cells[0].innerHTML;
//                pass.value=this.cells[1].innerHTML;
//                num.value=this.cells[2].innerHTML;
//                mail.value=this.cells[3].innerHTML;
//                sel.value=this.cells[4].innerHTML;
//                 date.value=this.cells[5].innerHTML;
//                 }
//        }
//     row.selectRow();
//}
//
//function editSelectRow(){
//            table.rows[rIndex].cells[0].innerHTML=name.value;
//            table.rows[rIndex].cells[1].innerHTML=pass.value;
//            table.rows[rIndex].cells[2].innerHTML=num.value;
//            table.rows[rIndex].cells[3].innerHTML=mail.value;
//            table.rows[rIndex].cells[4].innerHTML=sel.value;
//            table.rows[rIndex].cells[5].innerHTML=date.value;
//}
//function add(){
//                 var table=document.getElementById("table");
//                  var name=document.getElementById("name");
//                  var pass=document.getElementById("password");
//                  var num=document.getElementById("age");
//                  var mail=document.getElementById("mail");
//                  var sel=document.getElementById("select");
//                  var  date=document.getElementById("date");
//
//              var newRow = table.insertRow(1);
//              console.log(newRow);
//              var cell0=newRow.insertCell(0);
//              var cell1=newRow.insertCell(1);
//              var cell2=newRow.insertCell(2);
//              var cell3=newRow.insertCell(3);
//              var cell4=newRow.insertCell(4);
//              var cell5=newRow.insertCell(5);
//
//             cell0.innerHTML=name.value;
//             cell1.innerHTML=pass.value;
//             cell2.innerHTML=num.value;
//             cell3.innerHTML=mail.value;
//             cell4.innerHTML=sel.value;
//             cell5.innerHTML=date.value;
//  }
//function remove(){
//
//               table.deleteRow(-1);
//
//
//      }