Trần Trung Đức - BIT220204 - 22SE1.1

Bài tập 2 của môn "Kiểm thử phần mềm"

Đề bài: Kiểm thử nâng cao với Java(thuật toán QuickSort).

## Yêu cầu trước khi sử dụng:
- Java Development Kit (JDK) 8 hoặc mới hơn.
- Công cụ build Maven.
- JUnit 5 để kiểm thử.
## Kiểm thử thuật toán với JUnit 5:
- Các trường hợp kiểm thử đầy đủ cho thuật toán QuickSort, bao phủ các trường hợp của thuật toán.
## Cài đặt 
Clone repository:
```bash
git clone https://github.com/dukesodope/QuickSort-Test.git
cd QuickSort-Test
```
Xây dựng dự án bằng Maven:
```bash
mvn clean install
```
## Các phương thức được sử dụng
- quicksort
- partition
    
## Cách sử dụng
```bash
mvn exec:java -Dexec.mainClass="com.example.SortUtils"
mvn test
```
## Đầu vào
```bash
arr = [10, 7, 8, 9, 1, 5]
```
## Kết quả
```bash
Mảng sau khi sắp xếp: [1, 5, 7, 8, 9, 10]
```
## Cấu trúc dự án
    ├── src
    │   ├── main
    │   │   └── java
    │   │       └── SortUtils.java
    │   └── test
    │       └── java
    │           └── SortUtilsTest.java
    ├── pom.xml
    └── README.md
## Kết quả kiểm thử
![Screenshot_2](https://github.com/user-attachments/assets/9b998433-c894-4283-b7fb-df080734d3eb)

