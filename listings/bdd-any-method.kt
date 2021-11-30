fun <T : Comparable<T>> BinaryDecisionDiagram<T>.any(
    predicate: (T) -> Boolean
): Boolean {
    val visitor = AnyVisitor(predicate)
    return this.accept(visitor)
}