export default {
  a: 10, 
  b: function () { 
    console.log('test');
   }
}; //객체반환

export const aa = {
  z:10,
  zz:20,
  zzz:function(){
    console.log("test");
  }
};

export const bb = () =>{
  let a = 10;
  let b = 20;
  console.log("bb");
  let c = 30;
  return 10;
}
// js컴파일러가 자료형 알아서 처리하니까 걍 대충 적어
export const cc = function(){
 return 10;
}