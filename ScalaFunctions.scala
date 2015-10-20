
val f:Function[Int, Int] = new Function1[Int, Int] {
  def apply(x:Int):Int = x + 1
}

val f2:Function[Int, Int] = (x:Int) => x + 1

val f3:Int => Int = (x:Int) => x + 1

val f4:Int => Int = x => x + 1

val f5 = (x:Int) => x + 1

val orig = List(1,2,3,4)
println(orig.map(f))
println(orig)
println(Set(1,2,3,4,5).map(f))
println("Hello!".map(c => (c + 1).toChar).map(c=> (c-1).toChar))

// Java 8
//List<String> list = new ArrayList<>();
//list.add("Foo")
//list.add("Bar")
//list.stream().map(x -> x.size()).collect(Collectors.toList)
//

List(1,2,3,4,5).map(x => x + 1)
               .map(x => x + 10) //add ten to each item
               .map(x => x.size) //determine size




