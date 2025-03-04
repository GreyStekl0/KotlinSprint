package lessons.lesson5

fun main() {
    val registeredUsername = "Zaphod"
    val registeredPassword = "PanGalactic"

    println(
        "Внимание, пассажир. Моя обязанность, как обычно, незавидная, " +
            "- приветствовать вас на борту корабля \"Heart of Gold\". " +
            "[вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, " +
            "чтобы мы могли приступить к процессу входа. Я всегда готов служить, " +
            "хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. " +
            "[вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные...",
    )

    print("Имя пользователя: ")
    val username = readln()

    if (username != registeredUsername) {
        println("Пользователь не зарегистрирован. Пожалуйста, зарегистрируйтесь.")
        return
    }

    print("Пароль: ")
    val password = readln()

    if (password == registeredPassword) {
        println(
            "[вздыхает...] Ваши данные проверены, и о, чудо, они верны... " +
                "Пользователь \"$username\", вам разрешено входить на борт корабля \"Heart of Gold\". " +
                "Хотя мне всё равно... Ну вперед, войдите... " +
                "Если вам так уж надо, в конце концов... [меланхолический вздох...] " +
                "Надеюсь, вам понравится пребывание здесь больше, чем мне.",
        )
    } else {
        println("Неверный пароль. Доступ запрещен.")
    }
}
