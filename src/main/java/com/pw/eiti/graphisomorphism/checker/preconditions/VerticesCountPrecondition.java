package com.pw.eiti.graphisomorphism.checker.preconditions;

import com.pw.eiti.graphisomorphism.model.Graph;

public class VerticesCountPrecondition implements Predocndition {
	@Override
	public boolean fullfils(final Graph a, final Graph b) {
		return a.getVerticesCount() == b.getVerticesCount();
	}
}