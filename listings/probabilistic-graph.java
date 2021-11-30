// Java
ClausesParser clausesParser = ClausesParser.withOperators(PROBLOG_OPERATORS);
Theory probabilisticTheory = clausesParser.parseTheory("...");
Solver problogSolver = Solver.problog.solverWithDefaultBuiltins(probabilisticTheory);
Struct goal = Struct.of("path", Var.of("From"), Var.of("To"));
var si = problogSolver.solve(goal, probabilistic(SolveOptions.allLazily())).iterator();
while (si.hasNext()) {
    Solution solution = si.next();
    if (solution.isYes()) {
        System.out.printf("yes: %s with probability %g\n", solution.getSolvedQuery(), getProbability(solution));
    }
}
