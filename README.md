# Project Spring Boot Project With MongoDB Database!!

In this application, I built a robust REST API with the help of a Spring Boot framework. This REST API will support major
HTTP methods like GET, POST, PUT and DELETE and will also be integrated with a NoSQL MongoDB database!

# Technologies used

* **Language:** Java 17
* **Versioning:** Git/GitHub
* **IDE:** IntelliJ IDEA Community Edition
* **DataBase:** MongoDB
* **Framework:** Spring Boot

## API Endpoints

To make the HTTP requests below, the tool [Postman](https://www.postman.com/) was used:

- Create Product
```
$ POST http://localhost:8080/api/products

[
  {
    "productName" : "IPad mini",
    "productPrice" : "699.99",
    "productDescription" : "Very cool IPad!!"
  }
]
```

- List all Products
```
$ GET http://localhost:8080/api/products

[
  {
    "productId": "65a5688f3ef52b15fb94fce1",
    "productName": "IPad mini",
    "productPrice": 699.99,
    "productDescription": "Very cool IPad!"
  }
]
```

- List product by id
```
$ GET http://localhost:8080/api/65a5688f3ef52b15fb94fce1

[
  {
    "productId": "65a5688f3ef52b15fb94fce1",
    "productName": "IPad mini",
    "productPrice": 699.99,
    "productDescription": "Very cool IPad!"
  }
]
```

- Update Product
```
$ PUT http://localhost:8080/api/products/65a5688f3ef52b15fb94fce1

[
  {
    "productId": "65a5688f3ef52b15fb94fce1",
    "productName": "IPad mini",
    "productPrice": 899.99,
    "productDescription": "Very cool IPad!"
  }
]
```

- Remove Product
```
DELETE http://localhost:8080/api/products/65a5688f3ef52b15fb94fce1

[ ]
```

<br>

<h3>Author</h3>

<a href="https://www.linkedin.com/in/danielpereiralima/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/96916005?v=4" width="100px;" alt=""/>

Made by Daniel Pereira Lima 👋🏽 Contact!

[![Linkedin Badge](https://img.shields.io/badge/-Daniel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/danielpereiralima/)](https://www.linkedin.com/in/danielpereiralima/)