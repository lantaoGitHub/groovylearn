package logiccontrol


def count = 0

// 0..9 是指范围，意思就是对 0 - 9 一次进行循环
for (a in 0..9)
    count += a

println "Count 总数为：" + count