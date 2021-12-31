"use strict";

var init = () =>{
    console.log("init");
}

var nextPage = () =>{
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
        if(xhr.readyState == 4){
            if(xhr.status == 200){

            }else{
                console.log("return not 200");
            }
        }else{
            console.log(xhr.readyStatus);
        }
    };

    xhr.open("GET", "http://localhost:8080/hoge", true);
    xhr.send(null);
}

document.addEventListener("DOMContentLoaded", init);

//var button = document.getElementById("button");
//button.addEventListener("click", function(){
//    fetch("http://localhost:8080/hoge").then(response =>{console.log(response)})
//    .catch(error =>{console.log("error")});
//});