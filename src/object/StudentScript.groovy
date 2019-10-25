package object

// --------------------------------- 测试对象

// 新建对象
def student = new Student()

// 赋值
student.setName('小明')
student.setAge(100)

// Groovy 中
println "名字：${student.name}, 年龄: ${student.age}"


// 新建对象并赋值
def student1 = new Student(name: '王五', age: 190)

println student1.name + '--' + student1.age


// --------------------------------- 测试接口
InterfactTest impl = new InterfaceTestImpl()
println impl.class

println impl.study()

println impl.coding()