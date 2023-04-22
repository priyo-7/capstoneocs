import { useState } from "react";
import { useNavigate } from "react-router-dom";

import React from "react";
import { CSSTransition } from "react-transition-group";
import "./Loginpage.css";
function LoginPage({ history }) {
  const [Type, setType] = useState("");
  const navigate = useNavigate();

  const handleSubmit = (event) => {
    event.preventDefault();
    const username = event.target.username.value;
    const password = event.target.password.value;

    if (Type === "admin" && username === "AD001" && password === "AD001") {
      navigate("/AddDoctor");
    } else if (
      Type === "admin" &&
      username === "AD002" &&
      password === "AD002"
    ) {
      navigate("/ViewDoctor");
    } else if (
      Type === "admin" &&
      username === "AD003" &&
      password === "AD003"
    ) {
      navigate("/ModifyDoctor");
    } else if (
      Type === "admin" &&
      username === "AD004" &&
      password === "AD004"
    ) {
      navigate("/deleteDoctor");
    } else if (
      Type === "reporter" &&
      username === "RE01" &&
      password === "RE01"
    ) {
      navigate("/reporter");
    } else {
      alert("Incorrect username or password");
    }
  };

  return (
    <div className="login-page">
      <div className="nn">
        <h1> MAHI CLINIC SYSTEM </h1>
      </div>
      {/* <img
        // src="./images/clinic.jpg"
        alt="Image"
        className="image1"
        width="700"
        height="300"
      /> */}
      {/* <div style={{ objectPosition:"top" , Text: "Bold", padding:"50px" }}>ONLINE CLINIC SERVICE</div> */}
      <div style={{ borderBlock: "30px" }}>
        <div>
          <input
            type="radio"
            id="bus"
            name="Type"
            value="admin"
            checked={Type === "admin"}
            onChange={() => setType("admin")}
          />
          <label>Admin</label>
        </div>
        <div>
          <input
            type="radio"
            id="patient"
            name="Type"
            value="patient"
            checked={Type === "patient"}
            onChange={() => setType("patient")}
          />
          <label htmlFor="patient">patient</label>
        </div>
        <div>
          <input
            type="radio"
            id="reporter"
            name="Type"
            value="reporter"
            checked={Type === "reporter"}
            onChange={() => setType("reporter")}
          />
          <label htmlFor="repoter">Repoter</label>
        </div>
      </div>
      {/* <h5>Enter your Login Details</h5> */}
      <div className="Login Here">
        <form onSubmit={handleSubmit}>
          <div className="vehicle-type-container"></div>
          <CSSTransition classNames="input-container" timeout={500}>
            <div className="input-container">
              <label htmlFor="username">Username:</label>
              <input type="text" id="username" name="username" />
            </div>
          </CSSTransition>
          <br></br>
          <CSSTransition classNames="input-container" timeout={900}>
            <div className="input-container">
              <label htmlFor="password">Password:</label>
              <input type="password" id="password" name="password" />
            </div>
          </CSSTransition>
          <br></br>
          <button className="login-button" type="submit">
            Login
          </button>
        </form>
      </div>
    </div>
  );
}
export default LoginPage;
