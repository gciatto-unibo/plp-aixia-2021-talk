object NewLine: PredicateWithoutArguments
        .NonBacktrackable<ExecutionContext>("nl") {
    override fun Solve
        .Request<ExecutionContext>
        .computeOne(): Solve.Response {
            return context.outputChannels.current.let {
                if (it == null) {
                    replyFail()
                } else {
                    it.write("\n")
                    replySuccess()
                }
            }
    }
}