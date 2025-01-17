/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import { SafeAreaView, StyleSheet, Text, View } from 'react-native';
import Container from './src/Container';

 

function App(){
 
// 기본적으로 플렉스인데 
// 두번째 div가 쫙 펴져
  return (
    <SafeAreaView style={{flex:1}}>

      <View style={{backgroundColor:'#fff'}}>
        <Text style={{color: '#888', fontSize:30, padding:20}}>신상품 목록</Text>
      </View>

      <View style={{flex:1, backgroundColor:'#f058',  flexDirection: 'row'}}>
        <Container></Container>     

      </View>
    </SafeAreaView>
  );
}
export default App;
