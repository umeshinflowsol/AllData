 function geturl(){
    alert("The URL of this page is: " + window.location.href);
     // Prints protocol like http: or https:
        document.write(window.location.protocol + "<br>");

        // Prints hostname with port like localhost or localhost:3000
        document.write(window.location.host + "<br>");

        // Prints hostname like localhost or www.example.com
        document.write(window.location.hostname + "<br>");

        // Prints port number like 3000
        document.write(window.location.port + "<br>");

        // Prints pathname like /products/search.php
        document.write(window.location.pathname + "<br>");

        // Prints query string like ?q=ipad
        document.write(window.location.search + "<br>");

        // Prints fragment identifier like #featured
        document.write(window.location.hash);

 }
 function loadpage(){
 var div=document.getElementById("id").value;
 window.location.assign("https://www.tutorialrepublic.com/codelab.php?topic=javascript&file=get-different-parts-of-a-url"+div);
 }