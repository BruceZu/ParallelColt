package cern.colt.matrix.tdouble.algo.solver;

import cern.colt.matrix.tdouble.algo.solver.preconditioner.DoubleILUT;
import cern.colt.matrix.tdouble.impl.RCMDoubleMatrix2D;

/**
 * Benchmark of DoubleCG with ILUT
 */
public class DoubleCGILUTBenchmark extends DoubleCGBenchmark {

    public DoubleCGILUTBenchmark(String arg0) {
        super(arg0);
    }

    @Override
    protected void createSolver() throws Exception {
        super.createSolver();
        M = new DoubleILUT((RCMDoubleMatrix2D) (new RCMDoubleMatrix2D(A.rows(), A.columns()).assign(A)));
    }

}