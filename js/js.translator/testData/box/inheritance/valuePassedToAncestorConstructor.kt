// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1117
package foo

open class C(a: Int) {
    val b = a
}

class D(c: Int) : C(c + 2) {
}

fun box(): String {
    return if (D(0).b == 2) "OK" else "fail"
}