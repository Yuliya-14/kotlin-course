package org.example.lessons.lesson04.homework

class Datatypes {

    // 1. Целое число, помещается в Int
    val v1: Int = 42

    // 2. Long
    val v2: Long = 98765432123456789L

    // 3. Float
    val v3: Float = 23.45f

    // 4. Double
    val v4: Double = 0.123456789

    // 5. String
    val v5: String = "Kotlin & Java"

    // ОШИБКА: FALSE написано заглавными буквами.
    // val v6: Boolean = FALSE
    val v6: Boolean = false

    // 7. Char
    val v7: Char = 'c'

    // 8. Int
    val v8: Int = 500

    // 9. Long
    val v9: Long = 4294967296L

    // 10. Float
    val v10: Float = 18.0f

    // 11. Double
    val v11: Double = -0.001

    // 12. String
    val v12: String = "OpenAI"

    // 13. String
    val v13: String = "true"

    // 14. List<Int>
    val v14: List<Int> = listOf(3, 14)

    // 15. Char
    val v15: Char = '9'

    // 16. Int
    val v16: Int = 2048

    // 17. Long
    val v17: Long = 10000000000L

    // 18. Set<String>
    val v18: Set<String> = setOf("OpenAI", "Quantum Computing")

    // 19. Float
    val v19: Float = 5.75f

    // ОШИБКА: обратные кавычки `...` в Kotlin используются для экранирования имён (идентификаторов), а не для строк.
    // Здесь нужно было бы "1.414" (строка) или 1.414 (Double). `1.414` как значение — не скомпилируется.
    // val v20: ??? = `1.414`

    // 21. String
    val v21: String = "Artificial Intelligence"

    // 22. Array<Any> — массив из разных типов (Char и String)
    val v22: Array<Any> = arrayOf('x', "A")

    // 23. String
    val v23: String = "Android Studio"

    // 24. Char (одинарные кавычки)
    val v24: Char = '@'

    // 25. Int
    val v25: Int = 1024

    // 26. Long
    val v26: Long = 1234567890123L

    // 27. Float
    val v27: Float = 10.01f

    // 28. Double
    val v28: Double = -273.15

    // 29. String
    val v29: String = "SpaceX"

    // ОШИБКА: FALSE заглавными буквами. В Kotlin только true/false
    // val v30: Boolean = FALSE

    // 31. Double
    val v31: Double = 0.007

    // ОШИБКА: использованы «типографские» (фигурные) кавычки “...” вместо обычных "..."
    // val v32: String = “🤯”

    // 33. Map<String, Int>
    val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)

    // ОШИБКА: использованы «типографские» (фигурные) одинарные кавычки ‘...’;
    // должен быть тип String
    // val v34: String = "65535"

    // 35. Long
    val v35: Long = 72057594037927935L

    // 36. Float
    val v36: Float = 2.71828f

    // 37. Double
    val v37: Double = 101.0101

    // 38. String
    val v38: String = "Quantum Computing"

    // 39. Map<Int, String>
    val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")

    // 40. Char
    val v40: Char = 'x'

    // 41. Int
    val v41: Int = 314

    // 42. Long
    val v42: Long = 123456789123456789L

    // 43. Float
    val v43: Float = 6.626f

    // ОШИБКА: TRUE заглавными буквами. В Kotlin только true/false
    // val v44: Boolean = TRUE

 // ЧАСТЬ 2

    // 1. Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
    val mediumLetter: Char = 'A'

    // 2. Хранить количество ложек сахара, которые я кладу в одну чашку чая. (или Int)
    val sugarSpoons: Byte = 2

    // 3. Хранить список расходов на доставку еды, чтобы ещё раз убедиться, что готовить было дешевле.
    val deliveryExpenses: List<Double> = listOf(299.0, 450.5, 120.0)

    val deliveryExpensesNew: Map<String, Double> = mapOf(
        "Пицца" to 599.0,
        "Суши" to 850.5,
        "Бургеры" to 420.0
    )

    // 4. Хранить длину очереди в столовой до миллиардной доли сантиметра.
    val queueLength: Double = 123.456789012

    // 5. Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
    val isBugClosed: Boolean = true

    // 6. Хранить количество свистков чайника за день.
    val kettleWhistles: Int = 15

    // 7. Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
    val catKeyPresses: Long = 9999999999L

    // 8. Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
    val starCountAttempts: Long = 1000000000000L

    // 9. Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
    val airMass: Double = 1234.5678

    // 10. Хранить словарь «название стартапа → сумму потерь инвесторов».
    val startupLosses: Map<String, Double> = mapOf(
        "WeWork" to 4000000000.0,
        "Theranos" to 700000000.0
    )

    // 11. Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
    val ticketCloser: String = "починилось само"

    // 12. Хранить список тем для митингов, которые на самом деле никому не нужны.
    val uselessMeetingTopics: List<String> = listOf(
        "Обсуждение обсуждения",
        "Синхронизация синхронизации",
        "Митинг о том, что митингов слишком много"
    )
}