val middleName = Some("R")
val danMiddleName = None

println(middleName.getOrElse("No middle name"))
println(danMiddleName.getOrElse("No middle name"))

case class Worker(val firstName:String, 
               val middleName:Option[String],
               val lastName:String) {
   def this(firstName:String, 
            middleName:String,
            lastName:String) = this(firstName, Some(middleName), lastName)
   def this(firstName:String,
            lastName:String) = this(firstName, None, lastName)
}

val a = new Worker("Kalyan", "Ram", "Chintalapati")
println(a.middleName.getOrElse("No middle name"))

val b = new Worker("Medhavi", "Dhawan")
println(b.middleName.getOrElse("No middle name"))


