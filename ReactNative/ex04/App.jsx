import React from 'react';
import {View, Text, Button, StyleSheet} from 'react-native';
import {NavigationContainer} from '@react-navigation/native';
import {createDrawerNavigator} from '@react-navigation/drawer';
import Toast from 'react-native-toast-message';
import TodoMainScreen from "./src/screens/TodoMainScreen";
import ProfileScreen from "./src/screens/ProfileScreen";
import Homescreen from "./src/screens/Homescreen";

const Drawer = createDrawerNavigator();

export default function App() {
  return (
      <>
        <NavigationContainer>
          <Drawer.Navigator initialRouteName="Home">
            <Drawer.Screen name="Home" component={Homescreen} />
            <Drawer.Screen name="TodoMain" component={TodoMainScreen} />
            <Drawer.Screen name="Profile" component={ProfileScreen} />
          </Drawer.Navigator>
        </NavigationContainer>
        <Toast config={{zIndex: 1000}} />
      </>
  );
}

