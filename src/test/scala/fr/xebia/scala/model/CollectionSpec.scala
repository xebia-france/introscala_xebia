package fr.xebia.scala.model

import fr.xebia.scala.control.CollectionTools
import fr.xebia.scala.model.Director._
import fr.xebia.scala.model.Genre._
import org.scalatest.{FunSpec, Matchers}

class CollectionSpec extends FunSpec with MockFilmData with Matchers {

  describe("several utilitary methods in List") {

    it("should use List#filter") {
      // when
      val films = Film.getFilmsMadeBy(Hitchcock, completeList)
      // then
      films shouldBe hitchcockFilms
    }

    it("should use films List#filter and curring") {
      // when
      val filmFilter = Film.filterFilmsWithDirector(completeList) _
      // then
      filmFilter(Hitchcock) shouldBe hitchcockFilms
      filmFilter(Kurosawa) shouldBe kurosawaFilms
    }

    it("should use films List#filter and high order functions") {
      // when
      val filmFilter = Film.filterFilmsUsingFilter(completeList) _
      // then
      filmFilter(_.director == Hitchcock) shouldBe hitchcockFilms
      filmFilter(_.director == Kurosawa) shouldBe kurosawaFilms
    }

    it("should use films Collection#filter and high order functions") {
      // when
      val filmFilter = Film.filterFilmsUsingFilter2(completeList) _
      // then
      filmFilter(_.director == Hitchcock) shouldBe hitchcockFilms
      filmFilter(_.director == Kurosawa) shouldBe kurosawaFilms
    }

    it("should use films List#filter and several filters") {
      // when
      val filmFilter = Film.filterFilmsUsingMultipleFilter(completeList) _
      // then
      filmFilter(List(
        _.director == Hitchcock,
        _.price > 3
      )) shouldBe List(vertigo)

      filmFilter(List(
        _.director == Kurosawa,
        _.price < 2.4
      )) shouldBe List(ran)
    }

    it("should implement List#sum") {
      Film.sumPricesWithRecursion(hitchcockFilms) shouldBe 7.8
      Film.sumPricesWithRecursion(kurosawaFilms) shouldBe 5.3
    }

    it("should use pattern matching") {
      val film1 = Film("Videodrome", 1984, RandomDirector, List(Horror), 9)
      val film2 = Film("Donnie Darko", 2002, RandomDirector, List(Drama, SciFi), 10)
      val film3 = Film("The Adventures of Baron Munchausen", 1989, RandomDirector, List(Comedy), 15)
      val film4 = Film("Brazil", 1985, RandomDirector, List(SciFi), 2)
      val discountFilms = film1 :: film2 :: film3 :: film4 :: Nil
      Film.discounts(discountFilms) shouldBe List(3.15, 4.0, 7.5, 2.0)
    }

    it("should use folding to sum film prices") {
      Film.sumPricesWithFolding(hitchcockFilms) shouldBe 7.8
      Film.sumPricesWithFolding(kurosawaFilms) shouldBe 5.3
    }

    it("should use films List#zip") {
      PriceCalculations.calculateTotalPrice(List.empty[Film], List(3, 5)) shouldBe None
      PriceCalculations.calculateTotalPrice(kurosawaFilms, List.empty) shouldBe None
      PriceCalculations.calculateTotalPrice(kurosawaFilms, List(3, 5)) shouldBe Some(21.9)
    }

    it("should implement films zip with List") {
      CollectionTools.zip(List.empty[Film], List(3, 5)) shouldBe Nil
      CollectionTools.zip(kurosawaFilms, List.empty) shouldBe Nil
      CollectionTools.zip(kurosawaFilms, List(3, 5)) shouldBe List(
        (ran, 3),
        (rashomon, 5)
      )
    }

    it("should implement fill method") {
      CollectionTools.fillList(0)(ran) shouldBe Nil
      CollectionTools.fillList(1)(ran) shouldBe List(ran)
      CollectionTools.fillList(3)(ran) shouldBe List(ran, ran, ran)
    }

  }

}