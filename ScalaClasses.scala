
val a = new Employee("Victor", "G", new Department("Gardening"))
val b = a match {
   case Employee(f, _, d) => 
        "Your first name is " + f + "and you work in" + d
   case _ => "I don't know you"
}
val c = a.copy(firstName="Reid")

println(b)
