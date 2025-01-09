function aa(callback){
    setTimeout(() => {
       console.log("콜백함수호출합니다.") 
       callback();
    }, 3000);
};

function bb(callback){
    setTimeout(() => {
        console.log("콜백함수 한번더 호출함")
        callback();
    }, 4000);
}

function cc(callback){
    setTimeout(() => {
        console.log("콜백함수 또 한번더 호출함")
        callback();
    }, 4000);
}

aa(()=>{
    console.log("aaa")
    bb(()=>{
        console.log("bbb")
        cc(()=>{
            console.log("ccc")
        });
    });
});

// 콜백 무한으로 ㅈㄴ 드가버림 (콜백지옥) 
// 이걸 해결하는게 프로미스