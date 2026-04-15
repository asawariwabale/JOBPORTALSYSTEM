import { useState } from "react";
import axios from "axios";

function Login() {

  const [user, setUser] = useState({
    email: "",
    password: ""
  });

  const handleChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  const handleLogin = async () => {
    try {
      const res = await axios.post("http://localhost:8089/users", user);

      console.log(res.data);
      alert("Login Successful 🚀");

      localStorage.setItem("token", res.data.token);

    } catch (error) {
      console.log(error);
      alert("Invalid credentials ❌");
    }
  };

  return (
    <div className="container mt-5 col-md-4">

      <h3 className="text-center mb-3">Login</h3>

      <input
        name="email"
        className="form-control mb-2"
        placeholder="Email"
        value={user.email}
        onChange={handleChange}
      />

      <input
        name="password"
        type="password"
        className="form-control mb-2"
        placeholder="Password"
        value={user.password}
        onChange={handleChange}
      />

      <button className="btn btn-success w-100" onClick={handleLogin}>
        Login
      </button>

    </div>
  );
}

export default Login;