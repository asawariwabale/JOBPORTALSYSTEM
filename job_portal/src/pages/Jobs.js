/*import { useEffect, useState } from "react";
import axios from "axios";
import JobCard from "../components/JobCard";

function Jobs() {

  const [jobs, setJobs] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8089/jobs")
      .then(res => setJobs(res.data))
      .catch(err => console.log("Error fetching jobs:", err));
  }, []);

  return (
    <div className="container py-4">

      
      <div className="text-center mb-4">
        <h2 className="fw-bold">Available Jobs 🚀</h2>
        <p className="text-muted">Find jobs that match your skills</p>
      </div>

      
      <div className="row g-4">
        {jobs.map(job => (
          <div className="col-md-6 col-lg-4" key={job.id}>
            <JobCard job={job} />
          </div>
        ))}
      </div>

    </div>
  );
}

export default Jobs;*/

import { useEffect, useState } from "react";
import axios from "axios";
import JobCard from "../components/JobCard";

function Jobs() {

  const [jobs, setJobs] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8089/jobs")
      .then(res => {
        console.log(res.data); // debug (optional)
        setJobs(res.data);
      })
      .catch(err => console.log("Error fetching jobs:", err));
  }, []);

  return (
    <div className="container py-4">

      {/* Header */}
      <div className="text-center mb-4">
        <h2 className="fw-bold">Available Jobs 🚀</h2>
        <p className="text-muted">Find jobs that match your skills</p>
      </div>

      {/* Job List */}
      <div className="row g-4">
        {jobs.map(job => (
          <div className="col-md-6 col-lg-4" key={job.jobId}>
            <JobCard job={job} />
          </div>
        ))}
      </div>

    </div>
  );
}

export default Jobs;