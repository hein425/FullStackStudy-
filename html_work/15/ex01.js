//let 은 변경 가능한 변수
//const 는 변경불가능한 상수

let aa = document.getElementById("btn-min");
const bb = document.getElementById("btn-max");
const printDiv = document.getElementById("print-div");

const n1 = document.getElementById("num1");
const n2 = document.getElementById("num2");
const n3 = document.getElementById("num3");
const n4 = document.getElementById("num4");
const n5 = document.getElementById("num5");

function min(){
 //console.log(n1.value);
 const arr =[n1.value,n2.value,n3.value,n4.value,n5.value,];
 let min = n1.value
 for(let index = 0; index <arr.length ; index++){
  const element = arr[index];
  if(Number(min)>Number(element))
    min = element;
 }
 printDiv.textContent = '최솟값 = '+min;
}

function max(){
  const arr =[n1.value,n2.value,n3.value,n4.value,n5.value,];
  let max = n1.value
  for(const key of arr){
   if(Number(max) < Number(key));
     max = key;
  }
 printDiv.textContent = '최대값 = '+ max;
}

// function max(){
//   alert('max함수 호출')
// }

aa.addEventListener('click',min);
bb.addEventListener('click',max);

printDiv.textContent = "안녕하세요 내용을 넣는거에요...";


// const cc = 10;
// let dd = 10;

// // cc=20; 이캐뿌면 에러
//  dd=30; //이건 OK

// console.log(dd);

// for(let i = 0; i<10; i++){
//   console.log(i);
// }



