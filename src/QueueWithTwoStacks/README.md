# 9. 用两个队列实现栈
> 在开始本节的编码之前，让我们首先来了解一下Java中有关栈和队列的相关知识。

### Stack
栈是**Vector**的一个子类，它实现了一个标准的后进先出的栈。

堆栈只定义了默认构造函数，用来创建一个空栈。堆栈除了包括由**Vector**定义的所有方法，也定义了自己的一些方法。

```java
boolean empty()
```
测试堆栈是否为空
```java
E peek()
```
返回栈顶元素，但不弹出。如果栈为空，请不要调用这个方法
```java
E pop()
```
弹出并返回栈顶的item。如果栈顶为空，请不要调用这个方法
```java
E push(E item)
```
将item压入栈并返回item

### Queue
队列是一种特殊的线性表，他只允许在表的前端进行删除操作，而在表的后端进行插入操作。

LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。

```java
Queue<String> queue = new LinkedList<String>();
```

```java
boolean add(E element)
boolean offer(E element)
```
如队列没有满，将给定的元素添加到这个双端队列的尾部并返回`true`。如果队列满了，第一个方法将抛出一个`IllegalStateException`，而第二个方法返回`false`。
```java
E remove()
E poll()
```
假如队列不空，删除并返回这个队列头部的元素。如果队列是空的，第一个方法抛出`NoSuchElementException`，而第二个方法返回`null`。
```java
E element()
E peek()
```
如果队列不为空，返回这个队列头部元素，但不删除。如果队列为空，第一个方法将抛出一个`NoSuchElementException`，而第二个方法返回`null`。

## 两个栈实现队列

栈是先入后出，队列是先入先出

因此两个实现一个的时候，肯定有一个是用来辅助的，可以通过自己画示意图来帮助思考。

**push:** 往`stack1`里面`push`值

**pop:** 从`stack2`中`pop`值，如果`stack2`为空，则将`stack1`中的值全部`pop`到`stack2`中去，如果`stack1`也为空，则返回-1。

## 两个队列实现栈

思路同上

两个队列一个保证有值，另一个用来承担过渡或者辅助功能。

**push:** 往有值的队列里面 `push`，如果两个队列都没有值，那么随意选择一个队列往里面`push`值。

**pop:** 把有值的队列里的最后一个`pop`出来，该值前面的值依次`push`到另外一个没有值的队列里去。如果两个队列都为空，则返回-1。