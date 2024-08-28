let n = prompt('정수입력');

function Z(n){

  let a = 0;


  for(let i = 1; i<=n ; i++){

    a += i

  }

  return a;

}

console.log(Z(n));