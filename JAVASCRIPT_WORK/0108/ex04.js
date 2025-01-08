const person = {
    age: 20,
    name: "홍길동",
    gender: "남자"
};

function fuc({name,age,gender}){
    console.log(`나이는 ${age}`);
    console.log(`이름은 ${name}`);
    console.log(`성별은 ${gender}`);
};

func(person);

const func =( {name,age,gender} )=> {
    console.log(`22나이는 ${age}`);
    console.log(`22이름은 ${name}`);
    console.log(`22성별은 ${gender}`);
};

fuc(person);

