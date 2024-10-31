import { Slot } from "expo-router";
import { View, Text } from "react-native";
import { red } from "react-native-reanimated/lib/typescript/reanimated2/Colors";
  

function Header(){
  return(
    <View>
      <Text style={{fontSize:50}} >Header</Text>
    </View>
  )
}

function Footer(){
  return(
     <View>
      <Text style={{fontSize:50}} >Footer</Text>
    </View>
  )
}

export default function Home(){
  return(
    <View>
      <Header></Header>
      <Slot>

      </Slot>
      <Footer></Footer>
    </View>

  )
};