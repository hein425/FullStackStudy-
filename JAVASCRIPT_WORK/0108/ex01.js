console.log("안녕");

// falsey 값
const f1 = undefined; // 선언만 해놓고 값 할당이 안돼잇음
const f2 = null; // 선언되어있고 값이 null로 되어잇음
const f3 = 0;
const f4 = -0;
const f5 = NaN; // 숫자표기X Not in Number
const f6 = "";

const result1 = f1 && "result"; 
console.log( result1 )
// and 는 앞에거 false 니까 뒤에거까지 안가고 바로 result가 f1거만 뜸

const result2 = f1 || "result"; 
console.log( result2 )
// or 은 앞에거 false 니까 뒤에거를 보고 result가 뒤에거로 뜸

class A {
    a;
    constructor(a){this.a = a;}
}

// truthy 값
const t1 = "result";
const t2 = 123;
const t3 = [];
const t4 = {}; // {}는 리터럴 객체 표현식  const 
const t5 = ()=>{
    function a(){ console.log("함수")}
};
const t6 = new A(20);

const result3 =t4 || "result222";
console.log( result3 );

function printName(test){
    if(test){ 
        console.log(`${test} 출력된다`);
    }
    else{
        console.log(`${test} 출력안된다`)
    }
}

printName(t5)
printName(f5)

function aa(a){
    if(a){
        console.log(a);
    }
}

aa({ a:10 , b:20}); // 리터럴객체 (문자열 객체)
