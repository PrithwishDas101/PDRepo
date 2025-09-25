// Date objects = Object that contain values that represent dates and times
//                These date objects can be changed and formatted


//Date(year, month, day, hour, minute, hour, minute, second, ms)
const date1 = new Date();
const date2 = new Date(2023, 7, 1, 2, 3, 4, 5);
const date3 = new Date("2024-01-02T12:00:00Z");
const date4 = new Date(2376998485796); //2376998485796ms after epic date in 1969

console.log(date1);
console.log(date2);
console.log(date3);
console.log(date4);

const year = date1.getFullYear();
const month = date1.getMonth();
const day = date1.getDate();
const hour = date1.getHours();
const minute = date1.getMinutes();
const second = date1.getSeconds();
const dayOfWeek = date1.getDay();

console.log(year);
console.log(month);
console.log(day);
console.log(hour);
console.log(minute);
console.log(second);
console.log(dayOfWeek);

if(date2 > date3){
    console.log(`happy new year`);
}
else{
    console.log(`sad new year`);
}
