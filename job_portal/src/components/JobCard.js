import React, { useState } from "react";
import axios from "axios";

function JobCard({ job }) {

  const [applied, setApplied] = useState(false);
  const [loading, setLoading] = useState(false);

  const handleApply = async () => {
    try {
      setLoading(true);

      
      if (!job?.jobId) {
        alert("Invalid job");
        return;
      }

      const applicationData = {
        job: {
          jobId: job.jobId
        },
        jobSeeker: {
          seekerId: 15 
        }
      };

      console.log("Sending Data:", applicationData);

      const res = await axios.post(
        "http://localhost:8089/applications",
        applicationData
      );

      if (!res.data) {
        throw new Error("Empty response from server");
      }

      console.log("Response:", res.data);

      alert("Applied Successfully 🚀");
      setApplied(true);

    } catch (error) {
      console.log("Apply Error:", error.response?.data || error.message);
      alert("Failed to apply job");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="card shadow-sm p-3 mb-4">

      <h5 className="mb-2">
        {job.title || "No Title"}
      </h5>

      <p><strong>Description:</strong> {job.description || "N/A"}</p>
      <p><strong>Location:</strong> {job.location || "N/A"}</p>
      <p><strong>Salary:</strong> {job.salary || "N/A"}</p>
      <p><strong>Job Type:</strong> {job.jobtype || "N/A"}</p>

      <button
        className={`btn btn-sm ${applied ? "btn-success" : "btn-primary"}`}
        onClick={handleApply}
        disabled={applied || loading}
      >
        {loading
          ? "Applying..."
          : applied
          ? "Applied ✅"
          : "Apply Now"}
      </button>

    </div>
  );
}

export default JobCard;