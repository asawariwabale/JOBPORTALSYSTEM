import { BrowserRouter, Routes, Route } from "react-router-dom";

import Navbar from "./components/Navbar";
import Home from "./pages/Home";
import Jobs from "./pages/Jobs";
import JobPost from "./pages/JobPost";
import Login from "./pages/Login";
import Register from "./pages/Register";

function App() {
  return (
    <BrowserRouter>

      <Navbar />

      <Routes>
         <Route path="/" element={<Home />} />
       <Route path="/jobs" element={<Jobs />} />
        <Route path="/post-job" element={<JobPost />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} /> 
      </Routes>

    </BrowserRouter>
  );
}

export default App;