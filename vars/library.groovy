def call(Map config = [:]) {
    String test = config.test
    println(test)

    return config.test
}
