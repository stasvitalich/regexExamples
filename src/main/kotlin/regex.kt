fun main(){

    val regex1 = Regex("Cat") // Первый метод через конструктор


    val first = "Dog"
    val second = "Cat"
    val third = "Cow"

    var regex2 = third.toRegex() // Второй метод через преобразование.
    // Но его можно использовать только после объявления значений.

    println(regex1.matches(first))
    println(regex1.matches(second))
    println(regex1.matches(third))
    println()
    println(regex2.matches(first))
    println(regex2.matches(second))
    println(regex2.matches(third))
    println(regex1.matches(regex2.toString()))
    println("---------------------------------")

    var regex3 = Regex("cat.") // Такой паттерн будет искать слово в строке с любым символом после
    // самого слова. Ниже приведены примеры.
    // Это может быть удобно, когда хочешь найти конкретное слово в разных его формах.

    var animal1 = "cat"
    var animal2 = "cat!"
    var animal3 = "cat "
    var animal4 = "cat?"
    var animal5 = "cat\n"

    println(regex3.matches(animal1))
    println(regex3.matches(animal2))
    println(regex3.matches(animal3))
    println(regex3.matches(animal4))
    println(regex3.matches(animal5))
    println("---------------------------------")

    var regex4 = Regex("cats?") //  Знак вопроса означает “предыдущий символ или ничего”.

    var an1 = "cat"
    var an2 = "cats"
    var an3 = "cats!"
    var an4 = "cats "
    var an5 = "cat "
    var an6 = "cat!"
    var an7 = "cot"

    println(regex4.matches(an1))
    println(regex4.matches(an2))
    println(regex4.matches(an3))
    println(regex4.matches(an4))
    println(regex4.matches(an5))
    println(regex4.matches(an6))
    println(regex4.matches(an7))
    println()

    var regex5 = Regex("cats.?") // Комбинация точки с вопросом означает, что regex "будет искать"
    // полное совпадение с назначенным словом и любым символом после.

    println(regex5.matches(an1))
    println(regex5.matches(an2))
    println(regex5.matches(an3))
    println(regex5.matches(an4))
    println(regex5.matches(an5))
    println(regex5.matches(an6))
    println(regex5.matches(an7))

    println("---------------------------------")

    val regex6 = Regex("cat\\?") // Двойной слэш помогает избежать конфликта, если мы хотим найти
    // искомое слово со знаком вопроса или точки, например.

    var animalOne = "cat"
    var animalTwo = "cat?"
    var animalThree = "cats?"

    println(regex6.matches(animalOne))
    println(regex6.matches(animalTwo))
    println(regex6.matches(animalThree))
}