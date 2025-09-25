// ES6 Module = An external file that contains reusable code
//              that can be imported into other javascript files.
//              Write reusable code for many different apps.
//              Can contain variables, classes, functions ... and more
//              Introduced as part of ECMAScript 2015 update

import {PI, getCircumference, getArea, getVolume} from './mathutil.js';

console.log(PI.toFixed(2));
const circumference = getCircumference(3);
const area = getArea(3);
const volume = getVolume(3);

console.log(`${circumference.toFixed(2)}cm`);
console.log(`${area.toFixed(2)}cm^2`);
console.log(`${volume.toFixed(2)}cm^3`);