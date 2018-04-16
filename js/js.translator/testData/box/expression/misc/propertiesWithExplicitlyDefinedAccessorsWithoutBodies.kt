// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1113
package foo


class A() {
    private var c: Int = 3
        private get
        private set

    fun f() = c + 1
}

fun box(): String {
    val result = A().f()
    if (result != 4) return "fail: $result"
    return "OK"
}