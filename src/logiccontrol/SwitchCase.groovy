package logiccontrol

// switch case

def codition = 'test'

switch (codition){
    case 1:
        println 'return int'
        break
    case ['a','b','c','d']:
        println 'return List'
        break
    case ['test':2, 'b':3]:
        println 'return Map'
        break
    default:
        println 'return default'
}