const doA = (a,b=20,c=30)=>{
  console.log(`a=${a}`);
  console.log(`a=${b}`);
  console.log(`a=${c}`);
}

doA();

// doB 함수선언
function doB(){

}
// doC 함수선언. 위 나 아래나 같은건데 아래껄 많이씀
const doC = function(){

} // 여기에서 this onclick->button this 는 버튼태그가 됩니다

const doD = () =>{}// 여기에서 this -> 윈도우 객체가 this가 된다.