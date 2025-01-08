// 객체분할

const aa = {
    a:10,
    b:20,
    c:30
}

const {a,b,c} = aa;

console.log(`a = ${a}`);
console.log(`b = ${b}`);
console.log(`c = ${c}`);
console.log(aa);

// fetch
// 문자열을 만드는 함수 JSON.stringify();
// 문자열을 다시 객체로 만드는 함수 JSON.parse();
const aaa = JSON.stringify(aa);
console.log(aaa)
console.log(JSON.parse(aaa));