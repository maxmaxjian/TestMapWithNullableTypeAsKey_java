
class NullableType {
}

fun main(args: Array<String>) {
    var var1: NullableType? = null
    var var2: NullableType? = NullableType()
    var var3: NullableType? = null

    var map = LinkedHashMap<NullableType?, String>()
    map.put(var1, "one")
    map.put(var2, "two")
    map.put(var3, "three")

    for (entry in map) {
        println("${entry.key}: ${entry.value}")
    }
}

