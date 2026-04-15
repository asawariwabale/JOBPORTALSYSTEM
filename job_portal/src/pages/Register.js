import { useState } from "react";
import axios from "axios";

function Register() {

  const [user, setUser] = useState({
    name: "",
    email: "",
    password: ""
  });

  const handleChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  const handleRegister = async () => {
    try {
      const res = await axios.post("http://localhost:8089/users", user);
      console.log("Register Success:", res.data);

      alert("Registration Successful 🚀");

      
      setUser({
        name: "",
        email: "",
        password: ""
      });

    } catch (error) {
      console.log("Register Error:", error);
      alert("Registration Failed ❌");
    }
  };

  return (
    <div className="container mt-5 col-md-4">

      <h3 className="text-center mb-3">Register</h3>

      <input
        className="form-control mb-2"
        placeholder="Name"
        name="name"
        value={user.name}
        onChange={handleChange}
      />

      <input
        className="form-control mb-2"
        placeholder="Email"
        name="email"
        value={user.email}
        onChange={handleChange}
      />

      <input
        className="form-control mb-2"
        placeholder="Password"
        type="password"
        name="password"
        value={user.password}
        onChange={handleChange}
      />

      <button
        className="btn btn-primary w-100"
        onClick={handleRegister}
      >
        Register
      </button>

    </div>
  );
}

export default Register;