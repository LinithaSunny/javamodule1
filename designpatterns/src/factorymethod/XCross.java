package factorymethod;

import factorymethod.Vehicle;

public class XCross implements Vehicle {

	@Override
	public void start() {

		System.out.println("Started..." + getClass());

	}

	@Override
	public void stop() {

		System.out.println("Stopped..." + getClass());

	}

	@Override
	public void honk() {

		System.out.println("Pom pom..." + getClass());

	}

	@Override
	public void move() {

		System.out.println("its moving..." + getClass());
	}

}
