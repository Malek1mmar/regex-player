# 🔍 Regex Demo

A simple Spring Boot REST API to experiment with **Regular Expressions (regex)** in real-time. This project allows you to test input strings against dynamic regex patterns and get matching results.

---

## 🚀 Features

- ✅ Match input strings with custom regex
- ✅ Return matched groups and overall result
- ✅ Predefined endpoints for common patterns:
    - Email validation
    - Phone number extraction
    - Date matching

---

## 📦 Tech Stack

- Java 17+
- Spring Boot 3.x
- Maven
- (Optional) Swagger UI for live testing
- (Optional) H2 or JSON persistence if needed

---

## 🧪 Example

### ➤ Request
`POST /regex/match`

```json
{
  "pattern": "\\d{3}-\\d{2}-\\d{4}",
  "input": "My SSN is 123-45-6789"
}
```
### ➤ Response
```json
{
  "matched": true,
  "matches": [
    "123-45-6789"
  ]
}
```

## 📁 Project Structure

regex/
├── controller/
│   └── RegexController.java
├── model/
│   ├── RegexRequest.java
│   └── RegexResponse.java
├── service/
│   └── RegexService.java
└── RegexDemoApplication.java

## 💡 Sample Patterns

| Use Case          | Pattern                      |                    |
| ----------------- | ---------------------------- | ------------------ |
| Email             | `^[\\w.-]+@[\\w.-]+\\.\\w+$` |                    |
| Phone (US)        | `\\(\\d{3}\\) \\d{3}-\\d{4}` |                    |
| Date (dd/mm/yyyy) | `\\d{2}/\\d{2}/\\d{4}`       |                    |
| Hex Color         | \`#(\[A-Fa-f0-9]{6}          | \[A-Fa-f0-9]{3})\` |
