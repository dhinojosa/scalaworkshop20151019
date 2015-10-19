
val a = 10 //Prefer val over var
var b = 30

b = 40
//b = "Strings!":String //b is already establish as a Int

val c:String = "Scala Rulz" //explicit type
val d = "Haskell is kind of cool":String //coersion

val e = new Employee("Gordon", "Good")
println(e.firstName)
println(e.lastName)

e.lastName = "Great"

println(e.lastName)

val areYouDiggingScala_?! = true

val `Is this kind of thing interesting to you?` = false 

val `void` = 19

val `return` = 39

val `true` = false

val result = if (`true`) `return` else `void`

println(result)

val f:Byte = 40
val f2 = 40:Byte
val f3 = 40.toByte

var g = 0 //Imperitive
if (f > 10) {
  g = 100  //Works
} else {
  g = 200
}
println(g)

val g2 = if (f > 10) {
  val aa = 10
  val bb = 90
  100
} else 200 //Functional

println(g2)

import scala.collection.mutable.ListBuffer
val r = new ListBuffer[Int]
for (i <- 1 to 100) { //Imperative
   r += (i + 1)
}
println(r)

val h = for (i <- 1 to 100) yield (i + 1) //Functional
println(h)

val s = "Hello %s, hope you are enjoying %s"
val i = s.format("Binyuan", "Scala")
val i2 = s.format("Medhavi", "Clojure")

val name = "Priya"
val language = "Haskell"

val i3 = s"Hello $name, hope you are enjoying $language"
println(i)
println(i2)
println(i3)















