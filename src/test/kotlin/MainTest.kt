package com.github.manoharan_ajay_anand

import com.github.manoharan_ajay_anand.tree.Tree
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun testInsert() {
        val tree = Tree()
        val data: List<Int> = listOf(1, 5, 2, 9, 3, 10, 4, 6, 8, 7)
        data.forEach { tree.insert(it) }
        val traverse = tree.traverse()
        val sorted = data.sorted()
        for ((expected, actual) in sorted.zip(traverse)) {
            assertEquals(expected, actual)
        }
    }
}