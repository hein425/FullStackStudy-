import {View, Text} from 'react-native';
import * as React from 'react';
import {Button} from '@react-navigation/elements';

// push navigate 페이지 쌓이는거
// goBack 뒤로 돌아가는거
// reset 초기화 하고 몇번 인덱스로 가겟다

function HomeScreen({navigation}) {
  return (
    <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
      <Text>Home Screen</Text>
      {/* <Button 
        onPress={()=>navigation.push('Profile')}>
            PROFILE
        </Button> */}
      <Button
        onPress={() =>
          navigation.reset({
            index: 1,
            routes: [{name: 'Home'}, {age: 30}],
          })
        }>
        PROFILE
      </Button>
    </View>
  );
}

export default HomeScreen;
