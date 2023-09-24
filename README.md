# Job-Search-Application
Making a Job Search Application Using spring boot and H2 database
The Job Search Application is a RESTful API that provides endpoints to manage job search data. It allows users to retrieve, create, update, and delete job search entries.

## Technologies Used

- Java
- Spring Boot
- H2 DATABASE
- Maven

## Dependencies
- Spring Data JPA
- Spring Web
- Spring Validations
- Spring H2 Database

## Prerequisites

- Java 8 or higher installed
- Database setup (MySQL or other supported database)
- IDE (e.g., IntelliJ IDEA, Eclipse)

## API Endpoints

### Get All Jobs

- Endpoint: `GET /allJobs`
- Description: Retrieves all job search entries.
- Response: Array of job search entries.

### Save All Jobs

- Endpoint: `POST /saveAll`
- Description: Saves multiple job search entries.
- Request Body: Array of job search entries.
- Response: Success message.

### Find Jobs by Job Title

- Endpoint: `GET /title/{jobTitle}`
- Description: Finds job search entries by job title.
- Path Parameter:
  - `jobtitle` - Job title to search for.
- Response: Array of job search entries with matching job titles.

### Find Jobs by Job Location

- Endpoint: `GET /location/{jobLocation}`
- Description: Finds job search entries by job location.
- Path Parameter:
  - `location` - Job location to search for.
- Response: Array of job search entries with matching job locations.

### Find Jobs by Employer Name

- Endpoint: `GET /employer/{name}`
- Description: Finds job search entries by employer name.
- Path Parameter:
  - `name` - Employer name to search for.
- Response: Array of job search entries with matching employer names.

### Update Job Salary by ID

- Endpoint: `PUT /info/{id}/{salary}`
- Description: Updates the salary of a job search entry by its ID.
- Path Parameters:
  - `id` - ID of the job search entry.
  - `salary` - New salary value.
- Response: Success message.

### Delete Job by ID

- Endpoint: `DELETE /delete/{id}`
- Description: Deletes a job search entry by its ID.
- Path Parameter:
  - `id` - ID of the job search entry.
- Response: Success message.

## Validation We have In Application

The Job Search Application includes the following validations:

- Email Validation: The `companyEmail` field of a job search entry must be a valid email format.

- Minimum Salary Validation: The `jobSalary` field of a job search entry must be greater than or equal to 20,000.

These validations ensure the data integrity and consistency of the job search entries.

## Data Flow
 * Controller
   ```
       - Controller hold all the endponts with method associated with them, when client query any api they HTTP dispatch directs
          that query to controller. It hold only endpoints.
   ```
* Services
  ```
      - It has actual logic(business logic) for a particular endpoints. 
          It also has a Repo class which hold the datasource for project.
  ```   
 * Repository
   ```
        - It has data source and all the manipulation on data is defined here only.
        - It is a interface which extends the CrudRepository`(public interface JobRepo extends CrudRepository<Job, Long>)`
   ```
 * Model
    ```
      - It has the schema of our Entities which are involved in project.
      - like in this project we have Job as Entity.
      - We also have an Enum which define the type of Job.(HR,IT..)
   ```
 ## Data Structure
 ```
   * Here we are using List(ArrayList) datastructure.
```
