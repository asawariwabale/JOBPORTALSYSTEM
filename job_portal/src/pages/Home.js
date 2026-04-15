import { Link } from "react-router-dom";

function Home() {
  return (
    <div>

     
      <div className="hero d-flex align-items-center">

        <div className="container text-center">

          <h1 className="display-3 fw-bold">
            Build Your Career 🚀
          </h1>

          <p className="lead mt-3">
            One platform for thousands of jobs, top companies & faster hiring
          </p>

          <div className="mt-4 d-flex justify-content-center gap-3">

            <Link to="/jobs" className="btn btn-light btn-lg px-4">
              🔍 Find Jobs
            </Link>

            <Link to="/register" className="btn btn-outline-light btn-lg px-4">
              Join Free
            </Link>

          </div>

        </div>

      </div>

     
      <div className="container my-5">

        <div className="row g-4">

          <div className="col-md-4">
            <div className="card job-card p-4 text-center h-100">
              <h3>⚡ Fast Hiring</h3>
              <p className="text-muted">
                Apply instantly and get responses faster from companies
              </p>
            </div>
          </div>

          <div className="col-md-4">
            <div className="card job-card p-4 text-center h-100">
              <h3>🎯 Smart Matching</h3>
              <p className="text-muted">
                We suggest jobs based on your skills & profile
              </p>
            </div>
          </div>

          <div className="col-md-4">
            <div className="card job-card p-4 text-center h-100">
              <h3>🏆 Top Companies</h3>
              <p className="text-muted">
                Work with Google, TCS, Infosys and more
              </p>
            </div>
          </div>

        </div>

      </div>

      
      <div className="container mb-5">

        <div className="p-5 text-center rounded-4 shadow-lg bg-dark text-white">

          <h2 className="fw-bold">Trusted by Professionals</h2>

          <div className="row mt-4">

            <div className="col-md-4">
              <h3>1000+</h3>
              <p>Jobs</p>
            </div>

            <div className="col-md-4">
              <h3>500+</h3>
              <p>Companies</p>
            </div>

            <div className="col-md-4">
              <h3>10k+</h3>
              <p>Users</p>
            </div>

          </div>

          <Link to="/jobs" className="btn btn-warning mt-3 px-4">
            Explore Now
          </Link>

        </div>

      </div>

    </div>
  );
}

export default Home;