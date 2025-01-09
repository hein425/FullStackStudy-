const getData = async () => {
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            // resolve({
            //     name:"정해인",
            //     age:29,
            //     gender:"남자",
            // });
            reject({
                error:"아쒸에러나뿟다",
                code:666,
            });
        },3000);
    });
};

const printData = async() =>{
    try{
    const res = await getData();
    console.log(res);
    }catch(e){
        console.log(e);
        alert("통신실패다")
    }
}

printData();