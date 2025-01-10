const arr1 = [10,3,5];

const sortArr1 = arr1.sort(
    (a,b) =>{
    if( a>b) return -1;
    else if( a<b)
        return 1;
    else return 0;
    }
); // 괄호안에 소트 어케할건지 적으소

const sortArr2 = arr1.sort(
    (a,b) => {
        return b-a;
    }
); //


console.log(sortArr1);

console.log(sortArr2);

const arr2 = [{name:"이대호",age:40},
    {name:"강민호",age:39},
    {name:"손아섭",age:38},];

const sortArr3 = arr2.sort(
    (item1, item2) => {
        return item2.age - item1.age;
    }
);
console.log(sortArr3);

const arr3 = ["안녕", "나는", "정해인이야"];

console.log(arr3.join());
console.log(arr3.join("-"));
console.log(arr3.join(""));