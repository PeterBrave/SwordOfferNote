# 16. 数值的整数次方
Solution版本没有考虑优化的问题，后续增加优化版本

此处需要考虑的一个问题，就是[JAVA中float型和double型是不能被计算机精确存储的](https://blog.csdn.net/bupa900318/article/details/80553695)。

因此没有办法直接判断两个double类型的值是否为相等，
此处需要用到的是无法判断一个double类型的值是否与0相等。

另一个问题就是考虑exponent为负数的情况。