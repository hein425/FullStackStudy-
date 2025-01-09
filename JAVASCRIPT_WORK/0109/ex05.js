setTimeout(() => {
    console.log("test")
}, 3000);

setTimeout(() => {
    console.log("2초뒤에")
}, 2000);

const aa = setInterval(() => {
    console.log("2초마다")
}, 2000);

setTimeout(() => {
   clearInterval(aa) 
   console.log("인터벌 끝")
}, 10000);

console.log("출력됩니다.")


