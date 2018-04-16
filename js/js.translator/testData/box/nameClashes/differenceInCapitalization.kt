// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1110
package foo

class Box<T>(t: T) {
    var value = t
}

fun box(): String {
    val box: Box<Int> = Box<Int>(1)
    return if (box.value == 1) "OK" else "fail"
}
