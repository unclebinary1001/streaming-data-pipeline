val nums = List(1, 2, 3, 4, 5)

def mySum(listOfNumbers: List[Int]):Int = {
  if(listOfNumbers.isEmpty) {
    0
  } else {
    listOfNumbers.head + mySum(listOfNumbers.tail)
  }
}

println(mySum(nums))

val directionalStates = Array(
  "West Virginia",
  "North Dakota",
  "South Dakota",
  "North Carolina"
)

def myFilter(states: Array[String], output: Array[String]): Array[String] = {
  if (states.isEmpty) {
    output
  } else if (states.head.contains("North")) {
    val newOutput: Array[String] = output :+ states.head
    myFilter(states.tail, newOutput)
  } else {
    myFilter(states.tail, output)
  }
}
val input: Array[String] = new Array[String](0)
myFilter(directionalStates, input)
println(input.length)