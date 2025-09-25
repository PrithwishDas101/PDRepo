// .checked = property that determines the checked state of a
//            HTML checkbox or a radio button element

const myCheckBox = document.getElementsByTagName("myCheckBox");
const visaBtn = document.getElementsByTagName("visaBtn");
const mastercardBtn = document.getElementsByTagName("mastercardBtn");
const paypallBtn = document.getElementsByTagName("paypallBtn");
const mySubmit = document.getElementById("mySubmit")
const mysubResult = document.getElementsByTagName("mysubResult");
const paymentResult = document.getElementsByTagName("paymentResult");

mySubmit.onclick = function(){

    if(myCheckBox.checked){
        mysubResult.textContent = `you are subscribed!`;
    }
    else{
        mysubResult.textContent = `you not are subscribed!`;
    }

if(visaBtn.checked){
    paymentResult.textContent = `you are paying with visa`;
    
}
else if(mastercardBtn.checked){
    paymentResult.textContent = "you are paying with mastercard";
}
else if(paypallBtn){
    paymentResult.textContent = `you are paying with paypall`;
}
else{
    paymentResult.textContent = `you must select an option to pay`
}
} 