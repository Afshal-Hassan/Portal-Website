
function Submit(){
    let name = document.getElementById("input").value;
  
    let xhr=new XMLHttpRequest;
    xhr.open("GET",'http://localhost:8080/api/m1');
    xhr.send(name);
    xhr.onload=function(){
    console.log("api called");
    console.log(typeof(name));
    }

}









