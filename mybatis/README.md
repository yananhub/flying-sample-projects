# Flying Mybatis Sample

This is a sample project for Flying Mybatis, a lightweight and efficient ORM framework.
The purpose of this project is to provide a simple example to help you understand 
how to use Flying Mybatis in your projects.

## Getting Started

To get started with Flying Mybatis Sample, you need to have Java 17 or above installed.

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
./gradlew :flying-mybatis-sample:build
```
4. Run the project:
```bash
java -jar mybatis/build/libs/flying-mybatis-sample-1.0.0-SNAPSHOT.jar
```

You will see the log output of the project:
```text
2024-06-28T19:27:12.069+08:00  INFO 14208 --- [           main] t.yanand.sample.BookCommandLineRunner    : Select result: [Book{id=0, name='test_book_1', publishDate=2024-06-28}, Book{id=1, name='test_book_2', publishDate=2024-06-28}]
```



