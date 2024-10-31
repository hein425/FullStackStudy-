import { useState } from 'react';
import './App.css';
import Person from './components/Person.jsx';
// 리액트 네이티브 가기전 맛보기
function App() {

  const [data,setData] = useState(0);
  const [age, setAge] = useState(29);

  const doClick1 = () => {
    alert('Hello React!!');
    console.log('Button Clicked!');
    setData(data+1);
  }

  const doClick2 = () => {
    setAge(age-1);
  }

  return (
    <div className="App">
    <Person name = "정해인" age = {29}></Person>
    <Person name = "이해인" age = {16}></Person>
    <Person name = "정해성" age = {25}></Person>
    
      <h1> 안녕 리액트 </h1>
      <h2>Count: {data}</h2>
      <h3>age : {age}</h3>
      <button onClick={doClick1}>눌러봐</button>
      <button onClick={doClick2}>나이깎기</button>
    </div>
  );
}

export default App;
