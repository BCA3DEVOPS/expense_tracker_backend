# 💸 Expense Tracker – Project Workflow & Deployment Guide

This project was completed step‑by‑step. Below is the **exact workflow followed**, from development to final presentation.

---

## 1️⃣ Frontend & Backend Development

### Frontend

* Built using **React**
* Features:

  * Add expense
  * View expense list
  * Edit & delete expense
  * Monthly filter and total calculation
* Axios used to connect with backend APIs

### Backend

* Built using **Spring Boot**
* REST APIs for:

  * Create expense
  * Fetch all expenses
  * Update expense
  * Delete expense
  * Filter by month
* Database: **H2 (In‑memory)**

---

## 2️⃣ Push Frontend & Backend to GitHub

* Frontend and backend maintained in **separate repositories**
* Initial commit pushed after successful local testing
* GitHub repositories created and verified

---

## 3️⃣ Proper Pull Request

* Changes were pushed to feature branch
* **Pull Request created** to merge into main branch
* Code reviewed and merged properly

---

## 4️⃣ SonarQube Analysis

* SonarQube used for **static code analysis**
* Checked for:

  * Bugs
  * Code smells
  * Maintainability
* Quality gate verified before proceeding further

  <img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/e3caeaae-095e-4580-b3c5-d905ba4a366d" />
  Issue Description:
     SonarQube analysis indicates a FAILED status for the frontend module due to code coverage requirements. 

   Reason:
     Frontend automated test cases have not yet been implemented, which results in low/zero test coverage and causes the Quality Gate to fail.

  Actions Taken:
      All identified bugs and code smells were reviewed and addressed.
      Security Hotspots were reviewed and marked as Safe.
      The remaining failure is only related to test coverage metrics.

  Conclusion:
     The SonarQube failure is limited to coverage constraints and does not reflect issues in code functionality or security.
     Frontend test cases are planned to be added in a future phase to improve coverage and meet Quality Gate requirements.
  
For Frontend :
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/d0d3326d-900c-47d7-a176-726933f9d677" />

For Backend:
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/a1a52b45-6ab9-4392-b897-a8447742929c" />


---

## 5️⃣ Docker Image Creation

* Dockerfile created for backend application
* Backend application containerized using **Docker**
* Docker image built successfully
![1000111207](https://github.com/user-attachments/assets/6f659087-c517-4a7b-915f-5618f3479d69)


---

## 6️⃣ Deployment

### Backend Deployment (Render)

* Docker image deployed to **Render**
* Backend API exposed publicly
* API tested using browser / Postman

**Backend URL:**
👉 [https://expense-tracker-backend-6-0eh1.onrender.com](https://expense-tracker-backend-6-0eh1.onrender.com)

---

### Frontend Deployment (Vercel)

* React frontend deployed using **Vercel**
* Environment variable configured for backend API URL
* Build command configured properly

**Build Command:**

```
npm run build
```

**Output Directory:**

```
build successfully
```
![1000111209](https://github.com/user-attachments/assets/06f48677-8d3f-462d-b4d0-0da85384fd49)

###BACKEND DEPLOYMENT

![1000111208](https://github.com/user-attachments/assets/325d7ad9-c94b-41a3-bc66-deb75dbf3da0)


## 7️⃣ Custom Domain Configuration

* Free domain obtained using **GitHub Student Developer Pack (Namecheap)**
* Domain connected to Vercel project
* DNS configured using:

  * **A Record** for root domain
  * **CNAME** for www
* SSL certificate enabled automatically by Vercel

**Custom Domain:**
👉 [https://meenu.me](https://meenu.me)

## 8️⃣ Final Live Links

* 🌍 Frontend (Custom Domain):

  https://meenu.me

* 🌍 Frontend (Vercel Default):

  https://expense-tracker-meenakshi.vercel.app/

* 🔗 Backend API:

  https://expense-tracker-backend-6-0eh1.onrender.com

## 🔟 Project Presentation

* Project is **ready for live demo**
* Will be presented in class using **PPT**
* Demo includes:

  * Live website
  * Expense CRUD operations
  * Domain name working
  * Deployment explanation
