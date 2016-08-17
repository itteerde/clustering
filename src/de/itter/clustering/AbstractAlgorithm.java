package de.itter.clustering;

public class AbstractAlgorithm implements Algorithm {

	private VectorAdapter vectorAdapter = null;

	public VectorAdapter getVectorAdapter() {
		return vectorAdapter;
	}

	public void setVectorAdapter(VectorAdapter vectorAdapter) {
		this.vectorAdapter = vectorAdapter;
	}
}
