package fr.xebia.scala

object Step1_Basics {

  /*
   * variables are declared and initialized like this:
   *   var name: Type = ...
   * TODO 1: variables
   * => variable should be initialized with a value of 24... is it that simple ?
   */
  var variable: Int = 0

  /*
   * values are declared like variables but with "val" keyword
   * TODO 2: values
   * => value should be defined with a value of 42... keeping it simple
   */
  val value: Int = 0

  /*
   * functions are declared like this:
   *   def name(param: Type): ReturnType = ...
   * TODO 3: functions
   * => square should return the square value of the given x argument
   */
  def square(x: Int): Int = ???

  /*
   * functions can be arguments (a val or a var too) using this syntax:
   *   def name(param: Type => Type): ReturnType = Initializer
   * TODO 4: functions as parameter
   * => plus21 should return f1 result + 21
   */
  def plus21(f1: () => Int): Int = ???

  /*
   * functions can be returned like this:
   *   def name(param: Type): Type => Type = (foo: Type): Type => foo
   * TODO 5: functions as return
   * => product should return a function returning the product of its Int argument and the given x argument
   */
  def product(x: Int): Int => Int = ???

  /*
   * functions can be partially applied like this:
   *   fxy(9, _) or fxy(_, 9)
   * both previous calls return functions of type: Int => Int
   * TODO 6: partial application
   * => fx and fy should return partial functions using given fxy function and respective y and x arguments
   */
  def fxy(x: Int, y: Int): Int = (2 * x) + (y * y)

  def fx(y: Int): Int => Int = ???

  def fy(x: Int): Int => Int = ???

  /*
   * functions can be curried like this:
   *   def foo(x: Int)(y: Int): Int = ???
   * this syntax forces users to pass arguments in distinct calls, thus using an intermediate function
   * TODO 7: curried function
   * => gx and gy should return partial functions using given gxy function and respective y and x arguments
   */
  def gxy(x: Int)(y: Int): Int = (2 * x) - (y * y)

  def gx(y: Int): Int => Int = ???

  def gy(x: Int): Int => Int = ???

  /*
   * functions can have variable length arguments:
   *   def foo(x: Int*): Int = ???
   * TODO 8: variable length arguments
   * => vararg should return sum of x variable length arguments
   */
  def vararg(x: Int*): Int = ???

  /*
   * if/else expressions can be used to return values like this:
   *   def metal(x: String): Int = if (x == "ok") 0 else 1
   * TODO 9: if/else expressions
   * => expression should return "ok" if x argument is 0, "ko" otherwise, using if/else expression
   */
  def expression(x: Int): String = ???

  /*
   * pattern matching expressions can be used to return values like this:
   *   def metal(x: Int): String = x match {
   *     case 0 => "zero"
   *     case 1 => "one"
   *     case 2 => "two"
   *     case i if i < 10 => "less than 10"
   *     case _ => "ten or more than ten"
   *   }
   * TODO 10: pattern matching expressions
   * => oddEven should return "even" if x % 2 == 0, "odd" otherwise, using pattern matching
   */
  def oddEven(x: Int): String = ???

  /*
   * exceptions are handled using pattern matching:
   *   try {
   *     someCall()
   *   } catch {
   *     case e: VeryBadException => print("that one hurt")
   *   } finally {
   *     someClose()
   *   }
   * TODO 11: exceptions
   * => safeHandler should call given unsafe function and handle its exceptions
   * => safeHandler should return exception's message suffixed with ":Finally"
   * => when exception is of Type RuntimeException message should be prefixed with "Runtime:"
   * note: that a nicer alternative is 'scala.util.Try'
   */
  def safeHandler(unsafe: () => Unit): String = ???

}
