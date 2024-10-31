import axios from "axios";
import { useState } from "react";
import { StyleSheet, Text, View, TouchableOpacity } from "react-native";




const AA = () => {
    const [data,setData]=useState('초기값');
    const changeData = async() =>{
        const res = await axios.get('http://112.222.157.156:30020/test/aa');
        setData("변경된값"+res.data);
    
    }
    

    return ( <View style={styles.container}>
        <Text style ={styles.text}>AA</Text>
        <Text style ={styles.text}>{data}</Text>
        {/* <TouchableOpacity onPress={()=>{}}> */}
        <TouchableOpacity onPress={changeData}>
            <Text style ={styles.text}>Press me</Text>
        </TouchableOpacity>
    </View> );
}
 
export default AA;


const styles = StyleSheet.create({
    container:{
        backgroundColor:"white",
        padding:20,
        margin:40,
        
        alignItems:"center",
        justifyContent:"center",
    },
    text:{
        fontSize:25,
        fontFamily:"CC",
    }

});