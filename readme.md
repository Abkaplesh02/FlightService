# ✈️ Flight Service API — Spring Boot Project

## 🧩 Overview
The **Flight Service API** is a Spring Boot–based microservice that manages flight schedules and cargo capacity for an air cargo booking system.  
It allows users to create, retrieve, and update flight information through RESTful endpoints, with proper error handling and DTO-based communication.

This service forms the **Flight Management module** of a larger Cargo Booking System.

---

## 🚀 Key Features
- ✅ **Flight Management CRUD** – Add, retrieve, and update flight records.  
- ✅ **Cargo Weight Update** – Dynamically reduce available cargo capacity when a booking is made.  
- ✅ **DTO Mapping (ModelMapper)** – Ensures clean separation between entity and API layers.  
- ✅ **Exception Handling** – Graceful error responses for invalid flight numbers and bad requests.  
- ✅ **Database Integration (JPA/Hibernate)** – Persists flight data to a relational database.  
- ✅ **Validation & Formatting** – Uses annotations and ISO/standardized date-time handling.  
- ✅ **REST API Ready** – Fully testable via Postman with JSON request/response.

---

## 🧱 Tech Stack
- ☕ **Java 17+**  
- ⚙️ **Spring Boot 3 / Spring Web / Spring Data JPA**  
- 🗃️ **Hibernate (ORM)**  
- 🔄 **ModelMapper (Entity–DTO conversion)**  
- 🧩 **Lombok (boilerplate reduction)**  
- 💾 **H2 / MySQL (configurable database)**  
- 🧪 **Postman (API testing)**

---

## 🧮 API Endpoints

| Method | Endpoint | Description |
|:-------|:----------|:-------------|
| `GET`  | `/flights` | Retrieve all flights |
| `GET`  | `/flights/{flightNumber}` | Retrieve specific flight by flight number |
| `POST` | `/flights` | Add a new flight |
| `PUT`  | `/flights/{flightNumber}` | Update available cargo weight |
| *(Optional)* | `/cargo-bookings` | Integrates with Cargo Booking Service (future scope) |

---

This is official readme file of project
---

## 🗂️ Project Structure

com.sboot.flightservice
│
├── config/ → Configuration beans (e.g., ModelMapper)
├── controller/ → REST controllers
├── dto/ → Request & response DTOs
├── entity/ → JPA entities
├── exception/ → Custom exceptions
├── repository/ → Spring Data repositories
├── service/ → Business logic interfaces
│ └── impl/ → Implementations of services
└── FlightServiceApplication.java → Main class


---

## 💡 Future Enhancements
- 🔗 Integrate with **Cargo Booking Service**  
- 📘 Add **Swagger/OpenAPI documentation**  
- 🧪 Implement **unit & integration tests**  
- 🐳 Deploy with **Docker** and **CI/CD pipeline**

---

## 🧑‍💻 Author
**Abhishek Kaplesh**  
*Spring Boot Developer | Java Backend Engineer*  

🔗 **GitHub:** [Abkaplesh02](https://github.com/Abkaplesh02)
