package com.github.manoharan_ajay_anand.tree

class Node(private var key: Int? = null) {
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
        key?.also {
            if (value <= it) {
                left?.insert(value) ?: setNode(SubTree.LEFT, Node(value))
            } else {
                right?.insert(value) ?: setNode(SubTree.RIGHT, Node(value))
            }
        } ?: run {
            key = value
        }
    }

    fun traverse(): List<Int> {
        val list = mutableListOf<Int>()
        left?.traverse()?.also { list.addAll(it) }
        key?.also { list.add(it) }
        right?.traverse()?.also { list.addAll(it) }
        return list
    }
}