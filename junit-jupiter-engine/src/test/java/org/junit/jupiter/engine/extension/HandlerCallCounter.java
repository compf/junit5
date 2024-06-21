class HandlerCallCounter {
	private int beforeAllCalls;
	private int beforeEachCalls;
	private int afterEachCalls;
	private int afterAllCalls;

	public HandlerCallCounter() {
		reset();
	}

	public void reset() {
		this.beforeAllCalls = 0;
		this.beforeEachCalls = 0;
		this.afterEachCalls = 0;
		this.afterAllCalls = 0;
	}

	public void incrementBeforeAllCalls() { beforeAllCalls++; }
	public void incrementBeforeEachCalls() { beforeEachCalls++; }
	public void incrementAfterEachCalls() { afterEachCalls++; }
	public void incrementAfterAllCalls() { afterAllCalls++; }

	public int getBeforeAllCalls() { return beforeAllCalls; }
	public int getBeforeEachCalls() { return beforeEachCalls; }
	public int getAfterEachCalls() { return afterEachCalls; }
	public int getAfterAllCalls() { return afterAllCalls; }
}