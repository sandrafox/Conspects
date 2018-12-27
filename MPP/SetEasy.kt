class Node(var N: Node, val key: Int)

val head = Node(-infinity, Node(infinity, null))

fun findWindow(key: Int): (Node, Node) {
    cur := head
	next := cur.N
	while (next.key < key) {
		cur := next
		next := cur.N
	}
	return (cur, next)
}

fun contains(key: Int): Boolean {
	(cur, next) := findWindow(key)
	return next.key = key
}

fun add(key: Int) {
	(cur, next) := findWindow(key)
	if (next.key != key) {
		cur.N := Node(key, next)
	}
}

fun remove(key: Int) {
	(cur, next) := findWindow(key)
	if (next.key = key) {
		cur.N = next.N
	}
}