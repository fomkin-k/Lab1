import scala.util.Random

object RandomNumberApp {
  def main(args: Array[String]): Unit = {
    val randomNumbers: List[Int] = generateRandomNumbers(20)
    println(s"Сгенерированный список: $randomNumbers")
    val maxIndex = findMaxIndex(randomNumbers)
    val minIndex = findMinIndex(randomNumbers)
    println(s"Индекс наибольшего элемента: $maxIndex")
    println(s"Индекс наименьшего элемента: $minIndex")
  }

  // Генерации списка случайных чисел
  def generateRandomNumbers(size: Int): List[Int] = {
    val random = new Random()
    List.fill(size)(random.nextInt(100))
  }

  // Поиск индекса наибольшего элемента
  def findMaxIndex(numbers: List[Int]): Int = {
    numbers.zipWithIndex.maxBy(_._1)._2
  }

  // Поиск индекса наименьшего элемента
  def findMinIndex(numbers: List[Int]): Int = {
    numbers.zipWithIndex.minBy(_._1)._2
  }
}
