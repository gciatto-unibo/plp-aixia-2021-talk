internal interface ProbExplanation {
    val probability: Double
    val containsAnyNotGroundTerm: Boolean
    fun not(): ProbExplanation
    infix fun and(
        that: ProbExplanation
    ): ProbExplanation
    infix fun or(
        that: ProbExplanation
    ): ProbExplanation
    fun apply(
        transformation: (ProbTerm) -> ProbTerm
    ): ProbExplanation
}
