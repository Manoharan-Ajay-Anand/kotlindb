package com.github.manoharan_ajay_anand.tree

class Node(private val key: Int) {
    var left: Node? = null
    var right: Node? = null

    enum class SubTree {
        LEFT,
        RIGHT
    }

    private fun setNode(subTree: SubTree, node: Node) {
        if (subTree == SubTree.LEFT) {
            left = node
        } else {
            right = node
        }
    }

    fun insert(value: Int) {
        if (value <= key) {
            left?.insert(value) ?: setNode(SubTree.LEFT, Node(value))
        } else {
            right?.insert(value) ?: setNode(SubTree.RIGHT, Node(value))
        }
    }

    fun traverse(): List<Int> {
        val list = mutableListOf<Int>()
        left?.traverse()?.also { list.addAll(it) }
        list.add(key)
        right?.traverse()?.also { list.addAll(it) }
        return list
    }
}