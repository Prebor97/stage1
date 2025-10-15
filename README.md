#  Profile API — `/me` Endpoint

This is a simple Spring Boot application that exposes a `/me` endpoint returning user profile information along with a random cat fact fetched dynamically from the [Cat Facts API](https://catfact.ninja/fact).

---

##  Setup Instructions

### **1. Prerequisites**
Make sure you have the following installed on your system:
- **Java 17+**
- **Maven 3.8+**
- **Internet connection** (required to fetch cat facts)

---

### **2. Clone the Repository**
```bash
git clone https://github.com/Prebor97/stage1.git
cd stage1
```
### **3. Build the project**
Use Maven to build the project
```bash
mvn clean install
```
### **Run the Application**
Start the Spring Boot application with:
```bash
mvn spring-boot:run
```
The application will start on http://localhost:8080
by default.

## Testing the `/me` Endpoint

### **1. Using cURL**

Run this command in your terminal:

```bash
curl -X GET http://localhost:8080/me
 ```
### **2. Using postman or browser
####  Open your browser or postman
#### Send a get request to:
```bash
http://localhost:8080/me
```
### **3. Expected JSON Response**

```json
{
  "status": "success",
  "user": {
    "email": "prebstamar@gmail.com",
    "name": "Tamarakro Prebor",
    "stack": "Java/Spring Boot"
  },
  "timestamp": "2025-10-15T12:34:56.789Z",
  "fact": "Cats sleep 70% of their lives."
}
```
#### Author: Tamarakro Prebor
#### Stack: Java
#### Mail: prebstamar@gmail.com

# Thank you

