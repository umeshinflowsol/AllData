let employee='{ "employees": [' +
'{"firstname":"umesh","lastname":"neelaguri"},'+
'{"firstname":"tiger","lastname":"ummi"},'+
'{"firstname":"tiger1","lastname":"ummi1"}]}';

   const object=JSON.parse(employee);

  var display=document.getElementById("div")
   console.log (object.employees[0].firstname + " " + object.employees[0].lastname);

let data={
"name":"john",
"age":22,
"hobby": {
      "reading" : true,
    	"gaming" : false,
    	"sports":"cricket"
     },
     "Class":["webDevelop","java",".net"]
        }
        console.log(data.name);
        console.log(data.hobby);

        console.log(data.hobby.sport); // football
        console.log(data.Class[1]); // HTML