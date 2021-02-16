fun main(args: Array<String>) = OpossumGroupGenerator(10, 100)
    .make()
    .stream()
    .forEach(::println)