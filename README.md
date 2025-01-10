Trần Trung Đức - BIT220204 - 22SE1.1

Bài tập 2 của môn "Kiểm thử phần mềm"

Đề bài: Kiểm thử nâng cao với Java(thuật toán QuickSort).
## Link ChatGPT
https://chatgpt.com/share/677fdf26-03f0-8013-aba0-bc2cf1474a38
## Yêu cầu trước khi sử dụng:
- Java Development Kit (JDK) 8 hoặc mới hơn.
- Công cụ build Maven.
- JUnit 5 để kiểm thử.
## Kiểm thử thuật toán với JUnit 5:
- Các trường hợp kiểm thử đầy đủ cho thuật toán QuickSort, bao phủ các trường hợp của thuật toán.
## Các trường hợp kiểm thử
- Mảng rỗng
- Mảng có một phần tử
- Mảng đã sắp xếp
- Mảng chứa các giá trị trùng lặp
- Mảng đảo ngược
- Mảng có số âm và dương
- Mảng có số 0
- Mảng có giá trị cực trị
- Mảng với các phần tử bằng nhau
- Mảng lớn
- Mảng có phần tử lớn nhất ở giữa
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
## Mức độ bao phủ **`Test Coverage`**
- Class: 100% (1/1)
- Method: 100% (2/2)
- Line: 100% (16/16)
- Branch: 100% (6/6)
![Screenshot_3](https://github.com/user-attachments/assets/2e61b409-9ba3-434a-8d12-448551e2afc4)

## Kết quả kiểm thử
![Screenshot_2](https://github.com/user-attachments/assets/9b998433-c894-4283-b7fb-df080734d3eb)

