package collector

def maps = [1: '100', 2: '200', 4: '100']
println maps.getClass()

// 循环 Map 通过each 方法， 使用闭包方式
maps.each { s -> println s }

// 循环 Map 使用 for in
for (s in maps) {
    println s.getKey() + '--' + s.getValue()
}

// 对Map 新增和修改操作, 如果key 存在则会更新 已存在key 的 value 值 ，当然 这里也可以使用java 的方法
maps.'3' = ['11': 1100]
println maps.toString()
maps.remove('3')

// 对 Map 删除
maps.remove(2)
println maps.toString()

// 对Map 查找操作 查询一个
println maps.find { s -> s.key.equals(1) }

// 查询全部符合规则元素
println maps.findAll { s -> s.value.equals('100') }

// 按照条件 求数量
println maps.count { s -> s.value.equals('100') }

// 按条件分组
println maps.groupBy { s -> s.value.equals('100') ? '超过100' : '超过200' }

// 排序
maps.put(10,'100')
println maps.sort { a, b -> a.key == b.key ? 0 : a.key > b.key ? 1 : -1 }