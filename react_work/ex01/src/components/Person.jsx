import { useState } from "react";

const Person = ({ name:personName, age:personAge }) => {
  // 지금 이거나 프롭스나 그게 그거임
  // 이거는 구조분할 해서 데려옴.

  const [name, setName] = useState(personName);
  const [age, setAge] = useState(personAge);

  const doName = () => {
    setName(name + "!");
  };

  const doAge = () => {
    setAge(age + 1);
  };

  return (
    <div>
      <h1>Person</h1>
      <p>this is person component.</p>
      <h2>이름은 = {name} </h2>
      <h2>나이는 = {age} </h2>
      <button onClick={doName}>이름증가</button>
      <button onClick={doAge}>나이증가</button>
      <h1>----------</h1>
    </div>
  );
};

export default Person;
