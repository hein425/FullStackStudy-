import axios from "axios";

const URL = 'http://localhost:10000/user';

export const getUsers = async() => {
    
    try{
    const res = await axios.get(`${URL}/select`);
    console.log(res)
    return res;
    } catch(e){
        console.log(e);
        return e;
    }

    // .then(res=>{
    //     console.log(res);
    //     return res.data;
    // })
    // .catch(e=>{
    //     console.log(e);
    //     return e;
    // });
};

export const saveUser = async (item) => {
    console.log("save"+JSON.stringify(item));
    try{
    await axios.put(`${URL}/update`,item);
    return res;
    }catch(e){
        console.log(e);
        return e;
    }
};

export const deletUser = () => {};