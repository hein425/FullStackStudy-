import { Link } from "expo-router";
import { View, Text } from "react-native";



export default function Index(){
    return(
        <View style={{marginTop:50}}>
            <Text style={{fontSize:50, fontWeight:"bold"}}>Index</Text>
            <Link href="/home">
                <Text style={{fontSize:50}}> HOME</Text>
            </Link>
            <Link href="/home/aa">
                <Text style={{fontSize:50}}> AA</Text>
            </Link>
            <Link href="/(tabs)">
                <Text style={{fontSize:50}}> tabs</Text>
            </Link>
        </View>
    )
}