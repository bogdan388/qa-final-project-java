# QA Final Project Java

![CI Pipeline](https://github.com/bogdan/qa-final-project-java/actions/workflows/ci.yml/badge.svg)

## Description

This project is a Java-based API testing framework built with Maven. It demonstrates best practices for test automation, including:

- API testing with REST Assured
- Configuration management with YAML
- Containerization with Docker
- CI/CD pipeline with GitHub Actions
- Automated testing and deployment

The project tests the JSONPlaceholder API endpoint to verify correct responses and data structure.

## Project Structure

```
qa-final-project-java/
├── config/
│   └── app.yaml
├── data/
├── src/
│   └── test/
│       └── java/
│           └── com/
│               └── bogdan/
│                   └── tests/
│                       └── ApiTest.txt
├── .github/
│   └── workflows/
│       └── ci.yml
├── Dockerfile
├── pom.xml
└── README.md
```

## Prerequisites

- Java 21 LTS or higher
- Maven 3.9 or higher
- Docker (for containerized execution)
- Docker Hub account (for CI/CD pipeline)

## Running Tests Locally

To run the tests locally using Maven:

```bash
mvn test
```

This command will:
- Download all required dependencies
- Compile the test code
- Execute all tests
- Generate a test report

## Building and Running with Docker

### Build the Docker Image

```bash
docker build -t qa-final-project-java:latest .
```

### Run the Docker Container

```bash
docker run --rm qa-final-project-java:latest
```

This will execute the tests inside a containerized environment.

### Run with Custom Tag

```bash
docker build -t yourusername/qa-final-project-java:v1.0 .
docker run --rm yourusername/qa-final-project-java:v1.0
```

## CI/CD Pipeline

The project uses GitHub Actions for continuous integration and deployment.

### Pipeline Workflow

1. **Test Job**: Runs on every push to the main branch
   - Checks out the code
   - Sets up Java 21 LTS
   - Caches Maven dependencies
   - Executes tests with `mvn test`

2. **Build and Push Job**: Runs only if tests pass
   - Builds the Docker image
   - Pushes the image to Docker Hub

### Setting Up Secrets

To enable the CI/CD pipeline, configure the following secrets in your GitHub repository:

1. Go to Settings > Secrets and variables > Actions
2. Add two repository secrets:
   - `DOCKERHUB_USERNAME`: Your Docker Hub username
   - `DOCKERHUB_TOKEN`: Your Docker Hub access token

### Viewing Pipeline Status

Check the Actions tab in your GitHub repository to view pipeline runs and their status.

## Configuration

Project configuration is managed through `config/app.yaml`:

```yaml
env: test
service:
  baseUrl: https://jsonplaceholder.typicode.com
timeouts:
  default: 5000
  connection: 3000
  read: 10000
```

## Test Description

The project includes an API test that verifies:
- GET request to `https://jsonplaceholder.typicode.com/todos/1`
- Returns HTTP status 200
- Response contains a `title` field
- Title field is not empty

Test logic is documented in `src/test/java/com/bogdan/tests/ApiTest.txt`.

## Dependencies

- JUnit Jupiter 5.9.3 - Testing framework
- REST Assured 5.3.1 - API testing library
- Maven Surefire Plugin 3.0.0 - Test execution

## License

This project is created for educational purposes as part of a QA final project.
