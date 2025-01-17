//rnfc
//import liraries
import React, {Component, useState} from 'react';
import {
  View,
  Text,
  StyleSheet,
  Image,
  TouchableOpacity,
  Alert,
} from 'react-native';

const imgarr = [
  {
    idx: 1,
    name: '111',
    uri: require('../asset/images/111.jpg'),
  },
  {
    idx: 2,
    name: '222',
    uri: require('../asset/images/222.jpg'),
  },
  {
    idx: 3,
    name: '333',
    uri: require('../asset/images/333.jpg'),
  },
  {
    idx: 4,
    name: '444',
    uri: require('../asset/images/444.gif'),
  },
  {
    idx: 5,
    name: '555',
    uri: require('../asset/images/555.gif'),
  },
  {
    idx: 6,
    name: '666',
    uri: require('../asset/images/666.jpg'),
  },
];

// create a component
const Container = () => {
  const [num, setNum] = useState();

  const imgPress = pressnum => {
    setNum(pressnum);
  };

  return (
    <View style={styles.container}>
      <Text
        style={{
          color: '#fbfbfb',
          fontSize: 30,
          width: '100%',
          paddingHorizontal: 20,
        }}>
        {' '}
        Evangelion{' '}
      </Text>

      {imgarr.map(image => {
        return (
          <TouchableOpacity
            style={{width: '30%', height: 150}}
            onPress={() => imgPress(image.idx)}>
            <Image
              source={image.uri}
              style={{
                width: '100%',
                height: '100%',
                position: 'relative',
              }}></Image>
            {num === image.idx && (
              <View
                style={{
                  position: 'absolute',
                  bottom: 0,
                  left: 5,
                  backgroundColor: 'rgba(184, 37, 197, 0.7)',
                }}>
                <Text
                  style={{
                    color: 'rgb(51, 255, 0)',
                    fontSize: 30,
                    width: '100%',
                    paddingHorizontal: 20,
                  }}>
                  {image.name}
                </Text>
              </View>
            )}
          </TouchableOpacity>
        );
      })}
      <Text style={styles.textStyle}>{num}</Text>
    </View>
  );
};

// define your styles
const styles = StyleSheet.create({
  container: {
    gap: 10,
    flex: 1,
    flexDirection: 'row',
    flexWrap: 'wrap',
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#7c7e78',
  },
  textStyle: {
    color: '#fbfbfb',
    fontSize: 30,
    width: '100%',
    paddingHorizontal: 20,
  },
});

//make this component available to the app
export default Container;
