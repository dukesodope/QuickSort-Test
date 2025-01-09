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
1. Chạy chương trình QuickSort
```bash
python quicksort.py
```
2. Thực thi bộ kiểm tra
```bash
python -m unittest discover tests
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
## Kết quả
