// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1109
// FILE: a.kt
package foo

fun f() = 3;


// FILE: b.kt
package foo

fun box() = if (f() == 3) "OK" else "fail"