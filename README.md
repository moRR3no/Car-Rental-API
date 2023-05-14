# Car Rental Management

## Created with
* Java 17
* Spring Boot 3
* H2 Database


## About
It is a REST API project allowing to manage car rental company that has numerous branches in various cities. The end client is supplied with the JSON (in HATEOAS format) responses.

**Main functionalities:**
* Car reservation
* Car rental
* Car return
* Seat list management
* Management of the fleet and their current location
* Revenue calculation
* Statistics

There are different functionalities to manage system assigned to admin, client and employee.

## Launching and usage

* Download the project to your local machine
```bash
git clone https://github.com/moRR3no/Car-Rental-API.git
```
* Launch the app with class named CarRentalApp.java
```bash
package com.carrental.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentalApp {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApp.class, args);
	}

}

```
* Open the app in your browser (f.e. GET all employees)
```bash
http://localhost:8080/employees
```
Here you can use different requests (GET, POST, PUT, DELETE).
*  To see current database state in H2 go to:
```bash
http://localhost:8080/h2-console
```
And put login credentials as mentioned in [application.properties](https://github.com/moRR3no/Car-Rental-API/blob/master/src/main/resources/application.properties) file.

## Version control: 
- system: GIT
- branches:
  - master – approved latest version
  - kpstrongowski – improving features
