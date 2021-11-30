internal class AnyVisitor<T: Comparable<T>>(
    private val predicate: (T) -> Boolean,
) : BinaryDecisionDiagramVisitor<T, Boolean> {

    override fun visit(
        node: BinaryDecisionDiagram.Terminal<T>
    ): Boolean = false

    override fun visit(
        node: BinaryDecisionDiagram.Variable<T>
    ): Boolean {
        var result = predicate(node.value)
        if (!result) result = node.low.accept(this)
        if (!result) result = node.high.accept(this)
        return result
    }
}