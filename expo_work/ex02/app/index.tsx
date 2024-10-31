import { Text, StyleSheet, TouchableOpacity, View } from "react-native";
import { useRouter } from "expo-router";
import { useEffect } from "react";
import AA from "@/mcomponents/aa";



export default function Index() {
  const router = useRouter();
  const onPress = () => {
    router.push("/(tabs)");
  };
  const onConsole = () => {
    console.log("This is console log")
  };
  const onMyMain = () => {
    router.push("/mymain");
  };

  useEffect(()=>{
    console.log("ㅎㅇㅎㅇㅎㅇㅎㅇ")
  },[]);
  // vue에 watch([],()=>{}) 이거랑 비슷함
  // 최초에 한번만 실행

  return (
    <View style={styles.container}>
      <Text style={styles.text}>Index</Text>
      <Text style={styles.text}>RouterLink - router.push Link - router.push</Text>
      <TouchableOpacity onPress={onPress}>
        <Text style={styles.text}>Click Me</Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={onConsole}>
        <Text style={styles.text}>이거누르면콘솔떠요</Text>
      </TouchableOpacity>
      <TouchableOpacity onPress={onMyMain}>
        <Text style={styles.text}>이거누르면 마이메인으로간다</Text>
      </TouchableOpacity>
      <AA/>
    </View>
  );
}

const styles = StyleSheet.create({
    container:{
      marginTop:50,
      flex:1,
      justifyContent:'center',
      alignItems: 'center'
    },
    text:{
      fontFamily:"CC",
      fontSize:20,
      // fontWeight:'bold'
    }
});