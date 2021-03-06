package io.github.fabriccommunity.everything.api.functional;


public interface ThrowingBiFunction<A, B, C> extends java.util.function.BiFunction<A, B, C> {
	C applyThrowing(A a, B b) throws Throwable;
	@Override default C apply(A a, B b) {
		try {
			return this.applyThrowing(a, b);
		} catch(Throwable t5432) {
			throw new RuntimeException(t5432);
		}
	}
}