package collector

// 定义List 集合 默认使用 java.util.ArrayList
def listTest = ['1', '2', '3', '4', '5']
println listTest.class


// 定义List 集合 默认使用 java.util.ArrayList
def listLinked = ['1', '2', '3', '4', '5'] as LinkedList
println listLinked.class

// 对数组进行新增操作
listTest.add('8')

// 对数组进行删除操作
listTest.remove('5')

// 查找第一个元素
println listTest.find()

// 查找指定元素 (使用Groovy 闭包 相当于Java 的 lamdba )
println listTest.find { s -> s.equals(9) }

// 查找全部元素 (findAll 也可以指定闭包，也就是指定条件)
println listTest.findAll()

// 修改元素
listTest.set(1, '100')
println listTest

// 排序
def numList = [1, 3, 4, 5, 7]
numList.sort()
println numList

// 自定义排序条件 闭包方式
numList.sort { a, b -> a == b ? 0 : a > b ? 1 : -1 }
println numList