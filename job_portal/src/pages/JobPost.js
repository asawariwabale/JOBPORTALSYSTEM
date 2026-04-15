/*import { useState } from "react";
import axios from "axios";

function JobPost() {

  const [job, setJob] = useState({
    title: "",
    location: "",
    salary: "",
    description: ""
  });

  const handleChange = (e) => {
    setJob({ ...job, [e.target.name]: e.target.value });
  };

  const handleSubmit = async () => {
    try {
      await axios.post("http://localhost:8089/jobs", job);
      alert("Job Posted Successfully 🚀");

      setJob({
        title: "",
        location: "",
        salary: "",
        description: ""
      });

    } catch (error) {
      console.log(error);
      alert("Error posting job ❌");
    }
  };

  return (
    <div className="container mt-5 col-md-6">

      <div className="card p-4 shadow">

        <h3 className="mb-3">Post a Job</h3>

        <input
          name="title"
          className="form-control mb-2"
          placeholder="Job Title"
          value={job.title}
          onChange={handleChange}
        />

      

        <input
          name="location"
          className="form-control mb-2"
          placeholder="Location"
          value={job.location}
          onChange={handleChange}
        />

        <input
          name="salary"
          className="form-control mb-2"
          placeholder="Salary"
          value={job.salary}
          onChange={handleChange}
        />

        <textarea
          name="description"
          className="form-control mb-3"
          placeholder="Job Description"
          value={job.description}
          onChange={handleChange}
        />

        <button className="btn btn-success w-100" onClick={handleSubmit}>
          Post Job
        </button>

      </div>

    </div>
  );
}

export default JobPost;*/
import { useState } from "react";
import axios from "axios";

function JobPost() {

  const [job, setJob] = useState({
    title: "",
    location: "",
    salary: "",
    description: "",
    jobtype: "full time",
    recruiter: {
      recruiterId: 7   // temporary hardcoded
    }
  });

  const handleChange = (e) => {
    setJob({ ...job, [e.target.name]: e.target.value });
  };

  const handleSubmit = async () => {
    try {
      await axios.post("http://localhost:8089/jobs", job);

      alert("Job Posted Successfully 🚀");

      setJob({
        title: "",
        location: "",
        salary: "",
        description: "",
        jobtype: "full time",
        recruiter: {
          recruiterId: 7
        }
      });

    } catch (error) {
      console.log(error);
      alert("Error posting job ❌");
    }
  };

  return (
    <div className="container mt-5 col-md-6">

      <div className="card p-4 shadow">

        <h3 className="mb-3">Post a Job</h3>

        <input
          name="title"
          className="form-control mb-2"
          placeholder="Job Title"
          value={job.title}
          onChange={handleChange}
        />

        <input
          name="location"
          className="form-control mb-2"
          placeholder="Location"
          value={job.location}
          onChange={handleChange}
        />

        <input
          name="salary"
          className="form-control mb-2"
          placeholder="Salary"
          value={job.salary}
          onChange={handleChange}
        />

        <textarea
          name="description"
          className="form-control mb-3"
          placeholder="Job Description"
          value={job.description}
          onChange={handleChange}
        />

        <button className="btn btn-success w-100" onClick={handleSubmit}>
          Post Job
        </button>

      </div>

    </div>
  );
}

export default JobPost;