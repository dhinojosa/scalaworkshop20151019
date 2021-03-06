
import scala.beans.BeanProperty

// class Employee (@BeanProperty val firstName:String, 
//                 @BeanProperty var lastName:String) {
//    override def toString = s"Employee($firstName, $lastName"
// 
//    override def hashCode = firstName.hashCode + lastName.hashCode
// 
//    override def equals(x:Any) = {
//       if (!x.isInstanceOf[Employee]) false
//       else {
//         val other = x.asInstanceOf[Employee]
//         x.firstName == other.firstName &&
//         x.lastName == other.lastName
//       }
//    }
// }

case class Employee(firstName:String, lastName:String, 
                    department:Department)

class Department private (val name:String)

object Department {
    def apply(name:String) = new Department(name)
}

object Runner {
  def main(args:Array[String]) {
     val e = Department("Hardware")
     println(e.name)
  }
}












