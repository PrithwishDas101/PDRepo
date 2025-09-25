// JSON files = (javascript Object Notation ) data-interchange format
//               Used for exchanging data between a server and a web application
//               JSON files {key:value} OR [value1, value2, value3]
//
//               JSON.stringfy() = converts a JS object to JSON string  
//               JSON.parse()    = converts a JSON string to a JS object


//object to jsonStrings
//const names = ["Spongebob", "Patrick", "Squidward", "Sandy"];
//const jsonString = JSON.stringify(names);

//const person = {
//    "name": "Spongebob",
//    "age" : 30,
//    "isEmployed" : true,
//    "hobbies": ["jellyfishing", "karate", "cooking"]
//};
//const jsonString1 = JSON.stringify(person);

//const people = [{
//    "name": "Spongebob",
//   "age" : 30,
//    "isEmployed" : true
//},
//{
//    "name": "Patrick",
//    "age" : 34,
//    "isEmployed" : false
//},
//{
//    "name": "Squidward",
//    "age" : 50,
//    "isEmployed" : true
//},
//{
//    "name": "Sandy",
//    "age" : 27,
//    "isEmployed" : false
//}];
//const jsonString2 = JSON.stringify(people);

//console.log(names);
//console.log(jsonString);

//console.log(person);
//console.log(jsonString1);

//console.log(people);
//console.log(jsonString2);

//const JSONnames = `["Spongebob", "Patrick", "Squidward", "Sandy"]`;
//const JSONperson = `{"name": "Spongebob","age" : 30,"isEmployed" : true,"hobbies": ["jellyfishing", "karate", "cooking"]}`
//const JSONpeople = `[{"name": "Spongebob","age" : 30,"isEmployed" : true},
//                 {"name": "Patrick" "age" : 34,"isEmployed" : false},
//                 {"name": "Squidward","age" : 50,"isEmployed" : true},
//                 {"name": "Sandy","age" : 27,"isEmployed" : false}]`;

//const parsedData1 = JSON.parse(JSONnames);
//const parsedData2 = JSON.parse(JSONperson);
//const parsedData3 = JSON.parse(JSONpeople);

//console.log(JSONnames);
//console.log(parsedData1);

//console.log(JSONperson);
//console.log(parsedData2);

//console.log(JSONpeople);
//console.log(parsedData3);

fetch("names.json")
      .then(response => response.json())
      .then(value => console.log(value));

fetch("person.json")
      .then(response => response.json())
      .then(value => console.log(value));

fetch("people.json")
      .then(response => response.json())
      .then(values => values.forEach(value => {console.log(value.age)}))
      .catch(error => console.error("json not found"));