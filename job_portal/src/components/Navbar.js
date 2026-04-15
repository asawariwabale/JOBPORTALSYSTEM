import { Link } from "react-router-dom";
import JobCard from "./JobCard";

function Navbar() {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark shadow-sm">
      <div className="container-fluid">

        
        <Link className="navbar-brand fw-bold" to="/">
          JobPortal
        </Link>

        
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

    
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav ms-auto">

            <li className="nav-item">
              <Link className="nav-link" to="/">
                Home
              </Link>
            </li>

            <li className="nav-item">
              <Link className="nav-link" to="/jobs">
                Jobs
              </Link>
            </li>

            <li className="nav-item">
              <Link className="nav-link" to="/post-job">
                Post Job
              </Link>
            </li>

            <li className="nav-item">
              <Link className="btn btn-outline-light me-2" to="/login">
                Login
              </Link>
            </li>

            <li className="nav-item">
              <Link className="btn btn-warning" to="/register">
                Register
              </Link>
            </li>

          </ul>
        </div>

      </div>
    </nav>
  );
}

export default Navbar;
