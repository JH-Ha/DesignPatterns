package ch11;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		String name = "test";
		int count = 10;

        // if (args.length < 2) {
        //     System.out.println("GumballMachine <name> <inventory>");
        //     System.exit(1);
        // }

        // try {
        // 	count = Integer.parseInt(args[1]);
		// } catch (Exception e) {
		// 	e.printStackTrace();
		// 	System.exit(1);
		// }
		GumballMachine gumballMachine = new GumballMachine(name, count);

		GumballMonitor monitor = new GumballMonitor(gumballMachine);

 
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		monitor.report();
	}
}
