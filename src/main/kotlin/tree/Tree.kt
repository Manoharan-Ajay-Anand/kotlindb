package com.github.manoharan_ajay_anand.tree

class Tree {
    private var rootNode: Node? = null

    fun insert(value: Int) {
        rootNode?.insert(value) ?: run { rootNode = Node(value) }
    }

    fun traverse(): List<Int> {
        return rootNode?.traverse() ?: listOf()
    }
}