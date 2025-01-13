import React from 'react';
import { Image, StyleSheet , Text, View } from 'react-native';


function App(): React.JSX.Element {
  return (
    <View style = {styles.container}>
      <Text style = {styles.title}>
       료이키텐카이
      </Text>
      <Image style = {styles.image} source={{uri:'https://blog.kakaocdn.net/dn/b8sLWQ/btqNpGOpLsf/gKLOimcHqTYNtCLkmeKmfK/img.gif'
      }}></Image>
    </View>
  );
 
}

const styles = StyleSheet.create({
  container:{
    flex:1,
    backgroundColor:'#eee',
    justifyContent:'center',
    alignItems:'center',
  },
  title:{
    fontSize: 50,
  },
  image:{
    width:200,
    height:200,
  },
});

export default App;
