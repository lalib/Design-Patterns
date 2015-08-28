package factorymethod;

/**
 * developed by BURHAN ARAS
 */
public class CpuFactory {

	public static CPU produce(CpuTypes type) {
		switch (type) {
		case A4:
			return new A4Processor();
		case CORTEXA5:
			return new CortexA5Processor();

		default:
			return new A4Processor();

		}

	}

}
