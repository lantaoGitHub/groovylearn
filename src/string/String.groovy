package string

def name = '张三 ${a}'
println name
println name.class

def name_1 = "李四 ${name}"
println name_1
println name_1.class

def name_2 =
"""
王五
${name_1}
"""
println name_2
println name_2.class



// string 常用方法
def defition = "测试"

// 字符串填充(以字符串为中心两端填充) 默认以空格填充
println defition.center(8, "a")
// 结果 aaa测试aaa

// 字符串填充 默认以空格填充
println defition.padLeft(8, "a")
// 结果 aaaaaa测试

// 字符串填充 默认以空格填充
println defition.padRight(8, "a")
// 结果 测试aaaaaa

// 字符串比较
def defition_1 = "测试"
println defition == defition_1
// 结果 true

// 字符串比较
println defition.compareTo(defition_1)
// 结果 0

// 字符串取下标位内容
println defition.getAt(0)
// 结果 '测'

// 字符串取下标位内容
println defition[0]
// 结果 '测'

// 字符串取下标位内容
println defition[0..1]
// 结果 '测试'

// 字符串首字母大写
def defition_2 = "abcd"
println defition_2.capitalize()
// 结果 Abcd

// 字符串移除某些指定字符
println defition_2 - 'a'
// 结果 bcd
