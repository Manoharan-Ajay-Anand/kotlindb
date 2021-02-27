package com.github.manoharan_ajay_anand.tree

class Tree {
    private var rootNode: Node = Node()

    fun insert(value: Int) {
        rootNode.insert(value)
    }

    fun traverse(): List<Int> {
        return rootNode.traverse()
    }
}