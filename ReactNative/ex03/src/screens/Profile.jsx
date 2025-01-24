import {View, Text} from 'react-native';
import * as React from 'react';
import {Button} from '@react-navigation/elements';

function ProfileScreen({navigation}) {
  return (
    <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
      <Text>ProfileScreen</Text>
      <Text>name = {route.params.name}</Text>
      <Text>name = {route.params.name}</Text>
      {/* <Button
        
        onPress={()=>navigation.goBack('Home')}>
            HOME
        </Button> */}
      {/* <Button
        onPress={() =>
          navigation.reset({
            index: 0,
            routes: [{name: 'Home'}, {name: 'Profile'}],
          })
        }>
        HOME
      </Button> */}
      <Button onPress={
        ()=>
        navigation.goBack
      }>Home</Button>
    </View>
  );
}

export default ProfileScreen;
