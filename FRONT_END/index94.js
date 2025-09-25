const myBtn = document.getElementById("myBtn");
const myImg = document.getElementById("myImg");

myBtn.addEventListener("click", event => {

    if(myImg.style.visibility === "hidden"){  // can also use style.display === "none" 
        myImg.style.visibility = "visible";   // can also use style.display = "block"
        myBtn.textContent = "Hide";
    }
    else{
        myImg.style.visibility = "hidden";    // can also use style.display = "none"
        myBtn.textContent = "Show";
    }
});