internal interface ClauseMapper {
    fun isCompatible(clause: Clause): Boolean
    fun apply(clause: Clause): List<Clause>
}