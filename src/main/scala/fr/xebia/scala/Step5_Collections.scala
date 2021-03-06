package fr.xebia.scala

import fr.xebia.scala.model.{Director, Film}

object Step5_Collections {

  /*
   * TODO 1: filter
   * => getFilmsMadeBy should return films directed by the given director
   */
  def getFilmsMadeBy(director: Director, films: List[Film]): List[Film] = ???

  /*
   * TODO 2: filter using curryfication
   * => filterFilmsWithDirector should return films directed by the given director (with currying)
   */
  def filterFilmsWithDirector(films: List[Film])(director: Director): List[Film] = ???

  /*
   * TODO 3: filter using high order function (function as parameter)
   * => filterFilmsUsingFilter should return films directed by the given director (using given filter)
   */
  def filterFilmsUsingFilter(films: List[Film])(withCustomFilter: Film => Boolean): List[Film] = ???

  /*
   * TODO 4: filter implementation using pattern matching and recursion
   * => filter should return a list of film matching the given predicate, using pattern matching
   * note: you can use pattern matching on a list like this "case head :: tail => ..."
   */
  def filter(films: List[Film])(withCustomFilter: Film => Boolean): List[Film] = ???

  /*
   * TODO 5: multi filter, pattern matching and recursion (again)
   * => filterFilmsUsingMultipleFilter should return a list of films matching all given predicates
   * note: you can use pattern matching on a list like this "case head :: tail => ..."
   */
  def filterFilmsUsingMultipleFilter(films: List[Film])(withCustomFilters: List[Film => Boolean]): List[Film] = ???

  /*
   * TODO 6: collection iteration and 'reduction' using recursion
   * => sumPricesWithRecursion should sum the price of the given films (using recursion)
   * note: it can be as simple as films.map(_.price).sum, but for the sake of the exercise use recursion
   * note: you can define a function inside a function
   */
  def sumPricesWithRecursion(films: List[Film]): Double = ???

  /*
   * TODO 7: pattern matching on tuples
   * => discounts should return a discount for each film according to the following rules:
   * - 35% reduction if price is only multiple of 3
   * - 40% reduction if price is only multiple of 5
   * - 50% reduction if price is both multiple of 5 and 3
   * - 0% reduction otherwise
   * note: you can define a tuple like this: "x => (x + 2, x * 2)"
   * note: you can use pattern matching on a tuple "case (2, 4) => ..."
   */
  def discounts(films: List[Film]): List[Double] = ???

  /*
   * TODO 8: foldLeft usage
   * => sumPricesWithFolding should use List#foldLeft to return the given films prices sum
   */
  def sumPricesWithFolding(films: List[Film]): Double = ???

  /*
   * TODO 9: foldLeft usage to delete duplicate films
   * => deleteDuplicates should use List#foldLeft to return a list containing distinct films only
   */
  def deleteDuplicates(allFilms: List[Film]): List[Film] = ???

  /*
   * TODO 10: zip implementation
   * => zip should return a list of tuple of A and B containing every respective element from first and second
   * => zip should return Nil for every element with no corresponding value in the other list
   * note: use pattern matching and recursion... what else ?
   */
  def zip[A, B](first: List[A], second: List[B]): List[(A, B)] = ???

  /*
   * TODO 11: zip with index implementation
   * => zipWithIndex should return a list of tuple of A and Int containing every element from first with its index
   */
  def zipWithIndex[A](first: List[A]): List[(A, Int)] = ???

  /*
   * TODO 12: list initialization
   * => fillList should return a list containing given element n times
   */
  def fillList[A](index: Int)(element: A): List[A] = ???

}



