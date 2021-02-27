package com.github.manoharan_ajay_anand

import com.github.manoharan_ajay_anand.tree.Tree
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun testInsert() {
        val tree = Tree()
        listOf(1, 5, 2, 9, 3, 10, 4, 6, 8, 7).forEach { tree.insert(it) }
        val sorted = tree.traverse()
        sorted.forEach { println(it) }
    }
}