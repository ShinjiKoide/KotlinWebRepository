"use strict";

var init = () => {
    alert("init!")
}

var clickEvent = (event) => {
    alert("clicked");
    console.log(this);
    console.log(event);
}

document.addEventListener("DOMContentLoaded", init);

var button1 = document.getElementById("button1");
button1.addEventListener("click", clickEvent);