package decorator.sample

fun main(args: Array<String>) {
    val b1: Display = StringDisplay("Hello, world.")
    val b2: Display = SideBorder(b1, '#')
    val b3: Display = FullBorder(b2)
    b1.show()
    b2.show()
    b3.show()

    val v4: Display = SideBorder(
        FullBorder(
            FullBorder(
                SideBorder(
                    FullBorder(
                        StringDisplay("test")
                    ),
                    '*'
                )
            )
        ),
        '/'
    )
    v4.show()
}
