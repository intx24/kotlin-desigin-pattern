package decorator.exercise1

fun main(args: Array<String>) {
    val b1: Display = StringDisplay("Hello, world.")
    val b2: Display = UpDownBorder(b1, '-')
    val b3: Display = SideBorder(b2, '*')
    b1.show()
    b2.show()
    b3.show()

    val v4: Display =
        FullBorder(
            UpDownBorder(
                SideBorder(
                    UpDownBorder(
                        SideBorder(
                            StringDisplay("test"),
                            '*'
                        ),
                        '='
                    ),
                    '|'
                ),
                '/'
            ),
        )
    v4.show()
}
