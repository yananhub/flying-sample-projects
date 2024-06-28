# Flying Cache Sample

This is a sample project for Flying Cache, which is a lightweight and efficient in-memory cache system.
The purpose of this project is to provide a simple example to help you understand how to use Flying Cache
in your own projects.

## Getting Started

To get started with Flying Cache Sample, you need to have Java 17 or above installed.

### Installation

1. Clone the repository from GitHub:
```bash
git clone https://github.com/yananhub/flying-sample-projects.git
```
2. Navigate to the project directory:
```bash
cd flying-sample-projects
```
3. Build the project:
```bash
./gradlew :flying-cache-sample:build
```
4. Run the project:
```bash
java -jar cache/build/libs/flying-cache-sample-1.0.0-SNAPSHOT.jar
```
5. The project will start running and you can use the provided API to interact with the cache.
```bash
curl http://localhost:8080/books/get_books
```

You will see the log output of the project:
```text
2024-06-28T19:24:03.343+08:00  INFO 15552 --- [nio-8080-exec-1] tech.yanand.sample.book.BookController   : Books instance is same: [true]
```