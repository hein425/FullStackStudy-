// import {cc} from './myclass';

// const [a,b,c] = cc;
const mybgclass = ['bg-orange-400','bg-green-400','bg-yellow-400']

const removeclass = () => {
  for(const element of mybgclass){
    document.querySelector('#result').classList.remove(element);  
  }  
}

document.querySelector('#orange').onclick = () => { 
  console.log("확인");
  removeclass();
  document.querySelector('#result').classList.add('bg-orange-400');
  // console.log(`a = ${a}`);
  // console.log(`b = ${b}`);
  // console.log(`c = ${c}`);
}

document.querySelector('#green').onclick = () => { 
  console.log("확인");
  removeclass();
  document.querySelector('#result').classList.add('bg-green-400');
}

document.querySelector('#yellow').onclick = () => { 
  console.log("확인");
  removeclass();
  document.querySelector('#result').classList.add('bg-yellow-400');
}