package interfacesegregation

class Penguin extends Bird with SwimmerBird {
  override def eat(): String= "Penguin eats fish"

  override def swim(): String= "Penguin can swim"
}
