// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1129
package foo

interface Test {
    fun addFoo(s: String): String {
        return s + "FOO"
    }
}

interface ExtendedTest : Test {
    fun hooray(): String {
        return "hooray"
    }
}

class A() : ExtendedTest {
    fun eval(): String {
        return addFoo(hooray());
    }
}

fun box() = if (A().eval() == "hoorayFOO") "OK" else "fail"