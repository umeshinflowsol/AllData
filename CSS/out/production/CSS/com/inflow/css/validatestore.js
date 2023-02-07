function execute(){
 var desire = location.search.substring(1)
 var param=desire.split("&")
 var array=new Array(param);
   var table=document.createElement("table");

     for(let i=0;i<array.length;i++){
        var tr = document.createElement("tr")
         var td=document.createElement("td");
         var td1= td.innerHTML=array[i];
}
         tr.appendChild(td1);
    table.appendChild(tr);
    }