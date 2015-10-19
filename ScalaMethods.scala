
def foo(x:Int, y:Int, z:String) = z + x + y

println(foo(4, 3, "Hello"))

def bar(x:Int, y:Int):Int = {
   return (x + y)
}

def baz(x:Int, y:Int) = {
   val a = 100
}

println(bar(10, 50))
