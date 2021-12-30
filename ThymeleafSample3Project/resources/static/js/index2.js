"use strict";

var init = () =>{
    console.log("init");
}

document.addEventListener("DOMContentLoaded", init);

var button = document.getElementById("button");
button.addEventListener("click", function(event){
    this.classList.toggle("gray");
});