const arr = [1,2,3,4,5,6,7];
const numarr = arr.splice(2);

console.log(`arr = $(arr)`);
console.log(`numarr = $(numarr)`);

arr = [1,2,3,4,5,6,7];
numarr = arr.splice(2,2);
console.log(`arr = $(arr)`);
console.log(`numarr = $(numarr)`);

arr = [1,2,3,4,5,6,7];
numarr = arr.splice(2,2,[99,99]);
console.log(`arr = $(arr)`);
console.log(`numarr = $(numarr)`);