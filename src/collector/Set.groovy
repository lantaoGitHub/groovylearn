package collector

def set = [1,2,3,4] as HashSet

// 对set进行新增操作
set.add(8)
println set

// 对数组进行删除操作
set.remove(3)
println set

// 查找第一个元素
println set.find()

// 查找指定元素 (使用Groovy 闭包 相当于Java 的 lamdba )
println set.find { s -> s.equals(8) }

// 查找全部元素 (findAll 也可以指定闭包，也就是指定条件)
println set.findAll()

// 排序
set.sort()
println set

// 自定义排序条件 闭包方式
set.sort { a, b -> a == b ? 0 : a > b ? 1 : -1 }
println set