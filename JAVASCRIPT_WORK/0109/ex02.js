const arr1 = [{name:"이대호",age:40},
              {name:"강민호",age:39},
              {name:"손아섭",age:38},];

arr1.forEach(obj => {
    console.log(obj);
})

console.log("\n");
const arr2 = [...arr1,{name:"전준우",age:39}];
console.log(arr2);

// post로 저장하고 get으로 셀렉하는거를 
//그냥 배열 안에 post 해주는 식으로 일원화 가능 

const findObj = arr1.find(obj =>{
    if( obj.name == "손아섭" || obj.age===38){
        return obj;
    }
});

console.log(findObj);

const arr3 = [1,2,3,4]
const findIndex1 = arr3.find(obj =>{
    return index === 2;
});

console.log(findIndex1)

const findIndex2 = arr3.findIndex(index=>{
    return index === 4; 
});

console.log(findIndex2);