# JOBPORTALSYSTEM 
A full-stack **Job Portal System** designed to connect **Job Seekers** and **Recruiters** on a single platform.
It enables recruiters to post jobs and manage applicants, while job seekers can search and apply for jobs efficiently.
Built using a scalable architecture with **Spring Boot REST APIs** and a modern **React.js frontend.**

---
## Table of Contents 
1. [Features](#features)
2. [Tech Stack](#tech-stack)
3. [Project Structure](#project-structure)
4. [Installation](#installation)
5. [Usage](#usage)
6. [Screenshots](#Screenshots)

## Features
**User Authentication**
  - Secure user registration and login
  - Role-based access (Job Seeker / Recruiter)
  - Protected routes and session handling

**Job Seeker Features**
  - Browse all available job listings
  - Search jobs by title, category, or keywords
  - Apply for jobs easily
  - View applied jobs and application status
    
**Recruiter Features**
  - Post new job openings
  - Edit and delete job posts
  - View list of applicants
  - Manage job postings efficiently

**System Features**
 - RESTful APIs using Spring Boot
 - MySQL database integration
 - Clean MVC architecture (Controller → Service → DAO)
 - Secure and scalable backend
 - Responsive UI using React

---

## Tech Stack
🔹 **Backend**
   - [Java](https://www.oracle.com/java/)
   - [SpringBoot](https://spring.io/projects/spring-boot)
   - [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
   - [Spring Security](https://spring.io/projects/spring-security)
   - [Hibernate](https://hibernate.org/)
   - [Maven](https://maven.apache.org/)

🔹 **Frontend**
   - [React.js](https://reactjs.org/)
   - [React Rounter](https://reactrouter.com/)
   - [Boostrap](https://getbootstrap.com/)
   - [Axios](https://axios-http.com/)

🔹 **Database**
   - [MySQL](https://www.mysql.com/)


---
## Project Structure    
```plaintext
JOBPORTALSYSTEM
│
├── Job_Portal_SystemBackend   (Spring Boot Backend)
│   ├── controller
│   ├── service
│   ├── dao / repository
│   ├── model
│   ├── config
│   └── resources
│       ├── application.properties
│
├── job_portal (React Frontend)
│   ├── public
│   ├── src
│   │   ├── components
│   │   ├── pages
│   │   ├── services
│   │   ├── context
│   │   └── App.js
│   ├── package.json
│
└── README.md
```
## Installation
 ## 1.Clone the Repository
```bash
git clone https://github.com/your-username/JOBPORTALSYSTEM.git
cd JOBPORTALSYSTEM
```
🔹 **Backend Setup (Spring Boot)**
 ## 2. **Open in Eclipse**
    
    - Open Eclipse IDE
    - Click File → Import → Existing Maven Project
    - Select the backend folder
    - Click Finish
  ## 3. **Configure Database**
```code
 src/main/resources/application.properties
```
```properties
spring.datasource.url=jdbc:mysql://localhost:3307/jobportal
server.port=8089
spring.datasource.username=root
spring.datasource.password=root@123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
## 4.Run Backend

Right click on:
 ```code
JobPortalSystemApplication.java
```
Click:
```code
Run As → Spring Boot App
```
Backend runs on:
``` code
http://localhost:8089
```
🔹 **Frontend Setup (React)**
## 5. Install Frontend Dependencies
```Bash
cd job_portal
npm install
```

## 6.Start Frontend

```Bash
   npm start
```
Frontend runs on:

```Code
http://localhost:3000
```

## Usage
### 1. Start the Backend
From the `backend` directory:
```bash
mvn spring-boot:run
```
- By default, runs on http://localhost:8089`
### Using Eclipse IDE

 1.Open the project in Eclipse

 2.Right-click on
```
JobPortalSystemApplication.java
```
3. Click:
 **Run As → Spring Boot App**

 Backend will start on:
 ```Code
     http://localhost:8089
 ```
### 2. Start the Frontend

Open a new terminal in the `frontend` directory:
```bash
npm start
```
- By default, runs on `http://localhost:3000`

### 3. Access the Application
  Open your browser at `http://localhost:3000`. You can sign up for a new account or log in if  you already have one.

   
