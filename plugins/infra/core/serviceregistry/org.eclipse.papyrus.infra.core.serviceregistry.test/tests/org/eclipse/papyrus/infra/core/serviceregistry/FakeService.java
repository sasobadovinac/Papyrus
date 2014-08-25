package org.eclipse.papyrus.infra.core.serviceregistry;



/**
 * Fake service for testing purpose.
 *
 * @author cedric dumoulin
 *
 */
public class FakeService implements IService {


	static public TestTrace trace = new TestTrace();

	static int count = 0;

	public String name = "name" + count++;


	/**
	 *
	 * Constructor.
	 *
	 */
	public FakeService() {
		trace.addTrace(name, "create");
	}

	/**
	 * Constructor.
	 *
	 * @param name
	 */
	public FakeService(String name) {
		this.name = name;
		trace.addTrace(name, "create");
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the trace
	 */
	static public TestTrace getTrace() {
		return trace;
	}


	/**
	 * @param trace
	 *            the trace to set
	 */
	public void setTrace(TestTrace trace) {
		FakeService.trace = trace;
	}

	@Override
	public void init(ServicesRegistry servicesRegistry) {
		trace.addTrace(name, "init", servicesRegistry);
	}

	@Override
	public void startService() {
		trace.addTrace(name, "start");
	}

	@Override
	public void disposeService() {
		trace.addTrace(name, "dispose");
	}

}
