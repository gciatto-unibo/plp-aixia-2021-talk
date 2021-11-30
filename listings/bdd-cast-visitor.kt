/**
 * Example of usage:
 *
 * val castVisitor = CastVisitor<...>()
 * castVisitor.onTerminal = {
 *     it -> // Handle terminal node case
 * }
 * castVisitor.onVariable = {
 *     it -> // Handle variable node case
 * }
 * bdd.accept(castVisitor)
 * */
internal class CastVisitor<T: Comparable<T>, E> :
        BinaryDecisionDiagramVisitor<T, E> {
    var onTerminal: (
        (o: BinaryDecisionDiagram.Terminal<T>) -> E
    )? = null
    
    var onVariable: (
        (o: BinaryDecisionDiagram.Variable<T>) -> E
    )? = null

    override fun visit(
        node: BinaryDecisionDiagram.Terminal<T>
    ): E = onTerminal!!(node)
    
    override fun visit(
        node: BinaryDecisionDiagram.Variable<T>
    ): E = onVariable!!(node)
}